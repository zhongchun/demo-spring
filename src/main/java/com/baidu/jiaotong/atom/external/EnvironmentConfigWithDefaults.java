/**
 * @Title: EnvironmentConfigWithDefaults.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.external
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午6:06:01
 * @version 1.0
 */
package com.baidu.jiaotong.atom.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * ClassName: EnvironmentConfigWithDefaults
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午6:06:01
 * @version 1.0
 */
@Configuration
public class EnvironmentConfigWithDefaults {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc blankDisc() {

        return new BlankDisc(environment.getProperty("disc.title", "Rattle and Hum"),
                environment.getProperty("disc.artist", "U2"));

    }

}
