import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Passenger e=new Passenger();
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setGender(gender);
		e.setContact(contact);
		e.setEmail(email);
		e.setPassword(password);
		System.out.println(lastname+"   "+e.getLastname());
		int status=PassengerDao.save(e);
		if(status>0){
			out.print("<p>Record saved successfully!</p>");
			//request.getRequestDispatcher("index.html").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
