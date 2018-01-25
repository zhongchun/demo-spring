/**
 * @Title: Application.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.demo1
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月24日 下午7:35:20
 * @version 1.0
 */
package com.baidu.jiaotong.atom.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Application
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月24日 下午7:35:20
 * @version 1.0
 */
@Configuration
@ComponentScan
public class Application {
    
    private static ApplicationContext context;

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            
            @Override
            public String getMessage() {
                return "Hello World!";
            }
        };
    }
    
    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
    
}
