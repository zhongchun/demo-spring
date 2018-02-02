/**
 * @Title: MagicExistsTest.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.conditional
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午3:47:48
 * @version 1.0
 */
package com.baidu.jiaotong.atom.test.conditional;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.conditional.MagicConfig;

/**
 * ClassName: MagicExistsTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午3:47:48
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicExistsTest {

    @Autowired
    private ApplicationContext context;

    @BeforeClass
    public static void settingsBase() {
        System.setProperty("magic", "ok");
    }

    /**
     * 
     * @Title: shouldNotBeNull 
     * @Desc: TODO
     */
    @Test
    public void shouldNotBeNull() {
        assertTrue(context.containsBean("magicBean"));
    }

}
