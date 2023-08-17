package com.jsp.Details;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	static Scanner sc = new Scanner(System.in);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	static boolean b=true;
	// Object
	static Student s = new Student();
	static Student st;
	static Details d = new Details();
	static Details dt;

	public static void UpdateStudent() {
		System.out.println("Enter the Student Id:");
		int id = sc.nextInt();
		Student st = em.find(Student.class, id);
		System.out.println("Enter the new name:");
		String nname = sc.next();
		st.setName(nname);
		et.begin();
		em.merge(st);
		et.commit();
	}

	public static void UpdateAddress() {
		System.out.println("Enter the Student Address Id:");
		int aid = sc.nextInt();
		Details dt = em.find(Details.class, aid);
		System.out.println("Enter the new city name:");
		String ncname = sc.next();
		System.out.println("Enter the new state name:");
		String nsname = sc.next();
		System.out.println("Enter the new street name:");
		String nstname = sc.next();
		System.out.println("Enter the new pincode name:");
		long npname = sc.nextLong();
		dt.setCity(ncname);
		dt.setState(nsname);
		dt.setStreet(nstname);
		dt.setPincode(npname);
		et.begin();
		em.merge(dt);
		et.commit();
	}

	public static void main(String[] args) {
		do {
			System.out.println(
					"\t\tWelcome to the Updation Operation\n\nWhich record do you want to update\n 1.Student\n 2.Address Details \n 3.Exit ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				UpdateStudent();
				break;
			case 2:
				UpdateAddress();
				break;
			case 3:
				b = false;
				break;
			default:
				System.out.println("Select from the given Operations");
				break;
			}
		} while (b);

		System.out.println("Updation Done Successfully");
	}
}
