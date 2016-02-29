package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @autor Dmitry Vyazelenko
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!Thread.currentThread().getContextClassLoader().getClass().getName().equals("test.CustomClassLoader")) {
            throw new IllegalStateException("Invalid ClassLoader used: " + Thread.currentThread().getContextClassLoader());
        }
        resp.getWriter().write("Everything good!");
    }
}