package com.taobao.luaview.fun.mapper;

import com.taobao.luaview.global.VmVersion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * LuaView UI Lib 标识
 *
 * @author song
 * @date 15/12/25
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface LuaViewApi {

    /**
     * api 起始版本，不写标示从默认版本起始
     */
    String since() default VmVersion.V_440;

    /**
     * api 修订版本，标示该API修订过，之前可能有bug，或者只是空实现。
     * 字符串，默认为空。
     * 每次新增两个字符串：第一个标示版本，第二句标示修订内容。
     *
     * @return
     */
    String[] revisions() default {};
}
