package com.liceu.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "com.liceu.filters.Performancefilter")

public class Performancefilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       //Abans de generar la resposta
        long time = System.nanoTime();
        chain.doFilter(request,response);
        //Despres de generar la resposta
        time = System.nanoTime() - time;
        System.out.println(time);
        HttpServletRequest req=(HttpServletRequest) request;
        req.setAttribute("treposta",time);
    }

    @Override
    public void destroy() {

    }
}
