package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.dto.QueryPage;
import com.example.pojo.Employee;


public interface EmployeeService {

    IPage<Employee> findByPage(QueryPage<Employee> queryPage);

}
