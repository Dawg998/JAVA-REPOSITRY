package product;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class proudctDriver {
	
	static Scanner sc=new Scanner(System.in);
	
  public static void main(String[] args) {
	
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  EntityTransaction et=em.getTransaction();
	  
	  product p=new product();//objectcreation for product entity class
	  
//	  System.out.println("Enter the number of Products :");
//	  int nos=sc.nextInt();
	  
//	  public void insertion () {
//	  for(int i=1;i<=nos;i++) {
	  p.setPro_no(4);
	  p.setPro_name("Television");
	  p.setPro_price(200000);
	  p.setPro_quantity(1);
	  
	  et.begin();//it will begin the process
	  em.persist(p);//it will save the process
	  et.commit();//it will save upto which it can
	  
    
  
	  System.out.println("Successfully inserted");
}
}
