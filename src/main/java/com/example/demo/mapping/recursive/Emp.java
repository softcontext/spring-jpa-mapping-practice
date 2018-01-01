package com.example.demo.mapping.recursive;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude={"staff"})
//@Entity
public class Emp {
	@Id
	private Long empno;
	
	@Column(length = 10, nullable = false)
	private String ename;
	
	@Column(length = 9)
	private String job;
	
	// Recursive Relation : 직원은 1명의 보스를 갖는다.
	@ManyToOne 
	@JoinColumn(name = "mgr") // FK
	private Emp mgr; 
	
	// Recursive Relation : 직원은 다수의 부하직원을 갖는다.
	@OneToMany(mappedBy = "mgr") // mappedBy 설정을 Many 측에 한다.
	@JsonIgnore
	private List<Emp> staff = new ArrayList<Emp>(); 
	
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	
	private Double sal;
	private Double comm;
	
	@ManyToOne
	@JoinColumn(name = "deptno")
	private Dept dept;
	
	public void setDept(Dept dept){
		this.dept = dept;
		if (!dept.getEmps().contains(this)) {
			dept.getEmps().add(this);
		}
	}
}

