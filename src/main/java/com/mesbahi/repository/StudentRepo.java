package com.mesbahi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesbahi.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	List<Student> findByNameContaining(String name);

}
