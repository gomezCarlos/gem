package ve.com.gem.model.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Document implements Serializable {

	   
	@Id
	private Integer id;
	private String description;
	private static final long serialVersionUID = 1L;

	public Document() {
		
	}   
	public Document(String description2) {
		// TODO Auto-generated constructor stub
		this.setDescription(description2);
	}
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return "Document [id=" + this.getId() + ", description=" + description  + "]";
	}
	
	public void setDescription(String description) {
		this.description = description;
	}	
	
   
}
