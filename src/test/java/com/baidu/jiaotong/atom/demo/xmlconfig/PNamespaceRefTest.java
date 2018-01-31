/**
 * @Title: PNamespaceRefTest.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.demo.xmlconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午4:22:22
 * @version 1.0
 */
package com.baidu.jiaotong.atom.demo.xmlconfig;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.xmlconfig.MediaPlayer;

/**
 * ClassName: PNamespaceRefTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午4:22:22
 * @version 1.0
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/PNamespaceRefTest-context.xml" })
public class PNamespaceRefTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLog());
    }

}
