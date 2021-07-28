package org.Package1;

import java.util.Scanner;

public class Department extends Employee{
	int deptno;
	String deptname;
	String location;
	Department(int deptno,String deptname,String location,int id,int salary,String name,String add)
	{
		super(name,id,salary,add);
		this.deptno=deptno;
		this.deptname=deptname;
		this.location=location;
	}
	void display()
	{
		System.out.println(" id:"+id+" name:"+name+" salary:"+salary+" add:"+add);
		System.out.println(" deptno:"+deptno+" deptname:"+deptname+" location:"+location);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id: ");
		int id=sc.nextInt();
		System.out.println("Enter emp name: ");
		String name=sc.next();
		System.out.println("Enter emp add: ");
		String add=sc.next();
		System.out.println("Enter emp salary: ");
		int salary=sc.nextInt();
		System.out.println("Enter emp deptno: ");
		int deptno=sc.nextInt();
		System.out.println("Enter emp deptname: ");
		String deptname=sc.next();
		System.out.println("Enter emp dept location: ");
		String location=sc.next();
		Department obj=new Department(deptno,deptname,location,id,salary,name,add);
		obj.display();
		sc.close();
	}

}
