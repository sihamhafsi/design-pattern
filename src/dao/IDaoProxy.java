package dao;

import beans.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IDaoProxy {
    void insertEmployee(Employee employee, String user) throws SQLException;

    void deleteEmployee(int id, String user) throws SQLException;

    List<Employee> selectAllEmployees();

    Employee selectEmployeeById(int id);
}
