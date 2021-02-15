package com.example.enums;

import com.example.enums.base.BaseEnum;
import lombok.ToString;

@ToString
public enum DeptEnum implements BaseEnum {

    TeachingResearch(10,"教研部"),
    Affairs(20,"学工部"),
    Sales(30,"销售部"),
    Finance(40,"财务部");

    DeptEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;
    private String desc;

    @Override
    public Integer getValue() {
        return code;
    }

    @Override
    public String toJsonObject() {
        return desc;
    }
}
