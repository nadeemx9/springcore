package com.mycompany;

public class Student
{

    // Literal
    private int rno;
    private String nm;

    // Reference
    Cheating c1;

    // Collection -> list, array list , map, set
    public int getRno()
    {
        return rno;
    }

    public void setRno(int rno)
    {
        this.rno = rno;
        System.out.println("Rno Set !");
    }

    public String getNm()
    {
        return nm;

    }

    public void setNm(String nm)
    {
        this.nm = nm;
        System.out.println("Name set !");
    }

    public Cheating getC1()
    {
        return c1;
    }

    public void setC1(Cheating c1)
    {
        this.c1 = c1;
    }

    public void startCheating()
    {
        c1.cheat();
    }

    public Student()
    {
        System.out.println("Student Class Instantiated !");
    }
}
