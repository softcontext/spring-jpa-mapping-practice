package com.example.demo.mapping.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
//@Entity
public class Locker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LOCKER_ID")
	private Long id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name="MEMBER_ID")
	private Member member;
}
