package com.isdev.xiaohua.listener;

import com.isdev.xiaohua.bean.UserInfoList;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class UserInfoTrace implements HttpSessionBindingListener {

    private String user;
    private UserInfoList userInfoList = UserInfoList.getInstance();
    public UserInfoTrace(){
        user = "";
    }
    public void setUser(String user){
        this.user = user;
        userInfoList.addUserInfo(user);
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println(this.user + "上线");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println(this.user + "下线");
        if(user != null &&  !user.equals("")){
            userInfoList.removeUserInfo(this.user);
        }

    }
}
