package com.onebill.spring.student.maintenance.service;

import com.onebill.spring.student.maintenance.bean.AllMarks;
import com.onebill.spring.student.maintenance.bean.Student;

public interface StudentMaintenanceService {

	public boolean insertStudent(Student student);

	public Student searchStudent(int userid);

	public boolean removeStudent(int userid);

	public boolean updateEmail(Student student);

	public String getStudentGrade(int userid);

	public double avgMark(AllMarks allMarks);
}
