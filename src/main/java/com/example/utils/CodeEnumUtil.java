package com.example.utils;

import com.example.enums.base.BaseEnum;

public class CodeEnumUtil {
    public static <E extends Enum<?> & BaseEnum> BaseEnum codeOf(Class<E> clazz, int code) {
        E[] enumConstants = clazz.getEnumConstants();
        for (E enumConstant : enumConstants) {
            if ((Integer) enumConstant.getValue() == code){
                return enumConstant;
            }
        }
        return null;
    }
}
