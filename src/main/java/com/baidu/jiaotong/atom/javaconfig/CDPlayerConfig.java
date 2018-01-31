/**
 * @Title: CDPlayerConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.autoconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 上午10:29:09
 * @version 1.0
 */
package com.baidu.jiaotong.atom.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: CDPlayerConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月26日 上午10:29:09
 * @version 1.0
 */
@Configuration
public class CDPlayerConfig {
    
    @Bean("lonelyHeartsClubBand")
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
    
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
    
}
