package com.mypackage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;


public class BankDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean save(Bank e)
	{
		String query="insert into bank values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				ps.setInt(1,e.getAccno());
				ps.setString(2,e.getName());
				ps.setInt(3,e.getBalance());
				
				return ps.execute();
				
			}
		});
	}
	
	public Boolean update(Bank e)
	{
		String query="update bank set name=?, balance=? where accno=?";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				ps.setString(1,e.getName());
				ps.setInt(2,e.getBalance());
				ps.setInt(3,e.getAccno());
				
				return ps.execute();
				
			}
		});
	}
	public Boolean delete(Bank e)
	{
		String query="delete from bank where accno=?";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				ps.setInt(1,e.getAccno());
				
				return ps.execute();
				
			}
		});
	}
	
	public List<Bank> getAllBankAccount(){
		return jdbcTemplate.query("select * from bank",new RowMapper<Bank>(){
			@Override
			public Bank mapRow(ResultSet rs, int rownumber) throws SQLException {
				Bank e=new Bank();
				e.setAccno(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setBalance(rs.getInt(3));
				System.out.println(rownumber);
				return e;
			}
		});
	}


}
