package com.computernerd.jpamapping.service;

import com.computernerd.jpamapping.entity.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface CourseService {
    public List<Course> getCourses();
    public Optional<Course> getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public ResponseEntity<HttpStatus> deleteCourse(long courseId);
}
