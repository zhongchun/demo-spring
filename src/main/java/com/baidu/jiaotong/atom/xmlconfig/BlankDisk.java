/**
 * @Title: BlankDisk.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.xmlconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 下午3:55:37
 * @version 1.0
 */
package com.baidu.jiaotong.atom.xmlconfig;

/**
 * ClassName: BlankDisk
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 下午3:55:37
 * @version 1.0
 */
public class BlankDisk implements CompactDisc {

    private String title;
    private String artist;

    /**
     * @Title: BlankDisk
     * @Desc: TODO
     */
    public BlankDisk(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

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
