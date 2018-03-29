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
@Table(name="category_Sports")
public class CategorySports {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student_ID",nullable=false)
	private Integer sport_Id;
	
	@Column(name="Sport_Name")
	private String sport_Name;
	
	@ManyToOne
	@JoinColumn(name="Category_Id",nullable=false)
	private Category category;

	public Integer getSport_Id() {
		return sport_Id;
	}

	public void setSport_Id(Integer sport_Id) {
		this.sport_Id = sport_Id;
	}

	public String getSport_Name() {
		return sport_Name;
	}

	public void setSport_Name(String sport_Name) {
		this.sport_Name = sport_Name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
