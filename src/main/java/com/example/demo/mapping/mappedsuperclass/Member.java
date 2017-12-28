package com.example.demo.mapping.mappedsuperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
//@Entity
@AttributeOverride(name="name", column=@Column(name="MEMBER_NAME"))
public class Member extends BaseEntity {
	private String email;
}
