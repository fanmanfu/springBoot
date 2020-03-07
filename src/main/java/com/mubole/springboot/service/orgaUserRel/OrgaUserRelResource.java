package com.mubole.springboot.service.orgaUserRel;

import com.mubole.springboot.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * Description
 *  机构用户关系
 * @Author: cjl
 * @Date: 2019/3/11 18:11
 */
@ResourceInfo(value = "orgaUserRel", type = 1574002394)
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrgaUserRelResource {

}
