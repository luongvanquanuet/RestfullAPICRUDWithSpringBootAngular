package com.abc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee implements java.io.Serializable{
	private static final long serialVersionUID=1L;
	private Long empId;
	private String empNo;
	private String empName;
	public Employee() {
		
	}
	public Employee(Long empId, String empNo, String empName) {
		this.empId=empId;
		this.empNo=empNo;
		this.empName=empName;
		
	}
	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empId",unique=true,nullable=false)
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	@Column(name="empNo",unique=true,nullable=false)
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	@Column(name="empName",unique=true,nullable=false)
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
