package org.sda.java25.trainings2.courses;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "addCourseServlet", value = "/addcourse")
public class AddCourseServlet extends HttpServlet {

    private CourseService courseService = new CourseService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int participants = Integer.valueOf(req.getParameter("participants"));
        BigDecimal price = new BigDecimal(req.getParameter("price"));

        Course course = new Course(name, participants, price);
        courseService.addCourse(course);

        courseService.findAllCourses()
                .forEach(course1 -> System.out.println(course1.getName()));

    }
}
