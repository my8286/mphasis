package co.vinod.mait.entity;

public class Bank {
	int accno,balance;
	String name,phoneno,email;
	public Bank() {}
	
	public Bank(int accno, int balance, String name, String phoneno, String email) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
