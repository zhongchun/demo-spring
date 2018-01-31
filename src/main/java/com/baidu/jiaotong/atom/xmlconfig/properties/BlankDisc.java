/**
 * @Title: BlankDisc.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.xmlconfig.properties
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 上午10:42:46
 * @version 1.0
 */
package com.baidu.jiaotong.atom.xmlconfig.properties;

import java.util.List;
import com.baidu.jiaotong.atom.xmlconfig.CompactDisc;

/**
 * ClassName: BlankDisc
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 上午10:42:46
 * @version 1.0
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the tracks
     */
    public List<String> getTracks() {
        return tracks;
    }

    /**
     * @param tracks the tracks to set
     */
    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    /**
     * @Title: play
     * @Desc:
     * @see com.baidu.jiaotong.atom.xmlconfig.CompactDisc#play()
     */
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}
