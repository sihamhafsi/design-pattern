package dao;

import beans.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements Iemployeedao {
    private static EmployeeDAO instance;
    private List<Employee> employeeList;

    private EmployeeDAO() {
        // Constructeur privé pour empêcher l'instanciation directe
        employeeList = new ArrayList<>();
    }

    public static EmployeeDAO getInstance() {
        if (instance == null) {
            instance = new EmployeeDAO();
        }
        return instance;
    }

    // Méthode pour ajouter un employé
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // Méthode pour récupérer un employé par ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null; // Retourne null si l'employé n'est pas trouvé
    }

    // Méthode pour lister tous les employés
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Méthode pour supprimer un employé par ID
    public void deleteEmployee(int id) {
        employeeList.removeIf(employee -> employee.getId() == id);
    }
}
