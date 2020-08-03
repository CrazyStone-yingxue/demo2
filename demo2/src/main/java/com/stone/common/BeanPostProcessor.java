package com.stone.common;

import org.springframework.beans.BeansException;

public interface BeanPostProcessor {
    Object postProcessorBeforeInitialization(String beanName, Object bean) throws BeansException;
    Object postProcessorAfterInitialization(String beanName, Object bean) throws BeansException;
}
