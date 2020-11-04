package com.liceu.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Authenticatorfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }

    @WebServlet
    public static class TargetServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String nom = req.getParameter("nom");
            PrintWriter pw = resp.getWriter();
            pw.print("<html>");
            pw.print("<head></head>");
            pw.print("<html>");
            pw.print("<html>");
            pw.print("<html>");


        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            super.doPost(req, resp);
        }

       // private serveRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //     HttpSession session = req.getSession();
       //     String id = session.getId();
       //     System.out.println();
        //
       // }
    }
}
