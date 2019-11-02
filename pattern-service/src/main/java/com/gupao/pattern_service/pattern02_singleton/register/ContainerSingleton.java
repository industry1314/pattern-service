package com.gupao.pattern_service.pattern02_singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册登记式：IOC
 */
public class ContainerSingleton {

    private static Map<String, Object> IOC = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        // 如果不存在，则通过反射方式创建一个对象放入到IOC容器中
        if(!IOC.containsKey(className)){
            synchronized (IOC){
                if(!IOC.containsKey(className)){
                    try {
                        Object instance = Class.forName(className).newInstance();
                        IOC.put(className,instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return IOC.get(className);
    }
}
