package com.session05.Service;

import com.session05.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    List<Student> findByName(String keywords);
    Student findById(String id);
    boolean create(Student student);
    boolean update(Student student);
    boolean delete(String id);

}
