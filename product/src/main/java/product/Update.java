package product;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Parameter;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	
     //scanner class
	static Scanner sc= new Scanner(System.in);
	
	//it is an abstract Class
    static  EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");

    //it is an interface
     static EntityManager em=emf.createEntityManager();
     
     //Query
     static Query q=null;
     
     public static void main(String[] args) {
		System.out.println("\n\t\t\t welcome to Update Page \n");
		
		System.out.println("Enter the product id:");
	    int id=sc.nextInt();
	    
	    System.out.println("\n Enter the product name to be updated:");
	    String name=sc.next();
	    
	    q=em.createQuery("update product set pro_name=:1 where pro_id=:2 ");
	    q.setParameter(1, name);
	    q.setParameter(2 , id);
	    
	    List <product> ls=q.getResultList();
	    
	   if (ls.isEmpty()) {
		   System.out.println("\n There is no product with the product id"+id+"check for the id");
	   }
	   else {System.out.println(ls);}
	
}
}

