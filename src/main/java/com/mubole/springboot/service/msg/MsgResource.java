package com.mubole.springboot.service.msg;

import com.mubole.springboot.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author jishenghua qq752718920  2019-9-7 22:52:35
 */
@ResourceInfo(value = "msg", type = 1574002380)
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgResource {
}
