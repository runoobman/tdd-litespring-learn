package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

public interface BeanDefinitionRegistry {
	/**
	 * 获取bean的定义
	 * @param beanID
	 * @return
	 */
	BeanDefinition getBeanDefinition(String beanID);

	/**
	 * 注册bean的定义
	 * @param beanID
	 * @param bd
	 */
	void registerBeanDefinition(String beanID, BeanDefinition bd);
}
