import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String subject=request.getParameter("subject");
		String email=request.getParameter("email");
		String	message=request.getParameter("message");
		String phone=request.getParameter("phone");
	
		
		Contact e=new Contact(name,email,phone,subject,message);
		
		
		int status=UserDao.saveContact(e);
		if(status>0){
			out.print("<p>Record saved successfully!</p>");
			
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
