package com.example.demo.mapping.supertype.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
//@Entity
@DiscriminatorValue("M")
public class Movie extends Item { // ITEM_ID 칼럼이 MOVIE 테이블에 PK/FK로 추가된다.
	private String director;
	private String actor;
}
