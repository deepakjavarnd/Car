package org.test.dto;

public class StudentSportGenericResponseDTO {
	
	private String status;

	private String errorCode;

	private String errorMessage;

	private Object responseObj;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getResponseObj() {
		return responseObj;
	}

	public void setResponseObj(Object responseObj) {
		this.responseObj = responseObj;
	}
	
}
