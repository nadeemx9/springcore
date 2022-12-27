package com.mycompany.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/mycompany/autowired/config.xml");
        Human human = context.getBean("human", Human.class);
        human.startPumping();
    }
}
