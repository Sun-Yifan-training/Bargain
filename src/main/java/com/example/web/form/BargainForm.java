package com.example.web.form;

import com.example.persistence.entity.Bargain;
import org.springframework.format.annotation.DateTimeFormat;
//import javax.va
import java.time.LocalDate;

public class BargainForm {
    //@NotBlank
    private String name;

    private String category;

    private Integer weekdayId;

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

    public Bargain convertToEntity() {
        System.out.println(name);
        return new Bargain(name, category, weekdayId);
    }

}
