package com.mesbahi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesbahi.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
	List<Course> findByFeeLessThan(double fee);

}
