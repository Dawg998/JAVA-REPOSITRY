package Cascade;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CascadeDriver {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	static EntityTransaction et = null;

	
	public static void main(String[] args) {
		try {

			emf = Persistence.createEntityManagerFactory("vs");
			em = emf.createEntityManager();
			et = em.getTransaction();

			Person person = new Person();
			System.out.println("Enter the Person_name:");
			person.setName(new Scanner(System.in).next());
			System.out.println("Enter the Person's_Email:");
			person.setEmail(new Scanner(System.in).next());
			System.out.println("Enter the Phone_No:");
			person.setPhone(new Scanner(System.in).nextInt());

			Account account = new Account();
			System.out.println("Enter the AccountNo:");
			account.setAccNo(new Scanner(System.in).nextInt());
			System.out.println("Enter the Ifsc.No:");
			account.setIfscNo(new Scanner(System.in).next());

			Account account1 = new Account();
			System.out.println("Enter the AccountNo:");
			account1.setAccNo(new Scanner(System.in).nextInt());
			System.out.println("Enter the Ifsc.No:");
			account1.setIfscNo(new Scanner(System.in).next());

			Account account2 = new Account();
			System.out.println("Enter the AccountNo:");
			account2.setAccNo(new Scanner(System.in).nextInt());
			System.out.println("Enter the Ifsc.No:");
			account2.setIfscNo(new Scanner(System.in).next());

			ArrayList<Account> accounts = new ArrayList();
			accounts.add(account1);
			accounts.add(account2);
			accounts.add(account);

			et.begin();
			em.persist(account);
			em.persist(accounts);
			et.commit();
		} finally {
			em.close();
			System.out.println("Insertion Done Successfully");
		}
	}
}
