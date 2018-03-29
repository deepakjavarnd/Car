package org.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.test.bean.CategorySports;



/**
 * Spring JPA Repository for SampleTable
 * 
 *
 */
public interface CategorySportsRepository extends CrudRepository<CategorySports, Integer> {
	
	CategorySports findoneBySportId(Integer  sport_Id);


}