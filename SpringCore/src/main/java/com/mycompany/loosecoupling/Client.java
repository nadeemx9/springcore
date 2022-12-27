package com.mycompany.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/mycompany/loosecoupling/config.xml");
        Airtel airtel = context.getBean("airtel", Airtel.class);

        airtel.startService();

    }
}
