package JdbcExample;
import java.sql.*;
import java.util.Scanner;
public class Second {
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id : ");
		int empid=sc.nextInt();
		System.out.println("Enter salary to be updated :");
		int salary=sc.nextInt();
		PreparedStatement st=con.prepareStatement("update employee set salary=? where id=?");
		st.setInt(1, salary);
		st.setInt(2, empid);
		st.execute();
		System.out.println(" updated ");
		
		
	}
}
