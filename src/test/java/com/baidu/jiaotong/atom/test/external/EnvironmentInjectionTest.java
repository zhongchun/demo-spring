/**
 * @Title: EnvironmentInjectionTest.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.test.external
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午5:51:11
 * @version 1.0
 */
package com.baidu.jiaotong.atom.test.external;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.external.BlankDisc;
import com.baidu.jiaotong.atom.external.EnvironmentConfig;
import com.baidu.jiaotong.atom.external.EnvironmentConfigWithDefaults;
import com.baidu.jiaotong.atom.external.EnvironmentConfigWithRequiredProperties;

/**
 * ClassName: EnvironmentInjectionTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午5:51:11
 * @version 1.0
 */
public class EnvironmentInjectionTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfig.class)
    public static class InjectFromProperties {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties() {
            assertEquals("The Beatles", blankDisc.getArtist());
            assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfigWithDefaults.class)
    public static class InjectFromPropertiesWithDefaultValues {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties() {
            assertEquals("U2", blankDisc.getArtist());
            assertEquals("Rattle and Hum", blankDisc.getTitle());
        }

    }

    public static class InjectFromPropertiesWithRequiredProperties {

        @SuppressWarnings("resource")
        @Test(expected = BeanCreationException.class)
        public void assertBlankDiscProperties() {
            new AnnotationConfigApplicationContext(EnvironmentConfigWithRequiredProperties.class);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:placeholder-config.xml")
    public static class InjectFromPropertiesXMLConfig {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties() {
            assertEquals("The Beatles", blankDisc.getArtist());
            assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
        }

    }

}
