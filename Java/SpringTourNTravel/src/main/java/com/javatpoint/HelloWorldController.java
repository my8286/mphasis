package com.javatpoint;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

  
@Controller  
public class HelloWorldController {  
      
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) throws IOException 
    {  
    	//PrintWriter pw=res.getWriter();
    	res.setContentType("text/html");
    	int empno=Integer.parseInt(request.getParameter("t1"));
    	
    	String submit=request.getParameter("submit");
    	String msg="";
    	if(submit.equals("add"))
    	{
    		String name=request.getParameter("t2");
        	String password=request.getParameter("t3");
        	String phone=request.getParameter("t4");
        	String email=request.getParameter("t5");
        	String designation=request.getParameter("t6");
        	String city=request.getParameter("t7");
        	int salary=Integer.parseInt(request.getParameter("t8"));
        	
    		Emp e=new Emp(empno,salary,name,password,email,city,designation,phone);
    		EmpDao.save(e);
    		msg="Data inserted successfully !";
    	}
    	else if(submit.equals("update"))
    	{
    		String name=request.getParameter("t2");
        	String password=request.getParameter("t3");
        	String phone=request.getParameter("t4");
        	String email=request.getParameter("t5");
        	String designation=request.getParameter("t6");
        	String city=request.getParameter("t7");
        	int salary=Integer.parseInt(request.getParameter("t8"));
    		Emp e=new Emp(empno,salary,name,password,email,city,designation,phone);
    		EmpDao.update(e);
    		msg="Data Updated successfully !";
    	}
    	else if(submit.equals("delete"))
    	{
    		EmpDao.delete(empno);
    		msg="Data deleted successfully !";
    	}
    	else if(submit.equals("display"))
    	{
    		
    		List<Emp> list=EmpDao.getAllEmployees();
    		return new ModelAndView("displaypage", "list",list); 
    	}
    	  
        return new ModelAndView("hellopage", "message",msg);  
        
    }
}