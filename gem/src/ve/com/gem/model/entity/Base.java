package ve.com.gem.model.entity;

import java.sql.Timestamp;

public abstract class Base {
	
	private String name;
	private String description;
	
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp deletedAt;
	
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
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return name;
	}
}
