package com.mycompany.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/mycompany/annotations/config.xml");
        DBConnection dBConnection = context.getBean("dbconnection", DBConnection.class);

        dBConnection.display();
        dBConnection.connection();
    }
}
