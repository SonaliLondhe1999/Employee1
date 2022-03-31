package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Employee")
public class Employee
{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String fisrtName;
	private String lastName;
	private String address;
	private long mobile;
	private String Dept;
	private double salary;
	private int yearofjoining;
	private String ename;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee()
	{
		super();
	}
	
	public Employee(int id, String fisrtName, String lastName, String address, long mobile, String dept, double salary,
			int yearofjoining, String ename, String password) {
		super();
		this.id = id;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		Dept = dept;
		this.salary = salary;
		this.yearofjoining = yearofjoining;
		this.ename = ename;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", address=" + address
				+ ", mobile=" + mobile + ", Dept=" + Dept + ", salary=" + salary + ", yearofjoining=" + yearofjoining
				+ ", ename=" + ename + ", password=" + password + "]";
	}
	
	
}

