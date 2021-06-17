/**
 * 
 */
package com.onebill.spring.student.maintenance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.spring.student.maintenance.bean.AllMarks;
import com.onebill.spring.student.maintenance.bean.Student;
import com.onebill.spring.student.maintenance.bean.StudentMaintenanceResponse;
import com.onebill.spring.student.maintenance.service.StudentMaintenanceService;

/**
 * @author barath
 *
 */

@RestController
public class StudentMaintenanceRestController {

	@Autowired
	StudentMaintenanceService service;

	StudentMaintenanceResponse response = null;

	@PostMapping(path = "/insert", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public StudentMaintenanceResponse insertStudent(@RequestBody Student student) {
		response = new StudentMaintenanceResponse();

		if (service.insertStudent(student)) {
			response.setStatus(200);
			response.setMessage("Success");
			response.setDescription("Student data inserted for id " + student.getUserid());

		} else {
			response.setStatus(404);
			response.setMessage("Failure");
			response.setDescription("Marks accept only between 0 - 10");
		}
		return response;
	}

	@GetMapping(path = "/search/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public StudentMaintenanceResponse searchStudents(@PathVariable(name = "id") int userid) {
		response = new StudentMaintenanceResponse();
		Student student = service.searchStudent(userid);
		if (student != null) {
			response.setStatus(200);
			response.setMessage("Success");
			response.setDescription("Student data found for id " + userid);
			response.setStudent(student);

		} else {
			response.setStatus(404);
			response.setMessage("Failure");
			response.setDescription("User id Accept positive values only");
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public StudentMaintenanceResponse removeStudent(@PathVariable(name = "id") int userid) {
		response = new StudentMaintenanceResponse();
		if (service.removeStudent(userid)) {
			response.setStatus(200);
			response.setMessage("Success");
			response.setDescription("Removed Student data for id " + userid);

		} else {
			response.setStatus(404);
			response.setMessage("Failure");
			response.setDescription("User id Accept positive values only");
		}
		return response;
	}

	@PutMapping(path = "/emailupdate", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public StudentMaintenanceResponse emailUpdate(@RequestBody Student student) {
		response = new StudentMaintenanceResponse();
		if (service.updateEmail(student)) {
			response.setStatus(200);
			response.setMessage("Success");
			response.setDescription("Email ID upadted for Student id " + student.getUserid());

		} else {
			response.setStatus(404);
			response.setMessage("Failure");
			response.setDescription("Accept valid Email id only");
		}
		return response;
	}

	@GetMapping(path = "/grade/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public StudentMaintenanceResponse getStudentGrade(@PathVariable(name = "id") int userid) {
		response = new StudentMaintenanceResponse();
		String grade = service.getStudentGrade(userid);

		if (grade != null) {
			response.setStatus(200);
			response.setMessage("Success");
			response.setDescription("Student Garde found for id " + userid);
			response.setGrade(grade);

		} else {
			response.setStatus(404);
			response.setMessage("Failure");
			response.setDescription("User id Accept positive values only");
		}
		return response;
	}

	@PostMapping(path = "/avgmarks", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public StudentMaintenanceResponse avgMarks(@RequestBody AllMarks allMarks) {
		response = new StudentMaintenanceResponse();
		Double avgMark = service.avgMark(allMarks);
		response.setStatus(200);
		response.setMessage("Success");
		response.setDescription("Aggregate marks Calculated");
		response.setAggregatedmark(avgMark.toString());
		return response;
	}
}
