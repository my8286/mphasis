package co.vinod.mait.programs;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import co.vinod.mait.entity.Bank;
import co.vinod.mait.util.HibernateUtil;
import co.vinod.mait.util.KeyboardUtil;

public class AddAccount {

	public static void main(String[] args) {

		int accno,balance;
		String name, phoneno,email;

		accno = KeyboardUtil.getInt("Enter accno: ");
		name = KeyboardUtil.getString("Enter name: ");
		balance = KeyboardUtil.getInt("Enter balance: ");
		phoneno = KeyboardUtil.getString("Enter phoneno: ");
		email = KeyboardUtil.getString("Enter email: ");

		Bank p1 = new Bank(accno,balance,name, phoneno, email);
		
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(p1);
			tx.commit();
			System.out.println("Data saved to db.");
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println("There was an error while trying to save data.");
			System.out.println(e.getMessage());
		}
		
		session.close();
		

	}
}









