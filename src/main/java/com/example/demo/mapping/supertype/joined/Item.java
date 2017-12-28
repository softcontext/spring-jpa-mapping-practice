package com.example.demo.mapping.supertype.joined;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Data
//@Entity
@Inheritance(strategy=InheritanceType.JOINED) // create tables respectively
@DiscriminatorColumn(name="DTYPE") // "DTYPE" is default
public abstract class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ITEM_ID")
	private Long id;
	
	private String name;
	private double price;
}
