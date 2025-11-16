package com.session05.Repository.imp;

import com.session05.Model.Student;
import com.session05.Repository.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentRepositoryImp implements StudentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("from Student", Student.class).getResultList();
    }

    @Transactional
    public boolean create(Student student) {
        try {
            entityManager.merge(student);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Student findById(String StudentId) {
        return entityManager.createQuery("from Student where id = :id", Student.class)
                .setParameter("id", StudentId).getSingleResult();
    }
@Transactional
    @Override
    public boolean update(Student student) {
        try {
            entityManager.merge(student);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
@Transactional
    @Override
    public boolean delete(String id) {
        try {
            Student student= findById(id);
            entityManager.remove(student);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
