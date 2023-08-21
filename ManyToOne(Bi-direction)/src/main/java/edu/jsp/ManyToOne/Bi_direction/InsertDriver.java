package edu.jsp.ManyToOne.Bi_direction;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {
	static EntityManagerFactory emf;
	static EntityManager em;
	static EntityTransaction et;
	
public static void main(String[] args) {
	try {
	emf=Persistence.createEntityManagerFactory("dev");
	em=emf.createEntityManager();
	et=em.getTransaction();
	
	Staff staff =new Staff();
	staff.setName("Harish Sir");
	staff.setSub("WebTech");
	
	Staff staff1 =new Staff();
	staff1.setName("Surya Sir");
	staff1.setSub("Advance Java");
	
    Student stud = new Student();
    stud.setName("aa");
    stud.setAge(25);
    stud.setMarks(90);
    
    
    stud.setStaff(staff1);//for mapping
    stud.setStaff(staff);//for mapping
    
    ArrayList<Student> ls= new ArrayList<Student>();//adding in the list
    ls.add(stud);
    
    
    staff.setStudentlist(ls);//mapping
    staff.setStudentlist(ls);//mapping
    
	et.begin();
	em.persist(staff);
	em.persist(staff1);
	em.persist(stud);
	et.commit();
	
	}finally {
		System.out.println("Inserted Successfully");
		em.close();
	}
}
}
