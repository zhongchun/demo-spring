/**
 * @Title: ExplicitConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.scopedbeans
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:43:04
 * @version 1.0
 */
package com.baidu.jiaotong.atom.scopedbeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * ClassName: ExplicitConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:43:04
 * @version 1.0
 */
@Configuration
public class ExplicitConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad() {
        return new Notepad();
    }

    @Bean
    public UniqueThing uniqueThing() {
        return new UniqueThing();
    }

}
