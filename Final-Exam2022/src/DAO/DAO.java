package DAO;

import java.util.ArrayList;

public interface DAO<T> {

    public boolean insert(T t);
    public boolean delete(T t);
    public boolean update(T t);
    public T find(T t);
    public ArrayList<T> showAll();
}
