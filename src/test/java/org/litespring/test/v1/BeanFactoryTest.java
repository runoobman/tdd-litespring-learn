package org.litespring.test.v1;

import org.junit.Test;
import org.litespring.beans.BeanDefinition;
import org.litespring.beans.factory.BeanCreationException;
import org.litespring.beans.factory.BeanDefinitionStoreException;
import org.litespring.beans.factory.BeanFactory;
import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.litespring.service.v1.PetStoreService;

import static org.junit.Assert.*;

/**
 * @author chenzhenya
 * @date 2019/11/1 12:03
 */
public class BeanFactoryTest {
    @Test
    public void testGetBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");

        BeanDefinition definition = factory.getBeanDefinition("petStore");

        assertEquals("org.litespring.service.v1.PetStoreService", definition.getBeanClassName());

        PetStoreService petStoreService = (PetStoreService) factory.getBean("petStore");

        assertNotNull(petStoreService);
    }

    @Test(expected = BeanCreationException.class)
    public void testGetInvalidBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");

        factory.getBean("invalidBean");
    }

    @Test(expected = BeanDefinitionStoreException.class)
    public void testInvalidXML() {
        new DefaultBeanFactory("xxx.xml");
    }
}
