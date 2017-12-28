package com.example.demo.mapping.supertype.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
//@Entity
@DiscriminatorValue("A") // 생략하면 클래스명을 사용한다.
public class Album extends Item { // ITEM_ID 칼럼이 ALBUM 테이블에 PK/FK로 추가된다.
	private String artist;
}
