package product;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO CLASS

@Entity
public class product {
	
	@Id //will set the primary key
	private int pro_no;
	private String pro_name;
	private double pro_price;
	private int pro_quantity;
	private String pro_brand;
	
	//getters and setters
	
	public String getPro_brand() {
		return pro_brand;
	}

	public void setPro_brand(String pro_brand) {
		this.pro_brand = pro_brand;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public double getPro_price() {
		return pro_price;
	}
	public void setPro_price(double pro_price) {
		this.pro_price = pro_price;
	}
	public int getPro_quantity() {
		return pro_quantity;
	}
	public void setPro_quantity(int pro_quantity) {
		this.pro_quantity = pro_quantity;
	}

	@Override
	public String toString() {
		return "product [pro_no=" + pro_no + ", pro_name=" + pro_name + ", pro_price=" + pro_price + ", pro_quantity="
				+ pro_quantity + ", pro_brand=" + pro_brand + "]";
	}
	
		
	

}
