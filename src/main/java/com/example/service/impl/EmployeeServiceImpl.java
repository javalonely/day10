package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.dto.QueryPage;
import com.example.mapper.EmployeeMapper;
import com.example.pojo.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public IPage<Employee> findByPage(QueryPage<Employee> queryPage) {

        return employeeMapper.selectPage(queryPage.getPage(), queryPage.getQueryWrapper());

    }
}
