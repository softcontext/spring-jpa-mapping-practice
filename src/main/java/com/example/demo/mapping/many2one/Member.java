package com.example.demo.mapping.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
//@Entity
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MEMBER_ID")
	private Long id;
	
	private String username;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TEAM_ID")
	private Team team;
}
