package org.Package1;

public class Employee {
	String name;
	int id;
	int salary;
	String add;
	Employee(String name,int id,int salary,String add){
		this.name=name;
		this.id=id;
		this.add=add;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("id="+id+" name="+name+" salary="+salary+" add="+add);
	}
	
//	public static void main(String args[])
//	{
//		Employee[] arr=new Employee[3];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=new Employee();
//			arr[i].input();
//		}	
//		for(int i=0;i<arr.length;i++)
//			arr[i].display();
//	}
}
