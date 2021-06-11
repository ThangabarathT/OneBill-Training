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
@Table(name = "Cart")
public class Cart {
	@Id
	@Column
	private int cid;

	@Column
	private String cname;

//	@Exclude
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cart")
//	private Item item;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	private List<Item> items;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="id")
//	private Item items;

}
