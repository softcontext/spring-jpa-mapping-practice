package com.example.demo.mapping.supertype.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
//@Entity
@DiscriminatorValue("A")
public class Album extends Item { // ITEM_ID 칼럼이 ALBUM 테이블에 PK/FK로 추가된다.
	private String artist;
}
