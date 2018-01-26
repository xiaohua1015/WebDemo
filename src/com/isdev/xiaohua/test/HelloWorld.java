package com.isdev.xiaohua.test;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class HelloWorld {

    public static void main(String[] args){
        SupClass supClass = new SupClass();
        System.out.println(supClass instanceof SupClass);
        System.out.println(supClass instanceof SubClass);
    }
}
