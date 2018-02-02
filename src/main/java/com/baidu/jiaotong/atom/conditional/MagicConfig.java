/**
 * @Title: MagicConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.conditional
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午3:45:32
 * @version 1.0
 */
package com.baidu.jiaotong.atom.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MagicConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午3:45:32
 * @version 1.0
 */
@Configuration
public class MagicConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
