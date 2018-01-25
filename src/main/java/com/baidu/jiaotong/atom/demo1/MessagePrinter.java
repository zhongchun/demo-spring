/**
 * @Title: MessagePrinter.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.demo1
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月24日 下午7:33:42
 * @version 1.0
 */
package com.baidu.jiaotong.atom.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName: MessagePrinter
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月24日 下午7:33:42
 * @version 1.0
 */
@Component
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
