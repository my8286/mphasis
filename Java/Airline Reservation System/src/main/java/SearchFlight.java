

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;


@WebServlet("/SearchFlight")
public class SearchFlight extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		
		List<Flights> flights=FlightsDao.getFlights(from, to);
		
		request.setAttribute("flights", flights);
		
		RequestDispatcher rd=request.getRequestDispatcher("displayflight.jsp");
		
		rd.forward(request, response);
			
	}

	
}
