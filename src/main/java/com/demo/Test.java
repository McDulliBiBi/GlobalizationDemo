package com.demo;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        MessageSource resources = new ClassPathXmlApplicationContext("WEB-INF/dispatcher-servlet.xml");
        String message = resources.getMessage("message", null, "Default", Locale.CHINA);
        System.out.println(message);
    }
}
