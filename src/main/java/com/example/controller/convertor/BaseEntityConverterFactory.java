package com.example.controller.convertor;

import com.example.pojo.base.BaseEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

@Component
public class BaseEntityConverterFactory<E extends BaseEntity> implements ConverterFactory<String, E> {

    private Class<E> clazz;

//    {
//        Type[] genericInterfaces = BaseEntityConverterFactory.class.getGenericInterfaces();
//        for (Type genericInterface : genericInterfaces) {
//            System.err.println(genericInterface.getClass());
//        }
//    }

    public BaseEntityConverterFactory(Class<E> clazz) {
        this.clazz = clazz;
    }

    public BaseEntityConverterFactory() {
    }

    @Override
    public <T extends E> Converter<String, T> getConverter(Class<T> targetType) {
        BaseEntityConverter baseEntityConverter = new BaseEntityConverter(clazz);
        return baseEntityConverter;
    }
//    @Override
//    public <T> Converter<String, T> getConverter(Class<T> targetType) {
//        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        System.out.println(tClass);
//        return new BaseEntityConverter<>(targetType);
//    }

}
