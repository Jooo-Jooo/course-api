package io.jojoExperiments.springbootquickstart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topics")
public class Topics implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6710542866358538486L;

	@Id
	@Column(name = "id")
	public String id;
	
	@Column(name = "description")
	public String description;
	
	@Column(name = "name")
	public String name;
	
	
	public Topics() {}
	
	public Topics(String id, String description, String name) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
