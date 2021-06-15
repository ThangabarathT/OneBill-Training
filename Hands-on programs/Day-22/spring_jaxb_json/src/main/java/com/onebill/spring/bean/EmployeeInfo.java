package com.onebill.spring.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;

@Data
@XmlRootElement(name = "employee-info")
@JsonRootName("employeeInfo")
@JsonPropertyOrder({ "employeeId", "employeeName" })
@JsonIgnoreProperties({ "salary", "password" })
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "emp-id")
	@JsonProperty("employeeId")
	// @XmlAttribute(name = "emp-id")
	private int empId;

	@XmlElement
	@JsonProperty("employeeName")
	private String name;

	@XmlElement(name = "phone-no")
	@JsonProperty
	private long mobileNumber;

	@XmlElement(name = "mail-id")
	@JsonProperty
	private String mailId;

	@XmlElement
	@JsonProperty
	private Date dob;

	@XmlElement
	@JsonProperty
	private Date doj;

	@XmlElement(name = "dept-id")
	@JsonProperty
	private int detpId;

	@XmlElement
	@JsonProperty
	private double salary;

	// @XmlElement
	@JsonProperty
	@XmlTransient
	@JsonIgnore
	private String password;

}
