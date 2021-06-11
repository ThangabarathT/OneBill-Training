package com.onebill.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "subscriber_info")
public class Subscriber {

	@Id
	@Column
	private int sid;
	
	@Column
	private String sname;
}
