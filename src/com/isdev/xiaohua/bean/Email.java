package com.isdev.xiaohua.bean;

import java.io.Serializable;

/**
 * Created by lsh134667 on 2018/1/22.
 */
public class Email implements Serializable {
    private static final long serialVersionUID = 1L;
    private String mailAdd;
    private boolean email;

    public Email(){}
    public Email(String mailAdd){
        this.mailAdd = mailAdd;
    }

    public boolean isEmail(){
        String regex = "\\w+([-+']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        if(mailAdd.matches(regex)){
            email = true;
        }

        return email;
    }

    public String getMailAdd() {
        return mailAdd;
    }

    public void setMailAdd(String mailAdd) {
        this.mailAdd = mailAdd;
    }
}
