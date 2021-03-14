package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.pojo.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
//@Builder
//@NoArgsConstructor
@TableName("dept_bak")
public class Department extends BaseEntity implements Serializable {
    @TableId
    private Integer deptno;
    private String dname;
    private String loc;
    //空
    private String comment;
}