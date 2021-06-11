package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "Item")
public class Item {
	@Id
	@Column
	private int id;

	@Column
	private String itemname;

//	@Exclude
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "cid")
//	private Cart cart;

	@Exclude
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private Cart cart;
	
//	@Exclude
//	@OneToMany(cascade=CascadeType.ALL, mappedBy="items")
//	@JoinColumn(name="id")
//	private List<Cart> cart;
	
}
