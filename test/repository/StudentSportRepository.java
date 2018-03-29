package org.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.test.bean.Student;
import org.test.bean.StudentSport;



/**
 * Spring JPA Repository for SampleTable
 * 
 *
 */
public interface StudentSportRepository extends CrudRepository<StudentSport, Integer> {
	
	StudentSport findonebyStudent(Student student);


}