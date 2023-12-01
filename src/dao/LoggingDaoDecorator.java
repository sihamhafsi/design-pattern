package dao;
import java.util.List;
import java.util.logging.Logger;
import dao.Iemployeedao;
import beans.Employee;
import dao.EmployeeDAO;
public class LoggingDaoDecorator implements Iemployeedao {
    private Iemployeedao decoratedDao;
    private Logger logger;
    public LoggingDaoDecorator(Iemployeedao decoratedDao) {
        this.decoratedDao = decoratedDao;
        this.logger = Logger.getLogger(LoggingDaoDecorator.class.getName());
    }
    @Override
    public void addEmployee(Employee employee){
        decoratedDao.addEmployee(employee);
        log("Date : insertion - Employee with ID " + employee.getId() + " inserted.");
    }
    @Override
    public void deleteEmployee(int id) {
        decoratedDao.deleteEmployee(id);
        log("Date : suppression - Employee with ID " + id + " deleted.");
    }
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = decoratedDao.getAllEmployees();
        log("Date : listing - Retrieved all employees.");
        return employees;
    }
    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = decoratedDao.getEmployeeById(id);
        log("Date : recherche - Retrieved employee with ID " + id);
        return employee;
    }
    private void log(String message) {
        // Log the message to a log file (e.g., db.log)
        logger.info(message);
    }
}
