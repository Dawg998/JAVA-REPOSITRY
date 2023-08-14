package product;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SortByAscAndDesc {
	  
//	 static public List<product> sort(){
//		   System.out.println("Select the order which you want to perform:\n 1.Ascending Order \n 2.Descending Order ");
//     	    int  choice=sc.nextInt();
//    
//   	   if(choice==1) {
//	    	  q=em.createQuery("Select e from product e order by pro_price asc");
//	         }
//   	   
//	    else {
//	    	 q=em.createQuery("Select e from product e order by pro_price desc");
//	    	}
//   	   
//	return (List<product>) q;
//	}
	static Scanner sc=new Scanner(System.in);
		
	//this is an abstract class
    static EntityManagerFactory emf=Persistence.createEntityManagerFactory("vs");
    
    //em is a interface
    static EntityManager em=emf.createEntityManager();
    //q is to execute the query
    static Query q=null;
    
    public static void main(String[] args) {
    	
    	   System.out.println("Select the order which you want to perform:\n 1.Ascending Order \n 2.Descending Order ");
      	    int choice=sc.nextInt();
     
    	   if(choice==1) {
 	    	  q=em.createQuery("Select e from product e order by pro_price asc");
 	         }
    	   
 	    else {
 	    	 q=em.createQuery("Select e from product e order by pro_price desc");
 	    	}
    	
//          List<product> s1=sort();
    	 List <product> ls=q.getResultList();
    	 System.out.println(ls);  
}
}
