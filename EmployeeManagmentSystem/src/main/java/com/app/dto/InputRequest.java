package com.app.dto;

import java.util.Scanner;

import com.app.model.Employee;

public class InputRequest
{
	static  Scanner sn=new Scanner(System.in);
	 public static Employee register() {
		
		 System.out.println("Enter Employee Details:");
		 System.out.println("Enter Employee first name:");
		 String fname=sn.next();
		 System.out.println("Enter Employee Last name:");
		 String lname=sn.next();
		 System.out.println("Enter Employee address:");
		 String address=sn.next();
		 System.out.println("Enter Employee mobile:");
		 long mob=sn.nextLong();
		 System.out.println("Enter Employee Department:");
		 String dept=sn.next();
		 System.out.println("Enter Employee Salary:");
		 double salary=sn.nextDouble();
		 System.out.println("Enter Employee  name:");
		 String ename=sn.next();
		 System.out.println("Enter Employee password:");
		 String pass=sn.next();
		return addEmployee(fname, lname, address, mob,dept,salary,ename, pass);
		 
	 }
	public static EmployeeRequest login() {
		System.out.println("Enter Employee  name:");
		 String ename=sn.next();
		 System.out.println("Enter Employee password:");
		 String pass=sn.next();
		 System.out.println("Enter Employee Department:");
		 String dept=sn.next();
		 return new EmployeeRequest(ename,pass,dept);
	 }


	private static Employee addEmployee(String fname, String lname, String address, long mob,String dept,double salary, String ename, String pass) 
	{
		Employee emp=new Employee();
		 emp.setAddress(address);
		 emp.setFisrtName(fname);
		 emp.setLastName(lname);
		 emp.setMobile(mob);
		 emp.setPassword(pass);
		 emp.setDept(dept);
		 emp.setSalary(salary);
		 emp.setEname(ename);
		 return emp;
	}
}
