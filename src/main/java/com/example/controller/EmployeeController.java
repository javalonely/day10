package com.example.controller;

import com.example.controller.base.BaseController;
import com.example.pojo.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController extends BaseController<Employee> {

    @Autowired
    private EmployeeService employeeService;

//    @GetMapping("/page")
//    public IPage<Employee> findByPage(QueryPage<Employee> queryPage){
//        return employeeService.findByPage(queryPage);
//    }

}
