package com.app.test;

import java.util.List;
import java.util.Scanner;

import com.app.dao.EmployeeDao;
import com.app.factory.EmployeeFactory;
import com.app.model.Employee;

public class Client 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		EmployeeDao dao = new EmployeeFactory().getEmployee();
		String ch="";
		do {
			System.out.println("------------Welcome To Employee Management System----------");
			System.out.println("Press 1: for Register");
			System.out.println("Press 2: for Login");
			System.out.println("Press 3: for Display Employee");
			System.out.println("Press 4: for Display Employee on id");
			System.out.println("-------------------------------");
			System.out.println("Enter Your Choice:");
			int choice=sn.nextInt();
			switch (choice) {
			case 1:
				int i=dao.register();
				if(i==1) {
					System.out.println("Successfully Register");
				}else {
					System.out.println("Something went wrong...!");
				}
				break;
			case 2:
				Employee employee=dao.login();
				//if(employee!=null &&employee.getEname().equalsIgnoreCase("employee")&&employee.getEname().equalsIgnoreCase("employee")) {
					//System.out.println("welcome to Employee portal.");
				//}else 
				if(employee!=null &&employee.getEname().equalsIgnoreCase("employee")&&employee.getEname().equalsIgnoreCase("employee")){
					System.out.println("Welcome to Employee Portal..");
				}else {
					System.out.println("Invallid username and password");
				}
				break;
			case 3:
				List<Employee>list=dao.listOfEmployees();
				list.stream().forEach(s->System.out.println(s.getId()+"\t"+s.getFisrtName()+" "+s.getLastName()+"\t"+s.getAddress()+"\t"+s.getMobile()));
			break;
			case 4:
				System.out.println("Enter your id for find user:");
				int id=sn.nextInt();
				Employee u1=dao.findById(id);
				System.out.println(u1);
				break;
			default:
				System.out.println("Invalid Request...!");
				break;
			}
			System.out.println("Do you want to continue...(y)");
			ch=sn.next();
		}while(ch.equalsIgnoreCase("y"));
		System.out.println("Thank you");
			
	

	}

}
