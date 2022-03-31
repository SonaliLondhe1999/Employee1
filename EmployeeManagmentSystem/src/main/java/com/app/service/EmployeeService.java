package com.app.service;

import com.app.dto.EmployeeRequest;
import com.app.dto.InputRequest;
import com.app.model.Employee;


public class EmployeeService 
{
	public Employee register() {
		return InputRequest.register();
		
	}
	public EmployeeRequest login() {
		return InputRequest.login();
		
	}
}
