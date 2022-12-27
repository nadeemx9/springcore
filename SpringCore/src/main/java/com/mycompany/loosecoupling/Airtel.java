package com.mycompany.loosecoupling;

public class Airtel
{

    private Service service;

    public void setService(Service service)
    {
        this.service = service;
    }

    public void startService()
    {
        service.service();
    }

}
