package org.sda.java25.trainings2.courses;

import java.util.List;

public class CourseService {

    private CourseRepository courseRepository = CourseRepository.getInstance();

    public boolean addCourse(Course course){
        courseRepository.addCourse(course);
        return true;
    }

    public List<Course> findAllCourses(){
        return courseRepository.findAllCourse();
    }

    public void delete(String name) {
        courseRepository.delete(name);
    }
}
