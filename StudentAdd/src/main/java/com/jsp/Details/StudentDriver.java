package com.jsp.Details;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	static String suffix;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		
		System.out.println("How many Student records do you want to enter:");
		int record=sc.nextInt();
		for(int i=1;i<=record;i++) {
			Student s = new Student();
			Details d = new Details();
		if(i==1){suffix="st";
		}else if(i==2){suffix="nd";}
		else if(i==3){suffix="rd";}
		else {suffix="th";}
		System.out.println("Enter the "+ i + suffix+" name:");
		sc.nextLine();
		String name = sc.nextLine();
		s.setName(name);
		System.out.println("Enter the "+name+" Street name:");
		String sname = sc.nextLine();
		d.setStreet(sname);
		System.out.println("Enter the "+name+" city name:");
		String city = sc.nextLine();
		d.setCity(city);
		System.out.println("Enter the "+name+" State name:");
		String state = sc.nextLine();
		d.setState(state);
		System.out.println("Enter the "+name+" Zipcode:");
		long zip = sc.nextLong();
		d.setZipcode(zip);
		d.setS(s);
		s.setD(d);
		
		et.begin();
		em.persist(s);
		em.persist(d);
		et.commit();
		}
		
		System.out.println("Data Inserted successfully");
	}
}
