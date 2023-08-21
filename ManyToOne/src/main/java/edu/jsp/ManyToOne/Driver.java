package edu.jsp.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	static EntityTransaction et;
	
	public static void main(String[] args) {
     try {
    	 emf = Persistence.createEntityManagerFactory("dev");
    	 em = emf.createEntityManager();
    	 et = em.getTransaction();

		Players p1=new Players();
		p1.setName("aa");
		p1.setRole("captain");
		p1.setJno(1);
		
		Players p2=new Players();
		p2.setName("bb");
		p2.setRole("all-rounder");
		p2.setJno(3);
		
		Players p3=new Players();
		p3.setName("cc");
		p3.setRole("Bowler");
		p3.setJno(1);
		
		Teams teams =new Teams();
		teams.setGame("Cricket");
		teams.setColor("yellow");
		teams.setName("CSK");
		teams.setCaptain("MSD");
		
		p1.setTeams(teams);//mapping
		p2.setTeams(teams);//mapping
		p2.setTeams(teams);//mapping
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(teams);
		et.commit();
     }finally {
    	 em.close();
    	 System.out.println("Data Inserted");
     }
	}
}
