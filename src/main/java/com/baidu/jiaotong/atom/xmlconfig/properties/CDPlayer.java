/**
 * @Title: CDPlayer.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.xmlconfig.properties
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 上午10:45:10
 * @version 1.0
 */
package com.baidu.jiaotong.atom.xmlconfig.properties;

import org.springframework.beans.factory.annotation.Autowired;

import com.baidu.jiaotong.atom.xmlconfig.CompactDisc;
import com.baidu.jiaotong.atom.xmlconfig.MediaPlayer;

/**
 * ClassName: CDPlayer
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 上午10:45:10
 * @version 1.0
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    /**
     * @return the compactDisc
     */
    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    /**
     * @param compactDisc the compactDisc to set
     */
    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.xmlconfig.MediaPlayer#play()
     */
    @Override
    public void play() {
        compactDisc.play();
    }

}
