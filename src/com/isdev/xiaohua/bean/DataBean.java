package com.isdev.xiaohua.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lsh134667 on 2018/1/25.
 */
public class DataBean {

    private String dateTime;
    private String week;
    private Calendar calendar = Calendar.getInstance();

    public String getDateTime() {
        Date currDate = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日  HH 点 mm 分 ss秒");

        dateTime = sdf.format(currDate);
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getWeek() {
        String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        int index = calendar.get(Calendar.DAY_OF_WEEK);
        week = weeks[index -1];
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Calendar getCalendar() {
        return  calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
