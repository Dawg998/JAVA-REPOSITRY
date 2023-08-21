package Cascade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long accNo;
	private String ifscNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getIfscNo() {
		return ifscNo;
	}
	public void setIfscNo(String i) {
		this.ifscNo = i;
	}
	@Override
	public String toString() {
		return "account [id=" + id + ", accNo=" + accNo + ", ifscNo=" + ifscNo + "]";
	}

}