package com.isdev.xiaohua.test;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URL;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Administrator on 2018/7/1.
 */
public class TestDemo {

    public static void main(String[] args) {
//        writerFile();
        /*readFile();
        ConvertUtils.register(new Converter() {
            @Override
            public Object convert(Class aClass, Object o) {
                return null;
            }
        }, Date.class);*/
//        prop();

    }

    private static void prop() {
        Properties prop = new Properties();
        Class clazz = TestDemo.class;
        InputStream resourceAsStream = clazz.getResourceAsStream("prop.properties");
        try {
            prop.load(resourceAsStream);
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void readFile() {
        try {
            FileReader fileReader = new FileReader("F://a.txt");
            int content = 0;
            while((content = fileReader.read()) !=-1){
                System.out.println((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writerFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("F://a.txt");
            OutputStreamWriter out = new OutputStreamWriter(fileOutputStream, "UTF-8");
            out.write("小华");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {

    }
}
