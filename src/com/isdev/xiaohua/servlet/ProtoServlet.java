package com.isdev.xiaohua.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class ProtoServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("xiaohua servlet init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("xiaohua servlet service");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("xiaohua servlet ServletConfig");
        return null;
    }

    @Override
    public String getServletInfo() {
        System.out.println("xiaohua servlet ServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("xiaohua servlet destory");
    }
}
