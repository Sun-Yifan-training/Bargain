package com.example.persistence.entity;

import jdk.jfr.Category;

import java.time.LocalDate;

public class Bargain {

    private Integer id;
    private String name;
    //private LocalDate joinedDate;
    private Integer weekdayId;
    private String category;
    private String weekdayName;

    public Bargain() {}

    public Bargain(String name, String category, Integer weekdayId) {
        this.name = name;
        //this.joinedDate = joinedDate;
        this.category = category;
        this.weekdayId = weekdayId;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Integer getWeekdayId() {
        return weekdayId;
    }

    public void setWeekdayId(Integer weekdayId) {
        this.weekdayId = weekdayId;
    }

    public String getWeekdayName() {
        return weekdayName;
    }

    public void setWeekdayName(String weekdayName) {
        this.weekdayName = weekdayName;
    }

    @Override
    public String toString() {
        return "Bargain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\''+
                ", weekdayId=" + weekdayId +
                ", weekdayName='" + weekdayName + '\'' +
                '}';
    }
}
