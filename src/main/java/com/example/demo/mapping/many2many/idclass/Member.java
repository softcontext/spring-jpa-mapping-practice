package com.example.demo.mapping.many2many.idclass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
//@Entity
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MEMBER_ID")
	private Long id;
	
	private String username;
	
	@OneToMany(mappedBy="member")
	private List<MemberProduct> memberProducts = new ArrayList<>();
}
