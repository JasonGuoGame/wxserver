package com.xin.fa.bao.server.entity;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by scnyig on 2018/6/19.
 */
public class Service {
    private int id;
    private String name;
    private String description;
    private int price;
    private Time time;
    private int categoryId;
    private String categoryName;
    private int author;
    private String authorName;
    private Timestamp lastUpdated;


    public int getAuthor() {
        return author;
    }
    public void setAuthor(int author) {
        this.author = author;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
}
