package com.isdev.xiaohua.bean;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class UserInfoList {

    private static UserInfoList user = new UserInfoList();
    private Vector vector = null;
    private UserInfoList(){
        this.vector = new Vector();
    }

    public static UserInfoList getInstance(){
        return user;
    }

    public boolean addUserInfo(String user){
        if(user != null){
            this.vector.add(user);
            return true;
        }
        return false;
    }

    public Vector getList(){
        return this.vector;
    }

    public void removeUserInfo(String user){
        if(user != null){
            vector.removeElement(user);
        }
    }

}
