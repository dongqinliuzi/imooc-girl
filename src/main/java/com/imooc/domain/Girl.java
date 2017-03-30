package com.imooc.domain;

import com.sun.javafx.beans.IDProperty;
import org.omg.CORBA.INTERNAL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by heitizi on 2017/3/28.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;

    @Min(value = 18 , message = "不能小于18")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
