package com.isdev.xiaohua.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by Administrator on 2018/5/28.
 */
@WebServlet(name = "AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        System.out.println("请求成功");
        String url ="jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
        String username = "root";
        String password = "root";
        PrintWriter writer = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            String name = request.getParameter("name");
            String author = request.getParameter("author");
            System.out.println(name);
            System.out.println(author);
            String sql = "insert into book (name, price, bookCount, author) values (?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, Double.parseDouble(request.getParameter("price")));
            preparedStatement.setInt(3, Integer.parseInt(request.getParameter("bookCount")));
            preparedStatement.setString(4, author);
            int row = preparedStatement.executeUpdate();
            if (row > 0 ){
                writer.println("添加成功");
                response.sendRedirect("/findBookServlet");
            } else {
                writer.println("添加失败");
                response.sendRedirect("jdbc/index.jsp");
            }
            writer.close();
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            writer.println("添加失败");
            response.sendRedirect("jdbc/index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
