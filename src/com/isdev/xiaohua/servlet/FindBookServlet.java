package com.isdev.xiaohua.servlet;

import com.isdev.xiaohua.bean.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/30.
 */
@WebServlet(name = "FindBookServlet")
public class FindBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "select * from book";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Book> list = new ArrayList();
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setPrice(resultSet.getDouble("price"));
                book.setBookCount(resultSet.getInt("bookCount"));
                book.setAuthor(resultSet.getString("author"));
                list.add(book);
            }
            request.setAttribute("booklist", list);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("查询失败");
        }
        request.getRequestDispatcher("/jdbc/showBook.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
