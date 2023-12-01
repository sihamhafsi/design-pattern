package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySqlConnection implements IConnection {
    private Connection connection;

    @Override
    public void insert(String query) {
     // insérer des employees 
    }

    @Override
    public void delete(String query) {
       //supprimer des employees
    }

    @Override
    public void select(String query) {
        // selectionner des employees
    }
    
}
