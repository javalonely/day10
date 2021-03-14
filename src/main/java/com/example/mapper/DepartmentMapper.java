package com.example.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
/**
 * 通用mapper
 */
//public interface DepartmentMapper extends BaseMapper<Department> {
/**
 * 枚举 sql
 * 这一层放自定义sql
 */
public interface DepartmentMapper {

    List<Department> execute(@Param("sql") String sql);

    IPage<Department> selectList(IPage page);

}
