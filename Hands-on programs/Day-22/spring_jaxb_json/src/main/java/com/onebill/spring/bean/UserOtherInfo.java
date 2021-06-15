package com.onebill.spring.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "other-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserOtherInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement
	private int age;

	@XmlElement
	private String gender;

	@XmlElement(name = "is-married")
	private boolean isMarried;

}
