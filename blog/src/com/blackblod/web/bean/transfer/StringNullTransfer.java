package com.blackblod.web.bean.transfer;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.apache.commons.beanutils.PropertyUtils;

import com.blackblod.web.util.BeanUtils;

/**
 * Created by lingzhen on 15/12/9.
 */
public class StringNullTransfer implements Transfer {


    public static StringNullTransfer INSTANCE = new StringNullTransfer();

    @Override
    public Object transfer(Object bean) {
        Object copy = BeanUtils.convert(bean, bean.getClass());
        transferObj(copy);

        return copy;
    }

    private void transferObj(Object obj) {
        try {
            if (obj != null) {
                PropertyDescriptor[] props = PropertyUtils
                        .getPropertyDescriptors(obj.getClass());

                for (PropertyDescriptor prop : props) {
                    Method readMethod = prop.getReadMethod();
                    Class<?> propType = readMethod.getReturnType();
                    if (String.class.isAssignableFrom(propType)) {
                        // 字符串如果是null,转换成""
                        String propValue = (String) readMethod.invoke(obj);
                        if (propValue == null) {
                            prop.getWriteMethod().invoke(obj,"");
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Transfer getInstance() {
        return INSTANCE;
    }
}
