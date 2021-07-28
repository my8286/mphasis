package package8;

public class Bank {
	int accno,balance;
	String name;
	public Bank(int accno, int balance, String name) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n Bank [accno=" + accno + ", balance=" + balance + ", name=" + name + "]";
	}
}
