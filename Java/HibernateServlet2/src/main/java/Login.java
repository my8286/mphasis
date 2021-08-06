import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import javax.servlet.annotation.*;
@WebServlet("/Login")
public class Login extends HttpServlet
{	
	
	public void service(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException
	{		try
		{	res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			int empno=Integer.parseInt(req.getParameter("empno"));
			String name=req.getParameter("name");
			String address=req.getParameter("address");
			String designation=req.getParameter("designation");
			String contact=req.getParameter("contact");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			Configuration cfg=new Configuration();
			SessionFactory sf=cfg.configure().buildSessionFactory();
			Session ss=sf.openSession();
			mypojo pojo=new mypojo();
			pojo.setEmpno(empno);
			pojo.setName(name);
			pojo.setAddress(address);
			pojo.setDesignation(designation);
			pojo.setContact(contact);
			pojo.setEmail(email);
			pojo.setPassword(password);
			Transaction tx=ss.beginTransaction();
			ss.save(pojo);
			tx.commit();
			ss.close();
			res.sendRedirect("success.html");
		}
		catch(Exception ae)
		{		}	}}


