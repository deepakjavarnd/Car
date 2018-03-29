package org.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentSport")
public class StudentSport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID",nullable=false)
	private int ID;

	@ManyToOne
	@JoinColumn(name="Student_ID")
	private Student student;

	@ManyToOne
	@JoinColumn(name="Category_Id")
	private Category category;
  
	@ManyToOne
	@JoinColumn(name="Category_Id")
	private CategorySports categorySports;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public CategorySports getCategorySports() {
		return categorySports;
	}

	public void setCategorySports(CategorySports categorySports) {
		this.categorySports = categorySports;
	}

}
