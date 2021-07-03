package com.computernerd.jpamapping.service;

import com.computernerd.jpamapping.dao.CourseDao;
import com.computernerd.jpamapping.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
   private CourseDao courseDao;
    // List<Course> courses;
   // public CourseServiceImpl() {
//        courses = new ArrayList<>();
//        courses.add(new Course(1, "Java", "excellent"));
//        courses.add(new Course(2, "Python", "extraordinary"));
//        courses.add(new Course(3, "C++", "outstanding"));
//        courses.add(new Course(4, "C", "marvelous"));
    //}
    @Override
    public List<Course> getCourses() {
        List<Course> courses = (List<Course>) courseDao.findAll();
        return courses;
    }

    @Override
    public Optional<Course> getCourse(long courseId)  {
        return courseDao.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
       courseDao.save(course);
       return course;
    }
d
    @Override
    public Course updateCourse(Course course) {
          courseDao.save(course);
          return course;
    }

    @Override
    public ResponseEntity<HttpStatus> deleteCourse(long courseId)  {
        Optional<Course> course = courseDao.findById(courseId);
        if (course.isPresent()) {
           courseDao.deleteById(courseId);
           return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
