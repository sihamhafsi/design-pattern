package dao;

import java.util.List;

import beans.Employee;

public interface Iemployeedao {
		void addEmployee(Employee employee);
	    void deleteEmployee(int id);
	    List<Employee> getAllEmployees();
	    Employee getEmployeeById(int id);

}
