import java.util.*;
import java.sql.*;

public class UserDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","searchuser","aspire123");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(User e){
		int status=0;
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into user192(id,name,password,email,country,phone) values (user_seq.nextval,?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			ps.setString(5,e.getPhone());
			
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int saveContact(Contact e){
		int status=0;
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into user192(name,phone,email,subject,message) values (?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPhone());
			ps.setString(3,e.getGmail());
			ps.setString(4,e.getSubject());
			ps.setString(5,e.getMessage());
			
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(User e){
		int status=0;
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update user192 set name=?,password=?,email=?,country=?where id=?");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			ps.setInt(5,e.getId());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from user192 where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static boolean loginUser(User e){
	
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user192 where email=? and password=?");
			ps.setString(1,e.getEmail());
			ps.setString(2,e.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return false;
	}
	public static List<User> getAllUserloyees(){
		List<User> list=new ArrayList<User>();
		
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user192");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				User e=new User();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
