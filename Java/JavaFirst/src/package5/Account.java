package package5;

public abstract class Account {
	String name;
	int balance=0;
	abstract void open(String name);
	abstract void balance();
	abstract void withdral(int amount);
	abstract void deposit(int amount);

}
