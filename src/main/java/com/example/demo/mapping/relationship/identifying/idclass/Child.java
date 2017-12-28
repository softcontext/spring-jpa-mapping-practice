package com.example.demo.mapping.relationship.identifying.idclass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@Entity
@IdClass(Child.ChildId.class)
public class Child {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // 적용되지 않는다.
	@Column(name = "CHILD_ID")
	private Long id;
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PARENT_ID1", referencedColumnName="PARENT_ID1"),
		@JoinColumn(name="PARENT_ID2", referencedColumnName="PARENT_ID2")
	})
	private Parent parent;
	
	private String name;
	
	@EqualsAndHashCode
	public static class ChildId implements Serializable {
		private static final long serialVersionUID = 4568266419080776715L;
		private Long id;
		private Parent parent;
	}
}
