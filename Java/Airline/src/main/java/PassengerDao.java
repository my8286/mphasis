import java.util.*;
import java.sql.*;

public class PassengerDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bookinguser","aspire123");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Passenger e){
		int status=0;
		try{
			Connection con=PassengerDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Passenger(id,first_name,last_name,gender,contact,email,password) values (passenger_seq.nextval,?,?,?,?,?,?)");
			ps.setString(1,e.getFirstname());
			ps.setString(2,e.getLastname());
			ps.setString(3,e.getGender());
			ps.setString(4,e.getContact());
			ps.setString(5,e.getEmail());
			ps.setString(6,e.getPassword());
			System.out.println(e.getFirstname());
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(Passenger e){
		int status=0;
		try{
			Connection con=PassengerDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update passenger set name=?,password=?,email=?,country=?,salary=?,designation=? where id=?");
			ps.setString(1,e.getFirstname());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			
			ps.setInt(7,e.getId());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=PassengerDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from user192 where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Passenger getEmployeeById(int id){
		Passenger e=new Passenger();
		
		try{
			Connection con=PassengerDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user192 where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setFirstname(rs.getString(2));
				e.setLastname(rs.getString(3));
				e.setGender(rs.getString(4));
				e.setContact(rs.getString(5));
				e.setEmail(rs.getString(5));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Passenger> getAllEmployees(){
		List<Passenger> list=new ArrayList<Passenger>();
		
		try{
			Connection con=PassengerDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user192");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Passenger e=new Passenger();
				e.setId(rs.getInt(1));
				e.setFirstname(rs.getString(2));
				e.setLastname(rs.getString(3));
				e.setGender(rs.getString(4));
				e.setContact(rs.getString(5));
				e.setEmail(rs.getString(5));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
