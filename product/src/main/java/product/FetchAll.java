package product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {

	public static void main(String[] args) {
	
		//This is a abstract Class 
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vs");
	
	//This is a interface
	EntityManager em=emf.createEntityManager();
	
	Query q= em.createQuery("Select e from product e");
	
	List<product> l=q.getResultList();
	
	System.out.println(l);
	
    }
}
