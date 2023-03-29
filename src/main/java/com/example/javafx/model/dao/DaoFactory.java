package com.example.javafx.model.dao;

import com.example.javafx.db.DB;
import com.example.javafx.model.dao.impl.DepartmentDaoImplJDBC;
import com.example.javafx.model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {
  public static SellerDao createSellerDao() {
    return new SellerDaoImplJDBC(DB.getConnection());
  }

  public static DepartmentDao createDepartmentDao() {
    return new DepartmentDaoImplJDBC(DB.getConnection());
  }
}
