/**
 * @Title: ScopedBeanTests.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.scopedbeans
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:32:20
 * @version 1.0
 */
package com.baidu.jiaotong.atom.test.scopedbeans;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.scopedbeans.ComponentScannedConfig;
import com.baidu.jiaotong.atom.scopedbeans.ExplicitConfig;
import com.baidu.jiaotong.atom.scopedbeans.Notepad;
import com.baidu.jiaotong.atom.scopedbeans.UniqueThing;

/**
 * ClassName: ScopedBeanTests
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:32:20
 * @version 1.0
 */
public class ScopedBeanTests {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = ComponentScannedConfig.class)
    public static class ComponentScannedScopedBeanTest {

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope() {
            Notepad notepad1 = context.getBean(Notepad.class);
            Notepad notepad2 = context.getBean(Notepad.class);
            assertNotSame(notepad1, notepad2);

        }

        @Test
        public void testSingletonScope() {
            UniqueThing thing1 = context.getBean(UniqueThing.class);
            UniqueThing thing2 = context.getBean(UniqueThing.class);
            assertSame(thing1, thing2);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = ExplicitConfig.class)
    public static class ExplicitConfigScopeBeanTest {

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope() {
            Notepad notepad1 = context.getBean(Notepad.class);
            Notepad notepad2 = context.getBean(Notepad.class);
            assertNotSame(notepad1, notepad2);
        }

        @Test
        public void testSingletonScope() {
            UniqueThing uniqueThing1 = context.getBean(UniqueThing.class);
            UniqueThing uniqueThing2 = context.getBean(UniqueThing.class);
            assertSame(uniqueThing1, uniqueThing2);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:scoped-beans.xml")
    public static class XMLConfigScopedBeanTest {

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope() {
            Notepad notepad1 = (Notepad) context.getBean("notepad");
            Notepad notepad2 = context.getBean(Notepad.class);
            assertNotSame(notepad1, notepad2);
        }

    }

}
