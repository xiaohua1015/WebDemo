package com.isdev.xiaohua.test;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2018/6/11.
 */
public class TestEncoding {

    public static void main(String[] args) {
        System.out.println(getEncoding("中文"));
        try {
            System.out.println(new String("中文".getBytes("GB2312"), "GB2312"));
            System.out.println(new String("中文".getBytes("UTF-8"), "UTF-8"));
            System.out.println(new String("中文".getBytes("ISO8859_1"), "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String getEncoding(String str) {
        String encode = "GB2312";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GB2312
                String s = encode;
                return s;      //是的话，返回“GB2312“，以下代码同理
            }
        } catch (Exception exception) {

        }
        encode = "ISO-8859-1";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是ISO-8859-1
                String s1 = encode;
                return s1;
            }
        } catch (Exception exception1) {
        }
        encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {   //判断是不是UTF-8
                String s2 = encode;
                return s2;
            }
        } catch (Exception exception2) {
        }
        encode = "GBK";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GBK
                String s3 = encode;
                return s3;
            }
        } catch (Exception exception3) {
        }
        return "";        //如果都不是，说明输入的内容不属于常见的编码格式。
    }

}
