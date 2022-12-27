package com.mycompany.noxmlconfiguration;

import org.springframework.stereotype.Component;

@Component("bean1")  // Class declared as a Component for creating an object using a configuration class.
public class ExampleClass
{

//    Proof that this class is instantiated without xml configuration.
    public ExampleClass()
    {
        System.out.println("Class1 Instantiated");
    }

}
