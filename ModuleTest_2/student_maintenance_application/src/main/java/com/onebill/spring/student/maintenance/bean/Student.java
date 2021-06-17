/* Craete bean class for Student info */
package com.onebill.spring.student.maintenance.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "Users")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int userid;

	@Column
	private String email;

	@Column
	private double marks;

	@Column
	private String name;

	@Column
	private String grade;

	@Transient
	@Autowired
	private AllMarks allmarks;
}
