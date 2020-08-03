package com.stone.common;

import org.springframework.beans.BeansException;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessorBeforeInitialization(String beanName, Object bean) throws BeansException {
        System.out.println("初始化Before,bean:" + beanName + "实例化对象：" + bean);
        return bean;
    }

    @Override
    public Object postProcessorAfterInitialization(String beanName, Object bean) throws BeansException {
        System.out.println("初始化After,bean:" + beanName + "实例化对象：" + bean);
        return bean;
    }
}
