package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    private static List<Student> list;
    private static int lastId;

    static {
        list = new ArrayList<>();
        Student s1 = new Student(1, "Quang Huy", 1000000, LocalDate.parse("2000-01-01"));
        Student s2 = new Student(2, "Lê Nam", 2000000, LocalDate.parse("2002-01-02"));
        list.add(s1);
        list.add(s2);
        lastId = list.size();
    }

    @Override
    public List<Student> findAll() {
        //JPQL: java persistence query language
        // select * from student SQL
        String jpql = "select s from Student s";

        //HQL: hibernate query language
        String hql = "from Student s";
        TypedQuery<Student> typedQuery = entityManager.createQuery(jpql, Student.class);

        return typedQuery.getResultList();
    }

    @Override
    @Transactional //thêm sửa xóa phải thêm
    public void save(Student student) {
//        lastId++;
//        student.setId(lastId);
//        list.add(student);

        entityManager.persist(student);
//        entityManager.merge(student); update full trường
//          entityManager.remove(); xóa dưới db
    }
}
