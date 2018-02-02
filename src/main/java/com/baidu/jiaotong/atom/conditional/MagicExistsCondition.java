/**
 * @Title: MagicExistsCondition.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.conditional
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午3:44:35
 * @version 1.0
 */
package com.baidu.jiaotong.atom.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * ClassName: MagicExistsCondition
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年2月1日 下午3:44:35
 * @version 1.0
 */
public class MagicExistsCondition implements Condition {

    /**
     * @Title: matches
     * @Desc:
     * @param context
     * @param metadata
     * @return
     * @see org.springframework.context.annotation.Condition#matches(org.springframework.context.annotation.ConditionContext,
     *      org.springframework.core.type.AnnotatedTypeMetadata)
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        return environment.containsProperty("magic");
    }

}
