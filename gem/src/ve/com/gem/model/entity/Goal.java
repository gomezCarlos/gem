package ve.com.gem.model.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author alonso y alfonso
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Goal extends Base{
	
	private Timestamp datelimit;
	private Timestamp datedelay;
	


	public Timestamp getDatelimit() {
		return datelimit;
	}

	public void setDatelimit(Timestamp datelimit) {
		this.datelimit = datelimit;
	}

	public Timestamp getDatedelay() {
		return datedelay;
	}

	public void setDatedelay(Timestamp datedelay) {
		this.datedelay = datedelay;
	}
	

	@Override
	public String toString() {
		return "Goal [id=" + this.getId() + ", datelimit=" + datelimit + ", datedelay=" + datedelay + "]";
	}

	public Goal(){
		
	}

	public Goal(String name) {
		this.setName(name);
	}
	
	
	
	
	
	
	
	
}
