import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;
@WebServlet("/Second")
public class Second extends GenericServlet 
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		Connection con=null;	
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");	
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		String c=req.getParameter("t3");
		String d=req.getParameter("t4");
		String e=req.getParameter("t5");
		String f=req.getParameter("button");
//		pw.println("<h1>The Registered data is </h1>");
//		pw.println("The empno is "+a);
//		pw.println("<br>");
//		pw.println("The name is "+b);
//		pw.println("<br>");
//		pw.println("The phone no is "+c);
//		pw.println("<br>");
//		pw.println("The salary is "+d);
//		pw.println("<br>");
//		pw.println("The dept is "+e);
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		try {
			
		   if(f.equals("Insert"))
		   {
				PreparedStatement st=con.prepareStatement("insert into mp192 values(?,?,?,?,?)");
				st.setInt(1, Integer.parseInt(a));
				st.setString(2,b);
				st.setString(3, c);
				st.setInt(4, Integer.parseInt(d));
				st.setString(5, e);
				st.execute();
				pw.println("Row Inserted");
		   }
		   else if(f.equals("Update"))
		   {
				PreparedStatement st=con.prepareStatement("Update mp192 set name=?, contact=?, salary=?, des=? where id=?");
				st.setString(1,b);
				st.setString(2, c);
				st.setInt(3, Integer.parseInt(d));
				st.setString(4, e);
				st.setInt(5, Integer.parseInt(a));
				st.execute();
				pw.println("Row Updated");
		   }
		   else if(f.equals("Delete"))
		   {
				PreparedStatement st=con.prepareStatement("Delete from mp192 where id=?");
				st.setInt(1, Integer.parseInt(a));
				st.execute();
				pw.println("Row Deleted");
		   }
		   else if(f.equals("Display"))
		   {
				PreparedStatement st=con.prepareStatement("Select * from mp192");
				ResultSet rs=st.executeQuery();
				pw.println("<center>");
				pw.println("<h1>Employee Details</h1>");
				pw.println("<table border=2>");
				pw.println("<tr>");
				pw.println("<th>Id</th><th>Name</th><th>Contact</th><th>Salary</th><th>Des</th>");
				pw.println("</tr>");
				
				while(rs.next())
				{
					pw.println("<tr>");
					pw.println("<td>"+rs.getString(1)+"</td>");
					pw.println("<td>"+rs.getString(2)+"</td>");
					pw.println("<td>"+rs.getString(3)+"</td>");
					pw.println("<td>"+rs.getString(4)+"</td>");
					pw.println("<td>"+rs.getString(5)+"</td>");
					pw.println("</tr>");
				}
				pw.println("</table>");
				pw.println("</center>");
		   }
			
		}
		catch(Exception exc)
		{
			System.out.println(exc);
		}


	}
	
}