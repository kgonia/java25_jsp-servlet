package org.sda.java25.trainings2.courses;

import java.util.List;

public interface ICourseRepository {

    void addCourse(Course course);

    List<Course> findAllCourse();

}
