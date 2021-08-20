package com.javatpoint;
import java.util.*;
import java.sql.*;

public class EmpDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bookinguser","aspire123");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Emp e){
		int status=0;
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee(empno,name,password,email,address,salary,designation,contact) values (employee_seq.nextval,?,?,?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCity());
			ps.setInt(5,e.getSalary());
			ps.setString(6,e.getDesignation());
			ps.setString(7,e.getContact());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(Emp e){
		int status=0;
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update employee set name=?,password=?,email=?,address=?,salary=?,designation=?,contact=? where empno=?");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCity());
			ps.setInt(5,e.getSalary());
			ps.setString(6,e.getDesignation());
			ps.setString(7,e.getContact());
			ps.setInt(8,e.getId());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int delete(int empno){
		int status=0;
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from employee where empno=?");
			ps.setInt(1,empno);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Emp getEmployeeById(int id){
		Emp e=new Emp();
		
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee where empno=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCity(rs.getString(5));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Emp> getAllEmployees(){
		List<Emp> list=new ArrayList<Emp>();
		
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee	");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDesignation(rs.getString(3));
				e.setCity(rs.getString(4));
				e.setContact(rs.getString(5));
				e.setEmail(rs.getString(6));
				e.setPassword(rs.getString(7));
				e.setSalary(rs.getInt(8));
	
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
