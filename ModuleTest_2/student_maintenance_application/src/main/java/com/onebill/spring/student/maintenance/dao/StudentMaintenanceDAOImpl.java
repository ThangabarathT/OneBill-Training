package com.onebill.spring.student.maintenance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.onebill.spring.student.maintenance.bean.Student;
import com.onebill.spring.student.maintenance.exception.StudentMaintenanceException;

@Repository
public class StudentMaintenanceDAOImpl implements StudentMaintenanceDAO {

	@PersistenceUnit
	private EntityManagerFactory entitymanagerfactory = null;

	EntityManager entitymanager = null;
	EntityTransaction entitytransaction = null;

	@Override
	public boolean insertStudent(Student student) {
		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();
		Student check = entitymanager.find(Student.class, student.getUserid());

		if (check == null) {
			entitytransaction.begin();

			entitymanager.persist(student);
			entitytransaction.commit();
			entitymanager.close();
			return true;
		} else {
			throw new StudentMaintenanceException("Accept unique Userid only");
		}

	}

	@Override
	public Student searchStudent(int userid) {
		entitymanager = entitymanagerfactory.createEntityManager();
		Student student = entitymanager.find(Student.class, userid);
		entitymanager.close();

		if (student != null) {
			return student;
		} else {
			throw new StudentMaintenanceException("Student Data Not Found");
		}
	}

	@Override
	public boolean removeStudent(int userid) {

		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();

		Student student = entitymanager.find(Student.class, userid);

		if (student != null) {
			entitytransaction.begin();
			entitymanager.remove(student);
			entitytransaction.commit();
			entitymanager.close();
			return true;
		} else {
			throw new StudentMaintenanceException("Student Data Not Found");
		}
	}

	@Override
	public boolean updateEmail(Student student) {

		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();

		Student originalData = entitymanager.find(Student.class, student.getUserid());

		if (originalData != null) {
			entitytransaction.begin();
			originalData.setEmail(student.getEmail());
			entitytransaction.commit();
			entitymanager.close();
			return true;
		} else {
			throw new StudentMaintenanceException("Student Data Not Found");
		}
	}

	@Override
	public String getStudentGrade(int userid) {
		entitymanager = entitymanagerfactory.createEntityManager();
		Student student = entitymanager.find(Student.class, userid);
		entitymanager.close();

		if (student != null) {
			return student.getGrade();
		} else {
			throw new StudentMaintenanceException("Student Data Not Found");
		}
	}

}
