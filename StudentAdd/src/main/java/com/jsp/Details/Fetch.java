package com.jsp.Details;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	static Scanner sc = new Scanner(System.in);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	static boolean b = true;

	public static void fetchStudent() {
		System.out.println("Enter the Student Id:");
		int id = sc.nextInt();
		Student fetch = em.find(Student.class,id);
  
		if (fetch!= null) {
			et.begin();
			em.merge(fetch);
			et.commit();
			System.out.println(fetch+"\n\n");
		} else {
			System.err.println("No record found");
		}

	}

	public static void fetchAddress() {
		System.out.println("Enter the Student Address Id:");
		int aid = sc.nextInt();
		Details fetch= em.find(Details.class, aid);
//		List <Details> ls=(list)fetch;
		if (fetch!= null) {
			et.begin();
			em.merge(fetch);
			et.commit();
			System.out.println(fetch+"\n\n");
		} else {
			System.err.println("No such record is present");
		}

	}

	public static void main(String[] args) throws Exception {
		do {
			System.out.println(
					"\t\tWelcome to the Fetching Operation\n\nWhich record do you want to Fetch\n 1.Student\n 2.Address Details \n 3.Exit \nEnter the matching Number: ");
			int choice = sc.nextInt();
            
			switch (choice) {
			case 1:
				fetchStudent();
				break;
			case 2:
				fetchAddress();
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

		System.out.println("Fetching Done Successfully");
}
}
