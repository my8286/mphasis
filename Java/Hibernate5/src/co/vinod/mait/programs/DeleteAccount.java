package co.vinod.mait.programs;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import co.vinod.mait.entity.Bank;
import co.vinod.mait.util.HibernateUtil;
import co.vinod.mait.util.KeyboardUtil;

public class DeleteAccount {

	public static void main(String[] args) {

		int accno = KeyboardUtil.getInt("Enter accno of the person to delete: ");

		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		try {
			Bank p1 = (Bank) session.get(Bank.class, accno);
			if (p1 == null) {
				System.out.println("No record to delete!");
			} else {
				session.delete(p1);
				session.getTransaction().commit();
				System.out.println("Data deleted successfully!");	
			}
		} catch (HibernateException e) {
			System.out.println("Could not delete the data");
			System.err.println(e.getMessage());
			session.getTransaction().rollback();
		}

		session.close();

	}
}
