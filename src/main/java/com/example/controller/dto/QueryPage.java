package com.example.controller.dto;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.base.BaseEntity;
import lombok.Data;

@Data
public class QueryPage<T extends BaseEntity> {

    private T condition;

    private Integer size;
    private Integer current;

    public Page<T> getPage(){
        return new Page<T>(current == null ? 1 : current,size == null ? 10 : size);
    }

    public QueryWrapper<T> getQueryWrapper(){
        return new QueryWrapper<>(condition);
    }

}
