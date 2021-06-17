package com.onebill.spring.student.maintenance.dao;

import com.onebill.spring.student.maintenance.bean.Student;

public interface StudentMaintenanceDAO {

	public boolean insertStudent(Student student);

	public Student searchStudent(int userid);

	public boolean removeStudent(int userid);

	public boolean updateEmail(Student student);

	public String getStudentGrade(int userid);

}
