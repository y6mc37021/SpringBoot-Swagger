package com.company.swaggeropenapi.swaggeropenapi;

public class Employee {
	
	private long employeeId;
	private String name;
	private String gender;
	private String departement;
	private long phoneNumber;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(long employeeId, String name, String gender, String departement, long phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.departement = departement;
		this.phoneNumber = phoneNumber;
	}

	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", gender=" + gender + ", departement="
				+ departement + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
	

}
