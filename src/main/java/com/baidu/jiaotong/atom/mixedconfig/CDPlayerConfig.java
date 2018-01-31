/**
 * @Title: CDPlayerConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.mixedconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:51:51
 * @version 1.0
 */
package com.baidu.jiaotong.atom.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: CDPlayerConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:51:51
 * @version 1.0
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
