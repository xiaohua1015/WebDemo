package com.isdev.xiaohua.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lsh134667 on 2018/1/25.
 */
public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("GB2312");
//        resp.setHeader("content-type", "text/html;charset=UTF-8");
        /*
        servlet中resp.getCharacterEncoding()默认是ISO-8859-1
        中国浏览器默认的解码方式是：GB2312
        直接setContentType("UTF-8")之后resp.getCharacterEncoding()和浏览器解析都会是UTF-8
        详细参见：http://blog.csdn.net/xiazdong/article/details/7217022
        */
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("xiaohua : "+resp.getCharacterEncoding());
        resp.getWriter().print("这是一个Servlet界面");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
