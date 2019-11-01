package org.litespring.beans.factory;

/**
 * @author chenzhenya
 * @date 2019/11/1 12:16
 */
public interface BeanFactory {
    /**
     * 获取bean的实例
     * @param beanID
     * @return
     */
    Object getBean(String beanID);
}
