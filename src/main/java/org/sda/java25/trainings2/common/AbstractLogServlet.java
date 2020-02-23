package org.sda.java25.trainings2.common;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractLogServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logURI(req);
        super.service(req, resp);
    }

    private void logURI(HttpServletRequest request){
        System.out.println(getClass().getSimpleName());
        System.out.println(request.getRequestURI());
    }
}
