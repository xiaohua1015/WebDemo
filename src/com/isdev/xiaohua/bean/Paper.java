package com.isdev.xiaohua.bean;

import java.io.Serializable;

/**
 * Created by lsh134667 on 2018/1/25.
 */
public class Paper implements Serializable {

    private String[] languages;

    private String[] technics;
    private String[] parts;

    public Paper() {
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getTechnics() {
        return technics;
    }

    public void setTechnics(String[] technics) {
        this.technics = technics;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }
}
