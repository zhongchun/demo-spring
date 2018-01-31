/**
 * @Title: SgtPeppers.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.mixedconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:41:43
 * @version 1.0
 */
package com.baidu.jiaotong.atom.mixedconfig;

/**
 * ClassName: SgtPeppers
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:41:43
 * @version 1.0
 */
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.mixedconfig.CompactDisc#play()
     */
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
