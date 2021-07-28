

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Validation")
public class Validation extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			HttpSession ses=req.getSession(true);
		
			boolean flag=false;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
				PreparedStatement st=con.prepareStatement("select * from mp192reg where username=? and password=?");
				st.setString(1,username);
				st.setString(2, password);
				ResultSet rs=st.executeQuery();
				while(rs.next())
				{
					flag=true;
					ses.setAttribute("name",rs.getString(2)); 
				}
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
			if(flag==true)
			{
				res.sendRedirect("HomeServlet");
			}
			else
				res.sendRedirect("Failure.html");
	}
}
