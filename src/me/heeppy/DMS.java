package me.heeppy;

/**
 * User: heeppy
 * Date: 15.03.13
 * Time: 21:01
 */

public class DMS
{
    private int D;
    private int M;
    private double S;

    public int getD()
    {
        return D;
    }

    public void setD(int d)
    {
        D = d;
    }

    public int getM()
    {
        return M;
    }

    public void setM(int m)
    {
        M = m;
    }

    public double getS()
    {
        return S;
    }

    public void setS(double s)
    {
        S = s;
    }

    public DMS(int d, int m, double s)
    {
        D = d;
        M = m;
        S = s;
    }

    public DMS()
    {

    }
}
