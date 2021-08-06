import java.util.*;
import java.sql.*;

public class BookDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bookinguser","aspire123");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public static int save(Book e){
		int status=0;
		try{
			Connection con=BookDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into booking(booking_id,passenger_id,flight_id,booking_date) values (booking_seq.nextval,?,?,?)");
			ps.setInt(1,e.getPassengerId());
			ps.setInt(2,e.getFlightId());
			ps.setString(3,e.getBookingDate());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	
}