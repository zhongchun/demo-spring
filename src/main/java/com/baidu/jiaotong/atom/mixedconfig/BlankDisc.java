/**
 * @Title: BlankDisc.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.mixedconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:34:30
 * @version 1.0
 */
package com.baidu.jiaotong.atom.mixedconfig;

import java.util.List;

/**
 * ClassName: BlankDisc
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:34:30
 * @version 1.0
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    /**
     * @Title: BlankDisc
     * @Desc: TODO
     */
    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.mixedconfig.CompactDisc#play()
     */
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}
