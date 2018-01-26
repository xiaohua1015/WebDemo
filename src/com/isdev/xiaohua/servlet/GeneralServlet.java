package com.isdev.xiaohua.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lsh134667 on 2018/1/22.
 */
@WebServlet(name = "GeneralServlet")
public class GeneralServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("detectEmail.jsp");
        System.out.println("xiaohua resp: "+response.getCharacterEncoding());
        System.out.println("xiaohua req: "+ request.getCharacterEncoding());
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String job = request.getParameter("add");

        out.println("姓名："+name);
        out.println("年龄："+age);
        out.println("住址："+job);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
