package JdbcExample;
import java.sql.*;
import java.util.Scanner;
public class FirstJdbc 
{
	public static void main(String[] args) throws Exception 
	{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
//	    Statement st=con.createStatement();
//	    st.execute("insert into employee values(8,'vijay',8765,'SE')");
//	    System.out.println("the row inserted successfully");
	    PreparedStatement st=con.prepareStatement("insert into employee values (?,?,?,?)");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter id:");
	    int id=sc.nextInt();
	    System.out.println("Enter name:");
	    String name=sc.next();
	    System.out.println("Enter salary:");
	    int salary=sc.nextInt();
	    System.out.println("Enter des:");
	    String des=sc.next();
	    st.setInt(1,id);
	    st.setString(2,name);
	    st.setInt(3,salary);
	    st.setString(4,des);
	    st.execute();
	    System.out.println("the row inserted successfully");
	    
	}    
}