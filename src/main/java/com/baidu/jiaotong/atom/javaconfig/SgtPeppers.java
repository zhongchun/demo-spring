/**
 * @Title: SgtPeppers.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.autoconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 上午10:17:02
 * @version 1.0
 */
package com.baidu.jiaotong.atom.javaconfig;

/**
 * ClassName: SgtPeppers
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 上午10:17:02
 * @version 1.0
 */
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Betles";

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.autoconfig.CompactDisc#play()
     */
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
