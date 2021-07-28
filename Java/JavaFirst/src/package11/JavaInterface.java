package package11;
interface Employee{
	public void inputEmp(int empno,String name,String address);
	public void displayDetails();
}

interface Dept{
	public void inputDept(int deptno,String deptname,String loc);
}

public class JavaInterface implements Employee, Dept {
	int empno;
	String name;
	String address;
	int deptno;
	String deptname;
	String loc;
	public void inputEmp(int empno,String name,String address)
	{
		this.empno=empno;
		this.name=name;
		this.address=address;
	}
	public void inputDept(int deptno,String deptname,String loc)
	{
		this.deptno=deptno;
		this.deptname=deptname;
		this.loc=loc;
	}
	public void displayDetails()
	{
		System.out.println(" empno: "+empno+" name: "+name+" address: "+address+" deptno: "+ deptno+" deptname:"+deptname+" loc: "+loc);
	}
	
	public static void main(String[] args) {
		JavaInterface obj1=new JavaInterface();
		JavaInterface obj2=new JavaInterface();
		obj1.inputEmp(1, "manish","wadala");
		obj2.inputEmp(2, "navin","pune");
		
		obj1.inputDept(123, "IT", "pune");
		obj2.inputDept(456, "IT", "mumbai");
		
		obj1.displayDetails();
		obj2.displayDetails();
	}
	
	
}
