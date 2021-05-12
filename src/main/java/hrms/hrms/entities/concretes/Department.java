package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity

@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Department() {}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
