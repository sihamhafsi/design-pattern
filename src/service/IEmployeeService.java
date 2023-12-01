package service;
import java.util.List;

import beans.Employee;
public interface IEmployeeService {
	Employee duplicateEmployee(int id);
    void addEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void deleteEmployee(int id);
    Employee createEmployee(String nom, String prenom, int age, String adresse, String email,
    		String poste, double salaire, String département, String dateEmbauche, boolean actif);

}
