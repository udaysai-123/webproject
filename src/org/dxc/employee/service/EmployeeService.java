package org.dxc.employee.service;

import org.dxc.employee.dao.EmployeeDao;
import org.dxc.employee.model.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao=new EmployeeDao();

	public boolean login(Employee employee) {
		//login
		return employeeDao.Validatelogin(employee);
		
	}

}
