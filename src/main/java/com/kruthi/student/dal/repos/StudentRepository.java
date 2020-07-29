package com.kruthi.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.kruthi.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student ,Long> {

}