package org.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.test.bean.Category;
import org.test.bean.CategorySports;
import org.test.bean.Student;
import org.test.bean.StudentSport;
import org.test.common.Constants;
import org.test.dto.StudentSportGenericResponseDTO;
import org.test.dto.StudentSportsDTO;
import org.test.dto.StudentSportsResponseDTO;
import org.test.repository.CategoryRepository;
import org.test.repository.CategorySportsRepository;
import org.test.repository.StudentRepository;
import org.test.repository.StudentSportRepository;

public class StudentSportService {
	
	@Autowired
	private StudentSportRepository studentSportRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategorySportsRepository categorySportsRepository;
	
	 

	public StudentSportGenericResponseDTO getstudentSport(@RequestBody StudentSportsDTO requestDTO) {
		
		StudentSportGenericResponseDTO studentSportGenericResponseDTO=new StudentSportGenericResponseDTO();
		studentSportGenericResponseDTO.setErrorCode(Constants.UNKNOWN_EXCEPTION_CODE);
		studentSportGenericResponseDTO.setErrorMessage(Constants.UNKNOWN_EXCEPTION_MESSAGE);
		
		StudentSportsResponseDTO responseDTO=new StudentSportsResponseDTO();
		
		Student student=studentRepository.findoneByStudentId(requestDTO.getStudentId());
		
		if(student==null){
			studentSportGenericResponseDTO.setStatus(Constants.FAILED);
			studentSportGenericResponseDTO.setErrorCode(Constants.CODE_01);
			studentSportGenericResponseDTO.setErrorMessage(Constants.STUDENT_ID_NOT_FOUND);
			return studentSportGenericResponseDTO;
		}
		
		
		
		StudentSport studentSports=studentSportRepository.findonebyStudent(student);

		if(studentSports==null){
			studentSportGenericResponseDTO.setStatus(Constants.FAILED);
			studentSportGenericResponseDTO.setErrorCode(Constants.CODE_02);
			studentSportGenericResponseDTO.setErrorMessage(Constants.STUDENT_SPORTS_ID_NOT_FOUND);
			return studentSportGenericResponseDTO;
		}
		
		Category category=categoryRepository.findOneByCatgoryId(studentSports.getCategory().getCategoryId());

		if(category==null){
			studentSportGenericResponseDTO.setStatus(Constants.FAILED);
			studentSportGenericResponseDTO.setErrorCode(Constants.CODE_02);
			studentSportGenericResponseDTO.setErrorMessage(Constants.CATEGORY_ID_NOT_FOUND);
			return studentSportGenericResponseDTO;
		}

		responseDTO.setCategoryId(category.getCategoryName());
		
		CategorySports categorySports=categorySportsRepository.findoneBySportId(studentSports.getCategorySports().getSport_Id());
		if(categorySports==null){
			studentSportGenericResponseDTO.setStatus(Constants.FAILED);
			studentSportGenericResponseDTO.setErrorCode(Constants.CODE_02);
			studentSportGenericResponseDTO.setErrorMessage(Constants.CATEGORY_SPORTS_OBJECT_NOT_FOUND);
			return studentSportGenericResponseDTO;
		}
		
		studentSportGenericResponseDTO.setStatus(Constants.SUCCESS_code);
		studentSportGenericResponseDTO.setErrorCode(Constants.RESPONSE_MESSGAE);
		responseDTO.setCategorySpots(categorySports);
		return studentSportGenericResponseDTO;
	}

}
