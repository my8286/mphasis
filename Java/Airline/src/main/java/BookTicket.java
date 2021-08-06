

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookTicket
 */
@WebServlet("/BookTicket")
public class BookTicket extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flight_id=Integer.parseInt(request.getParameter("flight_id"));
		int passenger_id=Integer.parseInt(request.getParameter("passenger_id"));
		String date=request.getParameter("depature_date");
		PrintWriter out=response.getWriter();
		Book e=new Book();
		e.setFlightId(flight_id);
		e.setPassengerId(passenger_id);
		e.setBookingDate(date);
		
		int status=BookDao.save(e);
		if(status>0){
			out.print("<p>Record saved successfully!</p>");
			//request.getRequestDispatcher("index.html").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		}
	}
}
