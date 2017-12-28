package com.example.demo.mapping.many2many.embeddedid;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@Entity
@AssociationOverrides({
    @AssociationOverride(name = "memberProductId.member",
        joinColumns = @JoinColumn(name = "MEMBER_ID")),
    @AssociationOverride(name = "memberProductId.product",
        joinColumns = @JoinColumn(name = "PRODUCT_ID")) 
})
public class MemberProduct {
	@EmbeddedId
	private MemberProductId memberProductId;
	
	private int orderAmount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
}

@EqualsAndHashCode
@Embeddable
class MemberProductId implements Serializable {
	private static final long serialVersionUID = 1506581890558573504L;
	
	@ManyToOne
//	@JoinColumn(name="MEMBER_ID") // @AssociationOverride 설정으로 대체할 수 있다.
	private Member member;
	
	@ManyToOne
//	@JoinColumn(name="PRODUCT_ID")
	private Product product;
}