package package6;
import java.util.*;
class Employee{
	int empno;
	String name;
	String des;
	int salary;
	public Employee(int empno, String name, String des, int salary) {
		this.empno = empno;
		this.name = name;
		this.des = des;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[empno=" + empno + ", name=" + name + ", des=" + des + ", salary=" + salary + "]";
	}
}

public class Javacollection {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		Employee emp1=new Employee(1,"Manish","SE",100000);
		Employee emp2=new Employee(2,"Navin","Analyst",200000);
		list.add(emp1);
		list.add(emp2);
		for(Employee emp:list)
			System.out.println(emp);
	}
	

}
