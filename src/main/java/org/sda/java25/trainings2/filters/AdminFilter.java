package org.sda.java25.trainings2.filters;

import org.sda.java25.trainings2.users.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static org.sda.java25.trainings2.users.LoginServlet.USER_SESSION_KEY;

@WebFilter(value = {"/courses/addCourse.jsp", "/addcourse"})
public class AdminFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession httpSession = req.getSession();
        User loggedInUser = (User) httpSession.getAttribute(USER_SESSION_KEY);

        if (loggedInUser != null && loggedInUser.isAdmin()) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect("/");
        }
    }

    @Override
    public void destroy() {

    }
}
