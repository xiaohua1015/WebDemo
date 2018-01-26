package com.isdev.xiaohua.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class CountFilter implements Filter {

    private int count;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String paramCount = filterConfig.getInitParameter("count");
        count = Integer.valueOf(paramCount);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        count++;
        /*
         * 判断一个实例是由子类创建的是定义类型的类创建
         */
        System.out.println("xiaohua ServletRequest:"+ (req instanceof ServletRequest));
        System.out.println("xiaohua HttpServletRequest:"+ (req instanceof HttpServletRequest));
        HttpServletRequest request = (HttpServletRequest) req;
        ServletContext context = request.getSession().getServletContext();
        context.setAttribute("count", count);
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}
