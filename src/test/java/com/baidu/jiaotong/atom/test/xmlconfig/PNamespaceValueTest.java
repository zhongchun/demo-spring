/**
 * @Title: PNamespaceValueTest.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.demo.xmlconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午4:10:42
 * @version 1.0
 */
package com.baidu.jiaotong.atom.test.xmlconfig;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.xmlconfig.MediaPlayer;

/**
 * ClassName: PNamespaceValueTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午4:10:42
 * @version 1.0
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/PNamespaceValueTest-context.xml" })
public class PNamespaceValueTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n"
                + "-Track: Sgt. Pepper's Lonely Hearts Club Band\n" + "-Track: With a Little Help from My Friends\n"
                + "-Track: Lucy in the Sky with Diamonds\n" + "-Track: Getting Better\n" + "-Track: Fixing a Hole\n"
                + "-Track: She's Leaving Home\n" + "-Track: Being for the Benefit of Mr. Kite!\n"
                + "-Track: Within You Without You\n" + "-Track: When I'm Sixty-Four\n" + "-Track: Lovely Rita\n"
                + "-Track: Good Morning Good Morning\n" + "-Track: Sgt. Pepper's Lonely Hearts Club Band (Reprise)\n"
                + "-Track: A Day in the Life\n", log.getLog());
    }

}
