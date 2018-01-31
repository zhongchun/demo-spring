/**
 * @Title: CDPlayer.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.autoconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 上午10:21:47
 * @version 1.0
 */
package com.baidu.jiaotong.atom.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName: CDPlayer
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 上午10:21:47
 * @version 1.0
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    /**
     * @Title: CDPlayer
     * @Desc: TODO
     */
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.autoconfig.MediaPlayer#play()
     */
    @Override
    public void play() {
        cd.play();
    }

}
