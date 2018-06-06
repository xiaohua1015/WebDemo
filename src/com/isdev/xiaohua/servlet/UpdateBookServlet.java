package com.isdev.xiaohua.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/6/7.
 */
@WebServlet(name = "UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int bookCount = Integer.parseInt(request.getParameter("bookCount"));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "update book set bookCount = ? where id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,bookCount);
            pst.setInt(2,id);
            pst.executeUpdate();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/findBookServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
