package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/mycompany/config.xml");

        Student s1 = context.getBean("student1", Student.class);
        System.out.println(s1.getRno());
        System.out.println(s1.getNm());
        s1.startCheating();

        AnotherStudent s2 = context.getBean("student2", AnotherStudent.class);
        System.out.println(s2.getRno());
        System.out.println(s2.getNm());
        s2.startCheating();
    }
}
