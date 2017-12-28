package com.example.demo.mapping.many2one;

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
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEAM_ID")
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="team")
	private List<Member> members = new ArrayList<>();
}
