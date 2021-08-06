package co.vinod.mait.programs;

import org.hibernate.Session;

import co.vinod.mait.entity.Bank;
import co.vinod.mait.util.HibernateUtil;

public class GetOneAccount {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();

		int id = 101;
		Bank b1 = (Bank) session.get(Bank.class, id);

		if (b1 == null) {
			System.out.println("No data found!");
		} else {
			System.out.println("Name  = " + b1.getName() + "\n 	balance "
					+ b1.getBalance());
			System.out.println("Phone = " + b1.getPhoneno());
			System.out.println("Email = " + b1.getEmail());
		}
		session.close();

	}

}
