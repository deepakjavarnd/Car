package org.test.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5608505375499169270L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student_ID",nullable=false)
	private Integer studentId;
	
	@Column(name="Name",nullable=false,length=30)
	private String name;
	
	@Column(name="Class",nullable=false,length=30)
	private String classStudent;
	
	@Column(name="Section",nullable=false,length=30)
	private String section;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassStudent() {
		return classStudent;
	}

	public void setClassStudent(String classStudent) {
		this.classStudent = classStudent;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}


}


