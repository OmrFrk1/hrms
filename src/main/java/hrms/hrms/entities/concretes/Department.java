package hrms.hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity

@Table(name = "job_titles")
public class Department {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	public Department() {}

	public Department(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
}
