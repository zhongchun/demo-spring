/**
 * @Title: HelloWorldImpl2.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.aop
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午10:57:49
 * @version 1.0
 */
package com.baidu.jiaotong.atom.aop;

/**
 * ClassName: HelloWorldImpl2
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午10:57:49
 * @version 1.0
 */
public class HelloWorldImpl2 implements HelloWorld {

    /**
     * @Title: printHelloWorld
     * @Desc:
     * @see com.baidu.jiaotong.atom.aop.HelloWorld#printHelloWorld()
     */
    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    /**
     * @Title: doPrint
     * @Desc:
     * @see com.baidu.jiaotong.atom.aop.HelloWorld#doPrint()
     */
    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
    }

}
