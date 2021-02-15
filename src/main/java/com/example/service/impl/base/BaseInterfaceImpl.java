package com.example.service.impl.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.dto.QueryPage;
import com.example.pojo.base.BaseEntity;
import com.example.service.base.BaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseInterfaceImpl<T extends BaseEntity> implements BaseInterface<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public IPage<T> findByPage(QueryPage<T> queryPage) {
        return baseMapper.selectPage(queryPage.getPage(), queryPage.getQueryWrapper());
    }
}
