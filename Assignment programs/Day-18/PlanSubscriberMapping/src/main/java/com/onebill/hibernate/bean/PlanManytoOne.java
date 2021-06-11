package com.onebill.hibernate.bean;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "plan_info")
public class PlanManytoOne {

	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@Exclude
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="many_to_one", joinColumns=@JoinColumn(name="pid"),inverseJoinColumns=@JoinColumn(name="sid"))
	private Subscriber subscribers;
}
