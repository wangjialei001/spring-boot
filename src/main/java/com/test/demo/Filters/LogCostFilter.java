package com.test.demo.Filters;


import javax.servlet.*;
import java.io.IOException;

/**
 * @program: demo
 * @description: 记录请求时间
 * @author: Mr.Wang
 * @create: 2019-12-12 20:16
 **/

public class LogCostFilter implements Filter {

//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start=System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Execute cost="+(System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {

    }
}
