package org.test.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.dto.StudentSportGenericResponseDTO;
import org.test.dto.StudentSportsDTO;
import org.test.service.StudentSportService;



@RestController
@RequestMapping("/api")
public class SportController {
	
	@Autowired private StudentSportService studentSportService;
	
	@RequestMapping(value = "/getstudentSport", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentSportGenericResponseDTO> getstudentSport( @RequestBody @Valid StudentSportsDTO	 requestDTO){

		StudentSportGenericResponseDTO responseDTO = studentSportService.getstudentSport(requestDTO);
		return new ResponseEntity<>(responseDTO, null, HttpStatus.OK);
	}

}
