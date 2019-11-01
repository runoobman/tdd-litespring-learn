package org.litespring.context.support;

import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.litespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.litespring.context.ApplicationContext;

/**
 * @author chenzhenya
 * @date 2019/11/1 17:31
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private DefaultBeanFactory factory;
    public ClassPathXmlApplicationContext(String configFile) {
        factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(configFile);
    }

    @Override
    public Object getBean(String beanID) {
        return factory.getBean(beanID);
    }
}
