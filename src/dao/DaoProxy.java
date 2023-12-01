package dao;
import beans.Employee;
import java.sql.SQLException;
import java.util.List;
public class DaoProxy implements IDaoProxy {
    private EmployeeDAO employeeDAO;
    public DaoProxy(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    public void insertEmployee(Employee employee, String user) throws SQLException {
        if (isGranted(user)) {
            employeeDAO.addEmployee(employee);;
        } else {
            // Gérer l'autorisation refusée
            throw new SecurityException("L'utilisateur n'est pas autorisé à effectuer cette opération.");
        }
    }
    @Override
    public void deleteEmployee(int id, String user) throws SQLException {
        if (isGranted(user)) {
            employeeDAO.deleteEmployee(id);
        } else {
            // Gérer l'autorisation refusée
            throw new SecurityException("L'utilisateur n'est pas autorisé à effectuer cette opération.");
        }
    }
    @Override
    public List<Employee> selectAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    @Override
    public Employee selectEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }
    private boolean isGranted(String user) {
        // Vérifiez si l'utilisateur a le droit de réaliser l'opération
        return true;
    }
}

