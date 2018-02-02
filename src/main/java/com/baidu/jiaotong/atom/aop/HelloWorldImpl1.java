/**
 * @Title: HelloWorldImpl1.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.aop
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午10:56:53
 * @version 1.0
 */
package com.baidu.jiaotong.atom.aop;

/**
 * ClassName: HelloWorldImpl1
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午10:56:53
 * @version 1.0
 */
public class HelloWorldImpl1 implements HelloWorld {

    /**
     * @Title: printHelloWorld
     * @Desc:
     * @see com.baidu.jiaotong.atom.aop.HelloWorld#printHelloWorld()
     */
    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    /**
     * @Title: doPrint
     * @Desc:
     * @see com.baidu.jiaotong.atom.aop.HelloWorld#doPrint()
     */
    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
    }

}
