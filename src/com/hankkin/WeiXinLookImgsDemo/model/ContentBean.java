package com.hankkin.WeiXinLookImgsDemo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hankkin on 15/11/22.
 * 说说的实体类
 */
public class ContentBean implements Serializable{

    private int id; //id
    private String name;    //姓名
    private String title;   //标题
    private ArrayList<String> imgUrls;  //图片数组

    public ContentBean(int id, String name, String title, ArrayList<String> imgUrls) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.imgUrls = imgUrls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(ArrayList<String> imgUrls) {
        this.imgUrls = imgUrls;
    }

    @Override
    public String toString() {
        return "ContentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", imgUrls=" + imgUrls +
                '}';
    }
}
