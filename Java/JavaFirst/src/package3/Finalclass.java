package package3;

public class Finalclass {
	public static void main(String[] args) {
		Insurance insurance=new Insurance(111,"health",10000);
		Bank bank=new Bank(123456,"manish",90000000,insurance);
		bank.display();
	}

}
