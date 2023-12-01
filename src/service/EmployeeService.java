package service;
import java.util.ArrayList;
import java.util.List;
import beans.Employee;
import dao.EmployeeDAO;
public class EmployeeService implements IEmployeeService{
	private static EmployeeService instance;
    private List<Employee> employees;
    private static EmployeeDAO employeeDAO;
    private EmployeeService(EmployeeDAO employeeDAO) {
        employees = new ArrayList<>();
        this.employeeDAO = employeeDAO;
    }
    public static EmployeeService getInstance() {
        if (instance == null) {
            instance = new EmployeeService(employeeDAO);
        }
        return instance;
    }
    
    public Employee duplicateEmployee(int id) {
        Employee existingEmployee = employeeDAO.getEmployeeById(id);

        if (existingEmployee != null) {
            Employee clonedEmployee = existingEmployee.clone(); 
            addEmployee(clonedEmployee); 
            return clonedEmployee; 
        }
        
        return null;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
    public Employee createEmployee(String nom, String prenom, int age, String adresse, String email, 
    		String poste, double salaire, String département, String dateEmbauche, boolean actif) {
        return new Employee.Builder()
            .withNom("hafsi")
            .withPrenom("khalil")
            .withAge(22)
            .withAdresse("fath2")
            .withEmail("hafsikhalil@gmail.com")
            .withPoste("students")
            .withSalaire(0)
            .withDepartement("MI")
            .withDateEmbauche("1/11/2027")
            .withActif(true)
            .build();
    }
}
