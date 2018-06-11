package com.isdev.xiaohua.utils;

import com.isdev.xiaohua.bean.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */
public class FindBook {

    public Connection getConn() {
        String sql = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(sql, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public List<Book> findBook() {
        Connection conn = getConn();
        List bookList = new ArrayList<Book>();
        try {
            CallableStatement cst = conn.prepareCall("{call findAllBook()}");
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPrice(rs.getDouble("price"));
                book.setBookCount(rs.getInt("bookCount"));
                book.setAuthor(rs.getString("author"));
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
