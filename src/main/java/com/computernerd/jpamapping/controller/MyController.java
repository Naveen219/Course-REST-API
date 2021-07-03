package com.computernerd.jpamapping.controller;

import com.computernerd.jpamapping.entity.Course;
import com.computernerd.jpamapping.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String home() {
        return "this is home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Object getCourse(@PathVariable long courseId) {
        Optional<Course> course = this.courseService.getCourse(courseId);
        if (course.isPresent()) {
            return course;
        }
        return "Course not found!";
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);

    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseId) {
        ResponseEntity<HttpStatus> httpStatusResponseEntity = this.courseService.deleteCourse(courseId);
        return httpStatusResponseEntity;
    }
}
