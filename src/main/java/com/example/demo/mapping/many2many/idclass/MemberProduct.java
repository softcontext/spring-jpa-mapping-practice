package com.example.demo.mapping.many2many.idclass;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@Entity
@IdClass(MemberProductId.class)
public class MemberProduct {
	@Id
	@ManyToOne
	@JoinColumn(name="MEMBER_ID")
	private Member member; // MemberProductId.member
	
	@Id
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product; // MemberProductId.product
	
	private int orderAmount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
}

@EqualsAndHashCode
class MemberProductId implements Serializable {
	private static final long serialVersionUID = 1506581890558573504L;
	private Long member;
	private Long product;
}