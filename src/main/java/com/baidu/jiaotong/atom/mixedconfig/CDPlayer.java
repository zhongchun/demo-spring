/**
 * @Title: CDPlayer.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.mixedconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:46:27
 * @version 1.0
 */
package com.baidu.jiaotong.atom.mixedconfig;

/**
 * ClassName: CDPlayer
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:46:27
 * @version 1.0
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    /**
     * @Title: CDPlayer
     * @Desc: TODO
     */
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.mixedconfig.MediaPlayer#play()
     */
    @Override
    public void play() {
        cd.play();
    }

}
