package com.learnyeai.demo.api.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnyeai.demo.api.data.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

}
