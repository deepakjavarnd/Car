package org.test.dto;

import org.test.bean.CategorySports;
import org.test.common.Constants;

public class StudentSportsResponseDTO {
	
	private String categoryId=Constants.NULL;;
	
	private CategorySports categorySpots=new CategorySports();

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public CategorySports getCategorySpots() {
		return categorySpots;
	}

	public void setCategorySpots(CategorySports categorySpots) {
		this.categorySpots = categorySpots;
	}

	@Override
	public String toString() {
		return "StudentSportsResponseDTO [categoryId=" + categoryId + ", categorySpots=" + categorySpots + "]";
	}
	
	

}
