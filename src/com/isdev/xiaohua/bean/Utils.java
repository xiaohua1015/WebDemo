package com.isdev.xiaohua.bean;

import java.io.UnsupportedEncodingException;

/**
 * Created by lsh134667 on 2018/1/25.
 */
public class Utils {

    public Utils() {}

    /**
     * 转换字符编码
     * @param str
     * @return
     */
    public String toStringEncoding(String str){
        String text = "";

        if(str != null && !str.equals("")){
            try {
                text = new String(str.getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return text;
    }

    /**
     * 将数组转化为字符串
     * @param arr
     * @return
     */
    public String arr2Str(String[] arr){
        StringBuffer sb = new StringBuffer();
        if(arr != null && arr.length>0){
            for (String s: arr){
                sb.append(s);
                sb.append(",");
            }
            if(arr.length > 0){
                sb = sb.deleteCharAt(sb.length() - 1);
            }
        }
        return  sb.toString();
    }
}
