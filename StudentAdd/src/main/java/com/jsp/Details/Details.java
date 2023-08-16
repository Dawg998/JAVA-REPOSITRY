package com.jsp.Details;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int address_id;
	private String street;
	private String city;
	private String state;
	private long zipcode;
	
	@OneToOne
	private Student s;

	public int getAddress_id() {
		return address_id;
	}

//	public void setAddress_id(int address_id) {
//		this.address_id = address_id;
//	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Details [address_id=" + address_id + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", s=" + s + "]";
	}

	
	
	

}
