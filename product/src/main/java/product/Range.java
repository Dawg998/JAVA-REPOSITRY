package product;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Iterator;

public class Range {
	
	static Scanner sc=new Scanner(System.in);
	
	//it is an abstract class
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("vs");
	
	//it is an interface
	static EntityManager em=emf.createEntityManager();
	
	//query
	static Query q=null;
	
	
   public static void main(String[] args) {
	System.out.println("\n\t\t\t Welcome for finding the Range");
	
	System.out.println("Enter the Lower Range:");
	double low=sc.nextInt();
	System.out.println("Enter the Higher Range:");
	double high=sc.nextInt();
	
	q=em.createQuery("select a from product a where pro_price between ?1 and ?2");
	q.setParameter(1, low);
	q.setParameter(2, high);
	
	List<product>ls=q.getResultList();
	
    //System.out.println(ls.isEmpty());
	
	if (ls.isEmpty()) {System.out.println("\n There is no product between the range "+low+ "and "+high);}
	else {System.out.println(ls);}
}
}
