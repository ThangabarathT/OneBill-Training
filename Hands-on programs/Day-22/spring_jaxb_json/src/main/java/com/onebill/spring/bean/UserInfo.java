package com.onebill.spring.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

@Data
@XmlRootElement(name = "user-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "emp-id")
	private int empid;

	@XmlElement
	private String name;

	@XmlElement(name = "email-id")
	private String emailId;

	@XmlElement
	private double salary;

	@XmlTransient
	private String password;

	@XmlElement(name = "other-info")
	@JsonProperty("otherInfo")
	private UserOtherInfo userOtherInfo;

	@XmlElementWrapper(name = "user-addresses")
	private List<UserAddresses> userAddresses;
}
