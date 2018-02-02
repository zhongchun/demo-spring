/**
 * @Title: ComponentScannedConfig.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.scopedbeans
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:31:00
 * @version 1.0
 */
package com.baidu.jiaotong.atom.scopedbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

/**
 * ClassName: ComponentScannedConfig
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:31:00
 * @version 1.0
 */
@Configuration
@ComponentScan(excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Configuration.class) })
public class ComponentScannedConfig {

}
