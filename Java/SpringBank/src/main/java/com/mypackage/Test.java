package com.mypackage;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		BankDao dao=(BankDao)ctx.getBean("bdao");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option to be performed: \n 1. Insert \n 2. Update \n 3.Delete\n 4. Select\n 5. Exit ");
		int option=0;
		do {
			System.out.println("option : ");
			option=sc.nextInt();
			
			switch(option)
			{
				case 1:
					dao.save(new Bank(113,"navin",55000));
					System.out.println("inserted");
					break;
				case 2:
					dao.update(new Bank(111,"ashish",45000));
					System.out.println("updated");
					break;
				case 3:
					Bank b=new Bank();
					b.setAccno(111);
					dao.delete(b);
					System.out.println("deleted");
					break;
				case 4:
					List<Bank> list=dao.getAllBankAccount();
					
					for(Bank e:list)
						System.out.println(e);
					break;
			}
			
			
		}while(option!=5);
		sc.close();
	}

}
