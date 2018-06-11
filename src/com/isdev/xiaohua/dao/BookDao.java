package com.isdev.xiaohua.dao;

import com.isdev.xiaohua.bean.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */
public class BookDao {

    public Connection getConn() {
        String sql = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(sql, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public List<Book> find(int page) {
        List<Book> bookList = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from book order by id desc limit ?,?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Book.PAGE_SIZE * (page - 1));
            pst.setInt(2, Book.PAGE_SIZE);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPrice(rs.getDouble("price"));
                book.setBookCount(rs.getInt("bookCount"));
                book.setAuthor(rs.getString("author"));
                bookList.add(book);
            }
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookList;
    }

    public int getCount() {
        int count = 0;
        String sql = "select count(*) from book";
        Connection conn = getConn();
        try {
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery(sql);
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
