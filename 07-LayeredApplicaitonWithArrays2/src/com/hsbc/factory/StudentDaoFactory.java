package com.hsbc.factory;

import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoArrayImpl;
import com.hsbc.dao.StudentDaoCollectionImpl;

public class StudentDaoFactory {
    private static StudentDao dao = null;
    private static StudentDaoFactory instance = null;

    private StudentDaoFactory(){
    }
    public static StudentDaoFactory getInstance(){
        if(instance == null){
            instance = new StudentDaoFactory();
        }
        return instance;
    }
    public  StudentDao createStudentDao(int ch){
        if(ch ==1){
            dao = new StudentDaoArrayImpl();
        } else if (ch == 2) {
            dao = new StudentDaoCollectionImpl();
        }
        return dao;
    }

}
