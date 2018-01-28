package com.litesky.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String []args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-chapter1.xml");
        USBDevice sanDisk= (USBDevice) context.getBean("sandisk");
        USBDevice kingSton= (USBDevice) context.getBean("kingston");
        sanDisk.use();
        kingSton.use();

    }
}
