package com.deptemphiberxmlh2dbapp.model;

import java.util.List;
import java.util.Set;

public class Department {
	
	private int deptId;
	private String deptName;
	private String deptLoc;
	public Set<Employee> employee;
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	
	
	
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	public Department() {
		super();
	}
	public Department(int deptId, String deptName, String deptLoc) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}
	

}
