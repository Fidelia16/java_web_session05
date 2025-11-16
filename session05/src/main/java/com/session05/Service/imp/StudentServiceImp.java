package com.session05.Service.imp;

import com.session05.Model.Student;
import com.session05.Repository.StudentRepository;
import com.session05.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    public Student findById(String id) {
        return studentRepository.findById(id);
    }
    @Override
    public List<Student> findByName(String keywords) {
        List<Student> students= studentRepository.findAll();
        return students.stream().filter(p->p.getName().toLowerCase().contains(keywords.toLowerCase())).collect(Collectors.toList());

    }

    @Override
    public boolean create(Student student) {
        return studentRepository.create(student);
    }

    @Override
    public boolean update(Student student) {
        studentRepository.update(student);
        return false;
    }

    @Override
    public boolean delete(String id) {
        studentRepository.delete(id);
        return false;
    }
}
