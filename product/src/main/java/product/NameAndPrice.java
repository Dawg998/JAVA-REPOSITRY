package product;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class NameAndPrice {
	
	//it is an abstract class
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("vs");
	
	//it is an interface
	static EntityManager em=emf.createEntityManager();
	
	//query
	static Query q=null;
	
	static int i=1,j=1;
	
   public static void main(String[] args) {
	System.out.println("\n\t\t\t Welcome for finding the Name and Price");
	
	q=em.createQuery("select a.pro_name,a.pro_price from product a ");

	List<Object[]>  ls=q.getResultList(); 

	if (ls.isEmpty()) {System.out.println("\n There is no name and price in the List");}
	
	else {
	for (Object[] b:ls) {
		System.out.println("Product "+ i++ +" Name:"+b[0]);
		System.out.println("Product "+ j++ +" Price:"+b[1]+"\n");
		
       	}
		
      }
    }
  }
