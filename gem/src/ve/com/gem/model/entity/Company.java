package ve.com.gem.model.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
/** Created by Andres & Ronaldo Team (4)
*/
@Entity
public class Company extends Base {
	
	private String customer;
	public Company(long longValue, String name2) {
		// TODO Auto-generated constructor stub
	

	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Company() {
}
}