package com.liceu.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Corsfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp=(HttpServletResponse) response;
        resp.addHeader("Acces-Controll-Allow-Origin","https://localhost:8080");
     //   resp.addHeader();
     //   resp.addHeader();
    //    resp.addHeader();


    }

    @Override
    public void destroy() {

    }
}
