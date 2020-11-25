package com.qianziw.util;

import java.io.*;
import java.util.Properties;

/**
 * properties文件工具类
 */
public class PropertiesUtil {

    public static Properties properties = null;

    /**
     * 获取配置文件所有属性值
     * @return
     */
    public static Properties getProperties(){
        try {
            if (properties == null){
                properties = new Properties();
                InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
                properties.load(inputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * 获取配置文件某个属性值
     * @param key
     * @return
     */
    public static String getProperty(String key){
        Properties properties = getProperties();
        if (properties != null){
            return properties.getProperty(key);
        }else{
            return null;
        }
    }
}