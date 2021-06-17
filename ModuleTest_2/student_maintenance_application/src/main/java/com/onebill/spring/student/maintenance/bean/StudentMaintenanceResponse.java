package com.onebill.spring.student.maintenance.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "status", "message", "description" })
public class StudentMaintenanceResponse {

	private int status;
	private String message;
	private String description;

	private Student student;

	private String grade;

	private String aggregatedmark;

}
