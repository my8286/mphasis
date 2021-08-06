//setter Injection   
public class Student 
{  
	private String name,address;
	private int empid;
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}

  
public void setName(String name) {  
    this.name = name;  
}  
  
public void displayInfo(){  
    System.out.println("Hello: "+name+"The empid is "+empid+"  The address is "+address);  
}  
}  