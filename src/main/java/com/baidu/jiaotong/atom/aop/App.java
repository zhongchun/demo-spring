/**
 * @Title: App.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.aop
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午11:05:37
 * @version 1.0
 */
package com.baidu.jiaotong.atom.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: App
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月2日 上午11:05:37
 * @version 1.0
 */
public class App {

    private static ApplicationContext context;

    /**
     * @Title: main
     * @Desc: TODO
     * @param args
     */
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("aop.xml");
        HelloWorld hw1 = (HelloWorld) context.getBean("helloWorldImpl1");
        HelloWorld hw2 = (HelloWorld) context.getBean("helloWorldImpl2");

        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();
    }

}
