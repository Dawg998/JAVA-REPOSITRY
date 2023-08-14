package product;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NameHave2a {
     //It is a Scanner Class
	static Scanner s=new Scanner(System.in);
	//It is an abstract class
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("vs");
	//It is an interface
	static EntityManager em=emf.createEntityManager();
	//Query
	static Query q= null;
	
	public static void main(String[] args) {
		
		System.out.println("\n\t\t Welcome to find products having names with 2 'a' characters\n");
		
		q=em.createQuery("select t.pro_name from product t where pro_name like '%a%a%'");
		
		List<product> ls =q.getResultList();
	
		if(ls.isEmpty())
			System.out.println("\n There is no such product name present");
		else {System.out.println("\nName:"+ls);}
	}
}
