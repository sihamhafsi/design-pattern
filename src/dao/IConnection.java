package dao;

import java.util.List;

public interface IConnection {
    void insert(String query);
    void delete(String query);
    void select(String query);
}

