package product;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Parameter;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Search {
	
	//scanner class
	static Scanner sc= new Scanner(System.in);
	
	//it is an abstract Class
     static EntityManagerFactory emf = Persistence.createEntityManagerFactory("vs");

    //it is an interface
     static EntityManager em=emf.createEntityManager();
     
     //Query
     static Query q=null;
     
//    static String p_name =p.pro_name;
     
     public static void main(String[] args) {
		System.out.println("\n\t\t\t welcome to Search product by product_name\n");
	    System.out.println("\n Enter the product name to be searched:");
	    String name=sc.next();
//	    q=em.createQuery("select p from product p where pro_name=?1");//for positional parameter
//	    q.setParameter(1, name);
	    
	    q=em.createQuery("select p from product p where pro_name=:a");
	    q.setParameter("a", name);
	    
	    List <product> ls=q.getResultList();
	    
	   if (ls.isEmpty()) {
		   System.out.println("\n There is no such product_name present as "+name);
	   }
	   else {System.out.println(ls);}
	}
}
