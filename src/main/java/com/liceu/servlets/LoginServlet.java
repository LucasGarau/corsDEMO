package com.liceu.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value="/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user= req.getParameter("username");
        String pass= req.getParameter("password");

        if (user.equals("admin") && pass.equals("1234")){
            req.setAttribute("username", user);
            HttpSession session = req.getSession();
            session.setAttribute("username", user);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/postlogin.jsp");
        dispatcher.forward(req,resp);
    }
}
