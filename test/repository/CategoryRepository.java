package org.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.test.bean.Category;



/**
 * Spring JPA Repository for SampleTable
 * 
 *
 */
public interface CategoryRepository extends CrudRepository<Category, String> {
	
	Category findOneByCatgoryId(String categoryId);


}