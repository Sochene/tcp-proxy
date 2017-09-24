package io.mycat.mycat2.sqlannotations;

import io.mycat.mycat2.MycatSession;

/**
 * Created by jamie on 2017/9/15.
 */
public class CacheResult implements SQLAnnotation {

    public CacheResult() {
        if (isDebug)
        System.out.println("=>CacheResult 对象本身的构造 初始化");
    }

    @Override
    public void init(Object args) {
        System.out.println("=>CacheResult 动态注解初始化");

    }

    @Override
    public Boolean apply(MycatSession context) {
        System.out.println("=>CacheResult");
        return false;
    }

    @Override
    public String getMethod() {
        return null;
    }

    @Override
    public void setMethod(String method) {

    }

}
