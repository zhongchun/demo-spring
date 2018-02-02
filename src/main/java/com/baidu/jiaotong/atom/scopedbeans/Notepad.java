/**
 * @Title: Notepad.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.scopedbeans
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:27:55
 * @version 1.0
 */
package com.baidu.jiaotong.atom.scopedbeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ClassName: Notepad
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午4:27:55
 * @version 1.0
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {

}
