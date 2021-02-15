package com.example.config;

import com.example.controller.base.BaseController;
import com.example.controller.convertor.BaseEntityConverterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ConditionalOnClass(value = BaseController.class)
public class WebMVCConfig implements WebMvcConfigurer {

    /**
     * 邪魔歪道用法
     */
    @Autowired
    BaseController baseController;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new BaseEntityConverterFactory<>(baseController.getClazz()));
    }
}
