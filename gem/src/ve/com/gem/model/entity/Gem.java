package ve.com.gem.model.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Gem extends Base {
	
	public Gem(){
		
	}

	public Gem(String name, String description, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt,
			Boolean isActive) {
		super(name, description, createdAt, updatedAt, deletedAt, isActive);
		// TODO Auto-generated constructor stub
	}

}
