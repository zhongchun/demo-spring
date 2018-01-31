/**
 * @Title: CDConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.mixedconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:48:13
 * @version 1.0
 */
package com.baidu.jiaotong.atom.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: CDConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午5:48:13
 * @version 1.0
 */
@Configuration
public class CDConfig {
    
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
    
}
