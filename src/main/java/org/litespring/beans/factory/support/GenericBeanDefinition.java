package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * @author chenzhenya
 * @date 2019/11/1 15:03
 */
public class GenericBeanDefinition implements BeanDefinition {
    private String id;
    private String beanClassName;
    public GenericBeanDefinition(String id, String beanClassName) {

        this.id = id;
        this.beanClassName = beanClassName;
    }

    @Override
    public String getBeanClassName() {

        return this.beanClassName;
    }
}
