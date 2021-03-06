package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "studentinfo")
public class Student {

	@Id
	@Column
	private int sid;
	
	@Column
	private String sname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "student_course_info", joinColumns= @JoinColumn(name = "sname"), inverseJoinColumns= {@JoinColumn(name = "cid")})
	private List<Course> courses;
	
}
