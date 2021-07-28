package package2;

public class Employee {
	int id;
	String name;
	int salary;
	Address address;
	Employee(int id,String name,int salary,Address address){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	void display()
	{
		System.out.println("id :"+id+" name:"+name+" salary:"+salary);
		System.out.println("address: "+address);
	}

}
