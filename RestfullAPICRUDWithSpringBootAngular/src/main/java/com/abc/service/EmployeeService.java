package com.abc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.EmployeeDAO;
import com.abc.entities.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	public Employee getEmployee(Long empId) {
		return employeeDAO.getEmployee(empId);
	}
	public Employee addEmployee(Employee empForm) {
		return employeeDAO.addEmployee(empForm);
	}
	public Employee updateEmployee(Employee empForm) {
		return employeeDAO.updateEmployee(empForm);
	}
	public void deleteEmployee(Long empId) {
		employeeDAO.deleteEmployee(empId);
	}
	public List<Employee> getAllEmployees(){
		return employeeDAO.getAllEmployees();
	}

}
