package com.mycompany.annotations;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.beans.factory.annotation.Value;

public class DBConnection
{

    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver()
    {
        return driver;
    }

    // Injecting Values using property file
    @Value("${db.driver}")
    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    public String getUrl()
    {
        return url;
    }

    // Injecting Values using property file
    @Value("${db.url}")
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUsernam()
    {
        return username;
    }

    // Injecting Values using property file
    @Value("${db.username}")
    public void setUsernam(String usernam)
    {
        this.username = usernam;
    }

    public String getPassword()
    {
        return password;
    }

    // Injecting Values using property file
    @Value("${db.password}")
    public void setPassword(String password)
    {
        this.password = password;
    }

    public void display()
    {
        System.out.println("Driver : " + getDriver());
        System.out.println("URL : " + getUrl());
        System.out.println("Username : " + getUsernam());
        System.out.println("Password : " + getPassword());
    }

    public void connection()
    {
        try
        {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully !");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
