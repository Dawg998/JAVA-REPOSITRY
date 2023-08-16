package com.jsp.Details;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Generated;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	
	@OneToOne
	private Details d;
	
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Details getD() {
		return d;
	}



	public void setD(Details d) {
		this.d = d;
	}



//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
	
	
	
	
}
