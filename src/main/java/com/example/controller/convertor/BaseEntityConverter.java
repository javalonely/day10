package com.example.controller.convertor;

import com.example.enums.DeptEnum;
import com.example.pojo.Employee;
import com.example.pojo.base.BaseEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

import java.lang.reflect.Type;

public class BaseEntityConverter<E extends BaseEntity> implements Converter<String, E> {

    private Class<E> clazz;

    private E element;

    public BaseEntityConverter(Class<E> clazz) {
        this.clazz = clazz;
    }

    @Override
    public E convert(String source) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            element = objectMapper.readValue(source, clazz);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Not support illegal argument");
        }
        return element;
    }

    public Type get(){
        return clazz.getClass();
    }

    public static void main(String[] args) throws JsonProcessingException {
//        BaseEntityConverter<Employee> converter = new BaseEntityConverter<>(Employee.class);
//        System.out.println(converter.get());

        Employee employee = new Employee();
        employee.setDeptno(DeptEnum.Affairs);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(employee);

        System.out.println(s);
    }
}
