/**
 * User: heeppy
 * Date: 15.03.13
 * Time: 20:51
  */

import java.lang.*;

public class AMath
{
    static double Fraction(double x)
    {
        return x - (int)x;
    }

    static double Modulo(double x, double y)
    {
        return y * Fraction(x/y);
    }

    /**
     * Преобразование углов из градусов, минут и секунд дуги в десятичное представление угла
     * @param D - градусы дуги
     * @param M - минуты дуги
     * @param S - секунды дуги
     * @return десятичное представление угла
     */

    static double Ddd(int D, int M, double S)
    {
        double sign = 1.0;
        if (D < 0 || M < 0 || S < 0)
        {
            sign = -1.0;
        }
        return sign * (Math.abs(D) + Math.abs(M)/60.0 + Math.abs(S)/3600.0);
    }

    /**
     * Вычисляет градусы, минуты и секунды дуги
     * @param Ddd - угол в градусах в десятичном представлении
     * @return объект типа DMS
     */

    static DMS GetDMS(double Ddd)
    {
        double x;
        DMS ret = new DMS();

        x = Math.abs(Ddd);
        ret.setD((int)x);
        x = (x - ret.getD())*60.0;
        ret.setM((int)x);
        ret.setS((x - ret.getM())*60.0);
        if (Ddd < 0)
        {
            if (ret.getD() != 0) ret.setD(ret.getD()*-1);
            else if (ret.getM() != 0) ret.setM(ret.getM() * -1);
            else ret.setS(ret.getD() * 1.0);
        }
        return ret;
    }
}
