/**
 * 
 */
package ve.com.gem.model.entity;

import java.sql.Timestamp;

import javax.persistence.Embeddable;

/**
 * @author informatica
 *
 */
@Embeddable
public class Basic {

	private String name;
	private String description;
	private Timestamp created;
	private Timestamp updated;
	private Boolean isActive;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	public Timestamp getUpdated() {
		return updated;
	}
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
}
