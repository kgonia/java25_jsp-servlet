package org.sda.java25.trainings2.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseRepository implements ICourseRepository {

    private Map<String, Course> courseMap = new HashMap<>();

    private static CourseRepository INSTANCE = new CourseRepository();

    private CourseRepository() {
    }

    public static CourseRepository getInstance(){
        return INSTANCE;
    }

    @Override
    public void addCourse(Course course) {
        courseMap.put(course.getName(), course);
    }

    @Override
    public List<Course> findAllCourse() {
        return new ArrayList<>(courseMap.values());
    }
}
