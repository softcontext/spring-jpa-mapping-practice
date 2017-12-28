package com.example.demo.mapping.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
//@Entity
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MEMBER_ID")
	private Long id;
	
	private String username;
	
	@OneToOne(mappedBy="member")
	private Locker locker;
}
