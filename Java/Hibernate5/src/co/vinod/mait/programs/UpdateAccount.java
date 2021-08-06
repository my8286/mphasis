package co.vinod.mait.programs;

import org.hibernate.Session;

import co.vinod.mait.entity.Bank;
import co.vinod.mait.util.HibernateUtil;
import co.vinod.mait.util.KeyboardUtil;

public class UpdateAccount {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		int accno = KeyboardUtil.getInt("Enter accno: ");
		session.beginTransaction();
		Bank p1 = (Bank) session.get(Bank.class, accno);

		if (p1 == null) {
			System.out.println("No data found!");
		} else {
			String input;

			input = KeyboardUtil.getString("Name : (" + p1.getName() + ") ");
			if (!input.equals("")) {
				p1.setName(input);
			}

			input = KeyboardUtil.getString("Balanace: (" + p1.getBalance() + ") ");
			if (!input.equals("")) {
				p1.setBalance(Integer.parseInt(input));
			}

			input = KeyboardUtil.getString("Phone : (" + p1.getPhoneno() + ") ");
			if (!input.equals("")) {
				p1.setPhoneno(input);
			}

			input = KeyboardUtil.getString("Email : (" + p1.getEmail() + ") ");
			if (!input.equals("")) {
				p1.setEmail(input);
			}

			session.getTransaction().commit();
			System.out.println("Data updated back to the db.");

		}

	}
}
