package com.mypackage;

public class Bank {
	private int accno;
	private String name;
	private int balance;
	public Bank() {};
	
	public Bank(int accno, String name, int balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
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
	@Override
	public String toString() {
		return "accno=" + accno + ", name=" + name + ", balance=" + balance ;
	}
	
}
