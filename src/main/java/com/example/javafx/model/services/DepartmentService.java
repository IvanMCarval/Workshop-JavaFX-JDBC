package com.example.javafx.model.services;

import com.example.javafx.model.dao.DaoFactory;
import com.example.javafx.model.dao.DepartmentDao;
import com.example.javafx.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
