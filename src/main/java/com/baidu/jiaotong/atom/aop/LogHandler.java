/**
 * @Title: LogHandler.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.aop
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午11:36:13
 * @version 1.0
 */
package com.baidu.jiaotong.atom.aop;

/**
 * ClassName: LogHandler
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午11:36:13
 * @version 1.0
 */
public class LogHandler {

    public void LogBefore() {
        System.out.println("Log before method");
    }

    public void LogAfter() {
        System.out.println("Log after method");
    }

}
