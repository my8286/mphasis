import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
	
		
		User e=new User();
		e.setEmail(email);
		e.setPassword(password);
		
		
		boolean status=UserDao.loginUser(e);
		if(status==true){
			out.print("<p>Record saved successfully!</p>"+password+""+email);
			response.sendRedirect("user.html");
		}else{
			out.println("Sorry! login unsuccessful try again "+password+"  "+email+"  " +status);
		}
		
		out.close();
	}

}
