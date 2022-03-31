package com.app.factory;

import com.app.dao.EmployeeDao;
import com.app.dao.impl.EmployeeDaoImpl;

public class EmployeeFactory 
{
	public static EmployeeDao getEmployee() 
	{
		return new EmployeeDaoImpl();
	}
}
