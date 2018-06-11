package com.isdev.xiaohua.test;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 * Created by Administrator on 2018/6/11.
 */
public class Batch {

    public Connection getConn() {
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  conn;
    }

    public int saveBatch() {
        Connection conn = getConn();
        String sql = "insert into student (name, sex, age) values (?, ?, ?)";
        int row = 0;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            Random random =  new Random();
            for(int i=0; i<10; i++){
                pst.setString(1,"学生"+i);
                pst.setBoolean(2, i%2==0?true:false);
                pst.setInt(3, random.nextInt(5) + 20);
                pst.addBatch();
            }
            int[] rows = pst.executeBatch();
            row = rows.length;
            for(int i=0; i<row; i++) {
                System.out.println("rows[i] = " + rows[i]);
            }
            System.out.println("over over over!!!");
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
