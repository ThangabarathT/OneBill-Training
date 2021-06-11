package com.onebill.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "plan_info")
public class PlanOneToOne {

	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@Exclude
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="one_to_one", joinColumns=@JoinColumn(name="pid"),inverseJoinColumns=@JoinColumn(name="sid"))
	private Subscriber subscribers;
}
