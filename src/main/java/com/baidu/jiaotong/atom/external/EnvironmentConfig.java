/**
 * @Title: EnvironmentConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.external
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午5:48:21
 * @version 1.0
 */
package com.baidu.jiaotong.atom.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * ClassName: EnvironmentConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午5:48:21
 * @version 1.0
 */
@Configuration
@PropertySource("classpath:/soundsystem/app.properties")
public class EnvironmentConfig {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(environment.getProperty("disc.title"), environment.getProperty("disc.artist"));
    }

}
