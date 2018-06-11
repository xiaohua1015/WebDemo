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
 * Created by Administrator on 2018/6/11.
 */
@WebServlet(name = "DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "jdbc:mysql://localhost:3306/test?setUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root";
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = conn.prepareStatement("delete from book where id = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("/findBookServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
