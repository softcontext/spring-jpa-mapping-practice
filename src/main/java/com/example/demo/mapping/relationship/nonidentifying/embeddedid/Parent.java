package com.example.demo.mapping.relationship.nonidentifying.embeddedid;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@Entity
public class Parent {
	@EmbeddedId
	private ParentId parentId;

	private String name;
	
	@EqualsAndHashCode
	@Embeddable
	public static class ParentId implements Serializable {
		private static final long serialVersionUID = 4568266419080776715L;
		
		@Column(name = "PARENT_ID1")
		private Long id1;
		
		@Column(name = "PARENT_ID2")
		private Long id2;
	}
}

