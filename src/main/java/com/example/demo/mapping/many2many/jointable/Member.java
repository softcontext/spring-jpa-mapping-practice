package com.example.demo.mapping.many2many.jointable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
//@Entity
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MEMBER_ID")
	private Long id;
	
	private String username;
	
	@ManyToMany
	@JoinTable(name="MEMBER_PRODUCT", joinColumns={
			@JoinColumn(name="MEMBER_ID")
	}, inverseJoinColumns={
			@JoinColumn(name="PRODUCT_ID")
	})
	private List<Product> products = new ArrayList<>();
}
