

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("name");
		int id=Integer.parseInt(req.getParameter("id"));
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		//String confirm=req.getParameter("confirm");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
			PreparedStatement st=con.prepareStatement("insert into mp192reg values(?,?,?,?)");
			st.setInt(1,id);
			st.setString(2,name);
			st.setString(3,username);
			st.setString(4,password);
			st.execute();
			pw.println("Row Inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
