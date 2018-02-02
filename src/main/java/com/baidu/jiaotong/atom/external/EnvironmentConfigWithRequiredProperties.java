/**
 * @Title: EnvironmentConfigWithRequiredProperties.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.external
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午6:11:22
 * @version 1.0
 */
package com.baidu.jiaotong.atom.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * ClassName: EnvironmentConfigWithRequiredProperties
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午6:11:22
 * @version 1.0
 */
@Configuration
public class EnvironmentConfigWithRequiredProperties {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(environment.getRequiredProperty("disc.title"),
                environment.getRequiredProperty("disc.artis"));
    }

}
