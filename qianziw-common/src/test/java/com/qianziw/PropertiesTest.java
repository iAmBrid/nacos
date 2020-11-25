package com.qianziw;

import com.qianziw.util.PropertiesUtil;
import org.junit.jupiter.api.Test;

import java.util.Properties;

public class PropertiesTest {
    @Test
    public void propertiesTest(){
        Properties properties = PropertiesUtil.getProperties();
        System.out.println(properties.get("qianziw.member"));
    }
}
