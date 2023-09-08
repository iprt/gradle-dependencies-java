package org.iproute;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Main
 *
 * @author zhuzhenjie
 */
public class Main {

    public static void main(String[] args) {
        Class<?> clazz = StringUtils.class;

        System.out.println(clazz);


        Properties p = new Properties();
        try {
            p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
            System.out.println(p.getProperty("name"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
