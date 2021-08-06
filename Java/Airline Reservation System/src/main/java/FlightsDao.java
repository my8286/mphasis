import java.util.*;
import java.sql.*;

public class FlightsDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bookinguser","aspire123");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public static List<Flights> getFlights(String from,String to){
		List<Flights> list=new ArrayList<>();
		
		try{
			Connection con=FlightsDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select f1.*,f2.fare from flights f1 inner join fare f2 on f1.flight_id=f2.flight_id");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Flights e=new Flights();
				e.setFlight_id(rs.getInt(1));
				e.setFlight_no(rs.getInt(2));
				e.setDeparture(rs.getString(3));
				e.setArrival(rs.getString(4));
				e.setOrigin(rs.getString(5));
				e.setDestination(rs.getString(6));
				e.setFare(rs.getString(7));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
