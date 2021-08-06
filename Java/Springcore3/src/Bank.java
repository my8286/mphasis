public class Bank {  
private int accno;  
private String name,balance;  
private Address address;//Aggregation  
 
 
 public Bank(int accno, String name, String balance, Address address) {
	super();
	this.accno = accno;
	this.name = name;
	this.balance = balance;
	this.address = address;
}


void show(){  
    System.out.println(accno+" "+name+" "+balance);  
    System.out.println(address.toString());  
}   
}  















