package com.onebill.spring.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "user-addresses")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserAddresses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "house-no")
	private int houseNumber;

	@XmlElement
	private String street;

	@XmlElement
	private String city;

	@XmlElement(name = "address-type")
	private char typeOfAddress;

}
