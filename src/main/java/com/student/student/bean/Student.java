package com.student.student.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel

public class Student implements Serializable {
    @ApiModelProperty(value = "学生ID",required = true)
    private int stuID;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "分数")
    private int score;

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
