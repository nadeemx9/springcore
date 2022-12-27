package com.mycompany;

public class AnotherStudent
{

    private int rno;
    private String nm;
    Cheating c1;

    public int getRno()
    {
        return rno;
    }

    public void setRno(int rno)
    {
        this.rno = rno;
    }

    public String getNm()
    {
        return nm;
    }

    public void setNm(String nm)
    {
        this.nm = nm;
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
}
