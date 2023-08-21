package edu.jsp.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDriver {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	static EntityTransaction et;
	static Query q;

	public static void main(String[] args) {
		
		try {
			emf = Persistence.createEntityManagerFactory("dev");
			em = emf.createEntityManager();
			et=em.getTransaction();
           
			System.out.println("Welcome to Fetch Operation\n Enter the name of the player: ");
			
			q=em.createQuery("select p from Players p where p.name=:name ");
			q.setParameter("name", new Scanner(System.in).next());
			List<Players> ls=q.getResultList();
			//fetch using Methods
//			Players p = new Players();
//			Players fetch = em.find(Players.class, 1);
			
			//fetch using query
			
             
//			if (fetch != null) {
//				System.out.println(fetch);
//			} else {
//				System.out.println("No records available\n");
//			}
			if (ls.isEmpty()) {
				System.out.println("No records available\n");
			} else {
				System.out.println(ls);
			}
		} finally {
             em.close();
			System.out.println("Fetching Done Successfully");
		}

	}

}
