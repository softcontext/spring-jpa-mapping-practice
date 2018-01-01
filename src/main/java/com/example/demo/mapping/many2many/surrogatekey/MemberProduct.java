package com.example.demo.mapping.many2many.surrogatekey;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
//@Entity
public class MemberProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORDER_ID")
	private Long id; // surrogate key
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID")
	private Member member; // FK
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product; // FK
	
	private int orderAmount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
}
