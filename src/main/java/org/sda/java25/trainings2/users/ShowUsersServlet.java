package org.sda.java25.trainings2.users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "showUserServlet", value = "/userslist")
public class ShowUsersServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", userService.findAllUsers());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("users/userpage.jsp");
        requestDispatcher.forward(req, resp);
    }
}
