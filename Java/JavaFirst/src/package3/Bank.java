package package3;

public class Bank {
	int acno;
	String name;
	int balance;
	Insurance insurance;
	Bank(int acno,String name,int balance,Insurance insurance){
		this.acno=acno;
		this.name=name;
		this.balance=balance;
		this.insurance=insurance;
	}
	void display() {
		System.out.println("Acno:"+acno+" name:"+name+" balance:"+balance);
		System.out.println("insurance-> "+insurance);
	}
}
