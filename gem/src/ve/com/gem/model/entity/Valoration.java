/**
 * 
 */
package ve.com.gem.model.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author alonso y alfonso
 *
 */
@Entity
public class Valoration extends Goal  {
	
 
    private String status;
    
    

	
	
	@Override
	public String toString() {
		return "Valoration [id=" + this.getId() + ", status=" + status + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Valoration(){
		
	}
	public Valoration(String name) {
		this.setName(name);
	}

}
