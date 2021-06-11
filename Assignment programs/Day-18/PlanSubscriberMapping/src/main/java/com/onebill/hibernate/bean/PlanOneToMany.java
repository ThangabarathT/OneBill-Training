package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "plan_info")
public class PlanOneToMany {

	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="one_to_many", joinColumns=@JoinColumn(name="pid"),inverseJoinColumns=@JoinColumn(name="sid"))
	private List<Subscriber> subscribers;
}
