package com.example.controller.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.dto.QueryPage;
import com.example.pojo.base.BaseEntity;
import com.example.service.base.BaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public abstract class BaseController<E extends BaseEntity> {

    private Class<E> clazz;

    public BaseController(Class<E> clazz) {
        this.clazz = clazz;
    }

    public BaseController() {
    }

    public Class<E> getClazz() {
        return clazz;
    }

    {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        clazz = (Class)actualTypeArguments[0];

        //加载对应的Dao实现类的bean @Resource的name必须是常量所以不能使用@Resource注解注入
//        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
//        FormatterRegistry registry = webApplicationContext.getBean(FormatterRegistry .class);
//        registry.addConverterFactory(new BaseEntityConverterFactory<>(clazz));
    }

    @Autowired
    private BaseInterface<E> baseInterface;

    @GetMapping("/page")
    public IPage<E> findByPage(QueryPage<E> queryPage) {
        return baseInterface.findByPage(queryPage);
    }
}
