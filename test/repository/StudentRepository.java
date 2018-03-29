package org.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.test.bean.Student;



/**
 * Spring JPA Repository for SampleTable
 * 
 *
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	Student findoneByStudentId(Integer studentId);


}