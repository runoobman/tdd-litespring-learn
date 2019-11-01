package org.litespring.beans.factory;

import org.litespring.beans.BeanDefinition;

/**
 * @author chenzhenya
 * @date 2019/11/1 12:16
 */
public interface BeanFactory {
    /**
     * 获取bean的定义
     * @param beanID
     * @return
     */
    BeanDefinition getBeanDefinition(String beanID);

    /**
     * 获取bean的实例
     * @param beanID
     * @return
     */
    Object getBean(String beanID);
}
