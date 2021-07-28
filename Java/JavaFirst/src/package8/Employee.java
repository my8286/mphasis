package package8;
import java.util.*;

public class Employee {
	String name;
	int salary;
	String designation;
	Bank bank;
	Address address;
	public Employee(String name, int salary, String designation, Bank bank, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.bank = bank;
		this.address = address;
	}

	@Override
	public String toString() {
		return "\n Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + ", bank=" + bank
				+ ", address=" + address + "]";
	}




	public static void main(String[] args) {
		Map<Integer,Employee> map=new HashMap<>();
		Address address1=new Address("wadala","mumbai","maharashtra",400037);
		Bank bank1=new Bank(111,10000,"manish");
		Employee emp1=new Employee("manish",100000,"SE",bank1,address1);
		map.put(1, emp1);
		Address address2=new Address("Dadar","mumbai","maharashtra",400036);
		Bank bank2=new Bank(345,99900,"Navin");
		Employee emp2=new Employee("Navin",200000,"Analyst",bank2,address2);
		map.put(2, emp2);
		Address address3=new Address("Hinjwadi","pune","maharashtra",500034);
		Bank bank3=new Bank(551,67000,"Ashish");
		Employee emp3=new Employee("Ashish",67000,"SD1",bank3,address3);
		map.put(3,emp3);
		
		for(Map.Entry<Integer,Employee> set:map.entrySet())
		{
			System.out.println(set.getValue());
		}
		
	}	
	

}
