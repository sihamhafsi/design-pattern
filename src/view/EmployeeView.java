package view;

import beans.Employee;
import service.EmployeeService;

public class EmployeeView {
	private static EmployeeService employeeService;
    private static EmployeeView instance;
    
    private EmployeeView(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public static EmployeeView getInstance() {
        if (instance == null) {
            instance = new EmployeeView(employeeService);
        }
        return instance;
    }

    public void displayEmployeeDetails(Employee employee) {
        System.out.println("ID: " + employee.getId());
        System.out.println("Nom: " + employee.getNom());
    }
}
