package com.example.demo.mapping.relationship.nonidentifying.embeddedid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
//@Entity
public class Child {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHILD_ID")
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PARENT_ID1", referencedColumnName="PARENT_ID1"),
		@JoinColumn(name="PARENT_ID2", referencedColumnName="PARENT_ID2")
	})
	private Parent parent;
}
