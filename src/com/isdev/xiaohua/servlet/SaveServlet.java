package com.isdev.xiaohua.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/**
 * Created by Administrator on 2018/2/2.
 */

@WebServlet(name="saveServlet", urlPatterns = "/saveservlet")
public class SaveServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/mysql";
        String user = "root";
        String password = "root";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            if(!conn.isClosed()){
                System.out.println("successed connecting to the Database");
            }
            Statement statement = conn.createStatement();

            String sql = "select * from user";

            ResultSet rs = statement.executeQuery(sql);
            System.out.println("Host\tUser\tPassword");
            System.out.println("-----------------------------------");
            while (rs.next()){
                String host = rs.getString("host");
                String _user = rs.getString("user");
                String _password = rs.getString("password");
                System.out.println(host + "\t" + _user + "\t" + _password);
            }

            rs.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("这是一个saveservlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
