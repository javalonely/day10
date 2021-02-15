package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.enums.DeptEnum;
import com.example.pojo.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("emp_bak")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Employee extends BaseEntity {
//  @TableId
  private Integer empno;
  private String ename;
  private String job;
  private Integer mgr;
  private LocalDateTime hiredate;
  private BigDecimal sal;
  private BigDecimal comm;
  private DeptEnum deptno;
}
