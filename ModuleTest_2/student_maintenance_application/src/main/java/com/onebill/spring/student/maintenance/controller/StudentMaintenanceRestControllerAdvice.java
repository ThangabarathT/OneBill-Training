package com.onebill.spring.student.maintenance.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onebill.spring.student.maintenance.bean.StudentMaintenanceResponse;
import com.onebill.spring.student.maintenance.exception.StudentMaintenanceException;

@RestControllerAdvice
public class StudentMaintenanceRestControllerAdvice {

	@ExceptionHandler(StudentMaintenanceException.class)
	public StudentMaintenanceResponse handleProductException(StudentMaintenanceException exception) {
		StudentMaintenanceResponse response = new StudentMaintenanceResponse();
		response.setStatus(404);
		response.setMessage("Failure");
		response.setDescription(exception.getMessage());
		return response;
	}
}
