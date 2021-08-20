package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
 
@Controller  
public class HelloWorldController {  
      
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        int number1=Integer.parseInt(request.getParameter("t1"));
        int number2=Integer.parseInt(request.getParameter("t2"));
        String key=request.getParameter("t3");
        
        if(key.equals("add"))
       {  
        int message = (number1+ number2);  
        return new ModelAndView("sol", "message", message);  
        }  
          if (key.equals("sub"))
        {  
         int message = ((number1)-(number2));  
         return new ModelAndView("sol", "message", message);  
         }
        if(key.equals("mul"))
        {  
         int message = (number1)*(number2);  
         return new ModelAndView("sol", "message", message);  
         }
        if(key.equals("div"))
        {  
         int message = (number1/number2);  
         return new ModelAndView("sol", "message", message);  
         }
        else{  
            return new ModelAndView("error", "message","Sorry, Entry error");  
        }  
    }  
      
}  