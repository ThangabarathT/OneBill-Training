package com.onebill.spring.student.maintenance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.spring.student.maintenance.bean.AllMarks;
import com.onebill.spring.student.maintenance.bean.Student;
import com.onebill.spring.student.maintenance.dao.StudentMaintenanceDAO;

@Service
public class StudentMaintenanceServiceImpl implements StudentMaintenanceService {

	@Autowired
	StudentMaintenanceDAO dao;

	@Override
	public boolean insertStudent(Student student) {

		String grade = student.getGrade();
		double mark = student.getMarks();

		AllMarks marks = student.getAllmarks();
		if (marks != null) {
			double q1 = marks.getQ1();
			double q2 = marks.getQ2();
			double q3 = marks.getQ3();
			double q4 = marks.getQ4();
			double avg = ((q1 + q2 + q3 + q4) / 4);
			mark = avg;
			student.setMarks(avg);
		}

		if (grade == null) {

			if ((mark >= 9.1) && (mark <= 10)) {
				student.setGrade("A+");
			} else if ((mark >= 8.1) && (mark <= 9.0)) {
				student.setGrade("A");
			} else if ((mark >= 7.1) && (mark <= 8.0)) {
				student.setGrade("B");
			} else if ((mark >= 6.1) && (mark <= 7.0)) {
				student.setGrade("C");
			} else if ((mark >= 5.1) && (mark <= 6.0)) {
				student.setGrade("D");
			} else if ((mark >= 4.1) && (mark <= 5.0)) {
				student.setGrade("E");
			} else if ((mark >= 0.0) && (mark <= 4.0)) {
				student.setGrade("F");
			} else {
				return false;
			}
		}
		return dao.insertStudent(student);
	}

	@Override
	public Student searchStudent(int userid) {
		if (userid < 0) {
			return null;
		} else {
			return dao.searchStudent(userid);
		}
	}

	@Override
	public boolean removeStudent(int userid) {
		if (userid < 0) {
			return false;
		} else {
			return dao.removeStudent(userid);
		}
	}

	@Override
	public boolean updateEmail(Student student) {
		if (student.getEmail() != null && student.getEmail() != "") {
			return dao.updateEmail(student);
		} else {
			return false;

		}
	}

	@Override
	public String getStudentGrade(int userid) {
		if (userid < 0) {
			return null;
		} else {
			return dao.getStudentGrade(userid);
		}
	}

	@Override
	public double avgMark(AllMarks allMarks) {
		double q1 = allMarks.getQ1();
		double q2 = allMarks.getQ2();
		double q3 = allMarks.getQ3();
		double q4 = allMarks.getQ4();
		double avgMark = ((q1 + q2 + q3 + q4) / 4);
		return avgMark;
	}

}
