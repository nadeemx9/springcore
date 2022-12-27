package com.mycompany.noxmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client
{

    public static void main(String[] args)
    {
        // Instantiating Spring Container.
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ExampleClass class1 = context.getBean("bean1", ExampleClass.class);

    }

}
