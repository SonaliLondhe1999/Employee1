package com.app.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.dao.EmployeeDao;
import com.app.dto.EmployeeRequest;
import com.app.model.Employee;
import com.app.service.EmployeeService;
import com.app.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao
{
	public int register() 
	{
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			Employee employee = new EmployeeService().register();
			session.save(employee);
			tx.commit();

			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public Employee login() {
		Session session = null;
		Transaction tx = null;
		Employee empResponse=new Employee();
		try {
			SessionFactory factory= factory=new Configuration()
                    .configure("hibernate.cfg.xml")
		            .buildSessionFactory();
			session = factory.openSession();
		
			tx = session.beginTransaction();
			EmployeeRequest employee = new EmployeeService().login();
			Query<Employee> query = session.createQuery(
					"From Employee e where ename='" + employee.getEname() + "' and password='" + employee.getPassword()+ "' ");
			empResponse = query.uniqueResult();
				
			
			return empResponse;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		}

	

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		SessionFactory factory= factory=new Configuration()
                .configure("hibernate.cfg.xml")
	            .buildSessionFactory();
	Session	session = factory.openSession();
	Transaction tx =session.beginTransaction();
		Query query=session.createQuery("From Employee e where e.id=:id");
		query.setParameter("id", id);
		List<Employee> employee=query.list();
		return employee.get(0);
	}

	public List<Employee> listOfEmployees() {
		SessionFactory factory= factory=new Configuration()
                .configure("hibernate.cfg.xml")
	            .buildSessionFactory();
	Session	session = factory.openSession();
	Transaction tx =session.beginTransaction();
		Query query=session.createQuery("From Employee");
		return query.list();
	}


}
