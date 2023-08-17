package com.jsp.Details;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	static Scanner sc = new Scanner(System.in);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	static boolean b = true;

	public static void DeleteStudent() {
		System.out.println("Enter the Student Id:");
		int id = sc.nextInt();
		Student delete = em.find(Student.class,id);
		if (delete != null) {
			et.begin();
			em.remove(delete);
			et.commit();
//			et.rollback();
			System.out.println("Record Deleted Successfully");
		} else {
			System.err.println("No record found");
		}

	}

	public static void DeleteAddress() {
		System.out.println("Enter the Student Address Id:");
		int aid = sc.nextInt();
		Details delete = em.find(Details.class, aid);
		if (delete != null) {
			et.begin();
			em.remove(delete);
			et.commit();
//			et.rollback();
			System.out.println("Details Successfully Deleted");
		} else {
			System.err.println("No such record is present");
		}

	}

	public static void main(String[] args) throws Exception {
		do {
			System.out.println(
					"\t\tWelcome to the Delete Operation\n\nWhich record do you want to Delete\n 1.Student\n 2.Address Details \n 3.Exit \nEnter the matching Number: ");
			int choice = sc.nextInt();
            
			switch (choice) {
			case 1:
				DeleteStudent();
				break;
			case 2:
				DeleteAddress();
				break;
			case 3:
				b = false;
				break;
			default:
				System.out.println("\nSelect from the given Operations,returning to welcome again...\n");
				Thread.sleep(2000);
				break;
			}
		} while (b);

		System.out.println("Deletion Done Successfully");
	}
}
