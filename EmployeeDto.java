package com.global.dto;

import java.time.LocalDate;

public class EmployeeDto {

	private Long id;
	private String fullName;
	private String empFirstName;
	private String empLastName;
	private Double empSalary;
	private LocalDate hireDate;
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
     public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public EmployeeDto() {
		super();
	}

	public EmployeeDto(Long id, String fullName, String empFirstName, String empLastName, Double empSalary,
			LocalDate hireDate) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.hireDate = hireDate;
	}
	
	
}
