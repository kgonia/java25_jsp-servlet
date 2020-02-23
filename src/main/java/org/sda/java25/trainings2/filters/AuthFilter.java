package org.sda.java25.trainings2.filters;

import org.sda.java25.trainings2.users.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.sda.java25.trainings2.users.LoginServlet.USER_SESSION_KEY;

@WebFilter(value = "/*")
public class AuthFilter implements Filter {

    private List<String> whiteListURL;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        whiteListURL = Arrays.asList("/", "/users/addUser.jsp",
                "/adduser", "/users/registerConfirmation.jsp",
                "/login");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String URI = req.getRequestURI();

        HttpSession httpSession = req.getSession();
        User loggedInUser = (User) httpSession.getAttribute(USER_SESSION_KEY);

        if (whiteListURL.contains(URI) || loggedInUser != null) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect("/");
        }
    }

    @Override
    public void destroy() {

    }
}
