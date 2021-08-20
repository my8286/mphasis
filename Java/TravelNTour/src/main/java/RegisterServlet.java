import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		String phone=request.getParameter("phone");
	
		
		User e=new User(name,email,phone,password,country);
		
		
		int status=UserDao.save(e);
		if(status>0){
			response.sendRedirect("Success.jsp");
			
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
