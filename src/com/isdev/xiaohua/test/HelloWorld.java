package com.isdev.xiaohua.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class HelloWorld {

    public static void main(String[] args){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/test?characterEncoding=UTF-8";
        String userName = "root";
        String password = "root";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, userName, password);
            if(!conn.isClosed()){
                System.out.println("数据库连接成功");
            }
            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery(" ");
            String id;
            String name;
            String description;
//            while(resultSet.next()){
//                id = resultSet.getNString(1);
//                name = resultSet.getNString(2);
//                description = resultSet.getNString(3);
//                System.out.println("id = " + id + "\t" + "name = " + name + "\t" + "description = " + description);
//            }
            statement.execute("insert into student (name,sex, age) values('小明',true , 25)");
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
