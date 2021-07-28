package package5;

public class Bank extends Account {
	void open(String name)
	{
		this.name=name;
		System.out.println("Welcome to our bank "+name);
	}
	void withdral(int amount)
	{
		balance-=amount;
		System.out.println(amount+" Rs debited from "+name+" account");
	}
	void balance()
	{
		System.out.println("your current balance is "+balance+" Rs");
	}
	void deposit(int amount)
	{
		balance+=amount;
		System.out.println(amount+" is credited into "+name+" account");
	}
	public static void main(String[] args) {
		Bank bk=new Bank();
		bk.open("manish");
		bk.balance();
		bk.deposit(1000);
		bk.balance();
		bk.withdral(500);
		bk.deposit(10000);
		bk.balance();
	}

}
