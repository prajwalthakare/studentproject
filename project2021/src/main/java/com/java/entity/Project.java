
package com.java.entity;
// default package
// Generated 21 Jan, 2021 10:00:49 PM by Hibernate Tools 5.2.3.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project", catalog = "springmvc")
public class Project implements java.io.Serializable {

	private Integer id;
	
	private String projectname;
	private String studentname;

	public Project() {
	}

	public Project( String projectname, String studentname) {
		
		this.projectname = projectname;
		this.studentname = studentname;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id")
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Projectname")
	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Column(name = "Studentname")
	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

}
