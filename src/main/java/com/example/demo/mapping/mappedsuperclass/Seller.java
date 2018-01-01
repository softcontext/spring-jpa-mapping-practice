package com.example.demo.mapping.mappedsuperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
//@Entity
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="SELLER_ID")),
	@AttributeOverride(name="name", column=@Column(name="SELLER_NAME"))
})
public class Seller extends BaseEntity {
	private String shopName;
}
