/* Craete bean class for aggregate marks */
package com.onebill.spring.student.maintenance.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class AllMarks implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double Q1;

	private double Q2;

	private double Q3;

	private double Q4;
}
