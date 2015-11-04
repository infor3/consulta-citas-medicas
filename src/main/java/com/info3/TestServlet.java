package com.info3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "hola", urlPatterns = "/hola")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        if("admin".equals(nombre)) {
            req.setAttribute("valido", true);
        } else {
            req.setAttribute("valido", false);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/feedback.jsp");
        requestDispatcher.forward(req, resp);
    }
}
