package JdbcExample;
import java.sql.*;
import java.util.*;
public class ThirdJdbc {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	    
	    Scanner sc=new Scanner(System.in);
	    int option=0;
	    System.out.println("Enter the option for operation to be performed ");
	    System.out.println("1. Insert \n 2. Update \n 3. Delete \n 4. Select \n 5. Exit");
	    do
	    {	
	    	System.out.println("---------------------------------------------");
	    	System.out.print("option no : ");
	    	option=sc.nextInt();
	    	System.out.println();
	    	switch(option)
	    	{
	    		case 1:
	    			PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?)");
	    			System.out.println("Enter id:");
	    			st.setInt(1,sc.nextInt());
	    			System.out.println("Enter name :");
	    			st.setString(2,sc.next());
	    			System.out.println("Enter salary:");
	    			st.setInt(3,sc.nextInt());
	    			System.out.println("Enter des:");
	    			st.setString(4,sc.next());
	    			st.execute();
	    			System.out.println("Row inserted");
	    		break;
	    		case 2:
	    			PreparedStatement st3=con.prepareStatement("update employee set salary=? where id=?");
	    			System.out.println("Enter salary to be updated:");
	    			st3.setInt(1,sc.nextInt());
	    			System.out.println("Enter emp id where value to be updated:");
	    			st3.setInt(2,sc.nextInt());
	    			st3.execute();
	    			System.out.println("Row updated");
	    			break;
	    		case 3:
	    			PreparedStatement st4=con.prepareStatement("delete employee where id=?");
	    			
	    			System.out.println("Enter emp id for deleting row:");
	    			st4.setInt(1,sc.nextInt());
	    			st4.execute();
	    			System.out.println("Row deleted");
	    			break;
	    			
	    		case 4:
	    			Statement st2=con.createStatement();
	    			ResultSet result=st2.executeQuery("Select * from employee");
	    			System.out.println("------------------------------------------------");
	    			while(result.next())
	    			{
	    				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3)+" "+result.getString(4));
	    			}
	    			break;
	    	}
	    }while(option!=5);
	    
	}
}
