package com.yang.annotaion;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/28
 * Time: 17:32
 **/
@Deprecated
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Import()
@Documented
public @interface EnableDbCounting {
}
