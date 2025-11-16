package com.session05.Repository;

import com.session05.Model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    boolean create(Student student);
    Student findById(String id);
    boolean update(Student student);
    boolean delete(String id);
}
