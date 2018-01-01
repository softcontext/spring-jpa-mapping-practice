package com.example.demo.mapping.relationship.identifying.embeddedid;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@Entity
public class Child {
	@EmbeddedId
	private ChildId id;
	
	@MapsId("parentId")
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PARENT_ID1", referencedColumnName="PARENT_ID1"),
		@JoinColumn(name="PARENT_ID2", referencedColumnName="PARENT_ID2")
	})
	private Parent parent;
	
	private String name;
	
	@EqualsAndHashCode
	@Embeddable
	public static class ChildId implements Serializable {
		private static final long serialVersionUID = 4568266419080776715L;
		
		@Column(name = "CHILD_ID")
		private String id;
		
		private Parent.ParentId parentId; // @MapsId("parentId") 매핑
	}
}
