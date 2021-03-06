package org.sda.java25.trainings2.courses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "courseListServlet", value = "/courseslist")
public class CoursesListServlet extends HttpServlet {

    private CourseService courseService = new CourseService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("courses", courseService.findAllCourses());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("courses/courseslist.jsp");
        requestDispatcher.forward(req, resp);
    }
}
