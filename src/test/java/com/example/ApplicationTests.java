package com.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.controller.dto.QueryPage;
import com.example.mapper.DepartmentMapper;
import com.example.mapper.EmployeeMapper;
import com.example.pojo.Department;
import com.example.pojo.Employee;
import com.example.service.base.BaseInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@MapperScan("com.example.mapper")
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DepartmentMapper departmentMapper;


    /**
     * 通用mapper
     */
//    @Test
//    void mapperTest(){
//        QueryWrapper<Department> queryWrapper = new QueryWrapper<>();
//        List<Department> departments = departmentMapper.selectList(queryWrapper);
//        System.out.println(departments);
//    }

    @Test
    void sql(){
        String sql = "select * from dept_bak limit 1";
        List<Department> departments = departmentMapper.execute(sql);
        System.out.println(departments);
    }

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void handler(){
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        List<Employee> employees = employeeMapper.selectList(queryWrapper);
        System.out.println(employees);
    }

    @Autowired
    BaseInterface baseInterface;

    @Test
    void baseService(){
        QueryPage<Employee> queryPage = new QueryPage<>();
        IPage page = baseInterface.findByPage(queryPage);
        System.out.println(page);
    }

    @Test
    void pageTest(){
        IPage<Department> departmentIPage = departmentMapper.selectList(new Page(2, 1));
        System.out.println(departmentIPage.getRecords());
    }

}
