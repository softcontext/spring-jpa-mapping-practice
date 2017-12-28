package com.example.demo.mapping.relationship.identifying.idclass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@Entity
@IdClass(Parent.ParentId.class)
public class Parent {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // 적용되지 않는다.
	@Column(name = "PARENT_ID1")
	private Long id1;

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Composite PKs are ASSIGNMENT-based not GENERATION-based.
	@Column(name = "PARENT_ID2")
	private Long id2;

	private String name;
	
	@EqualsAndHashCode
	public static class ParentId implements Serializable {
		private static final long serialVersionUID = 4568266419080776715L;
		private Long id1;
		private Long id2;
	}
}

