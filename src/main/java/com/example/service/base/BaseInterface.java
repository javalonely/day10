package com.example.service.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.dto.QueryPage;
import com.example.pojo.base.BaseEntity;

public interface BaseInterface<T extends BaseEntity> {

    IPage<T> findByPage(QueryPage<T> queryPage);

}
