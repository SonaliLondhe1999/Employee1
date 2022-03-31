package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeDao
{
	int register();
	Employee login();
	List<Employee> listOfEmployees();
	Employee findById(int id);
}
