package org.litespring.test.v1;

import org.junit.Test;
import org.litespring.context.ApplicationContext;
import org.litespring.context.support.ClassPathXmlApplicationContext;
import org.litespring.service.v1.PetStoreService;

import static org.junit.Assert.*;

/**
 * @author chenzhenya
 * @date 2019/11/1 17:25
 */
public class ApplicationContextTest {
    @Test
    public void testGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("petstore-v1.xml");
        PetStoreService petStoreService = (PetStoreService) context.getBean("petStore");

        assertNotNull(petStoreService);
    }
}
