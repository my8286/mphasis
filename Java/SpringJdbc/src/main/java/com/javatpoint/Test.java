package com.javatpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
//		int status=dao.saveEmployee(new Employee(106,"Manish",45000));
//		System.out.println(status);
		
//		int status1=dao.updateEmployee(new Employee(105,"Sonoo",15000));
//		System.out.println(status1);
		
		
		Employee e=new Employee();
		e.setId(105);
		int status=dao.deleteEmployee(e);
		System.out.println(status);
		
	}

}
