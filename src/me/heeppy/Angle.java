package me.heeppy;//import static me.heeppy.Angle.AngleFormat.*;

/**
 * User: heeppy
 * Date: 19.03.13
 * Time: 20:55
 *
 *  Вспомогательный класс для представления углов в шестидесятиричном формате
 *
 */

public class Angle
{


    public enum AngleFormat
    {
        Dd,
        DMM,
        DMMm,
        DMMSS,
        DMMSSs
    }

    public Angle(double Angle, AngleFormat Format)
    {
        this.Angle = Angle;
        this.Format = Format;
    }

    public Angle()
    {
        this.Angle = 0;
        this.Format = AngleFormat.Dd;
    }

    public void Print()
    {
        switch(this.Format)
        {
            case Dd:
                System.out.printf("%12.2f\n",this.Angle);
                break;
            case DMM:
                double D = java.lang.Math.floor(this.Angle);
                double MM = (this.Angle - D)*60.0;
                System.out.printf("%9.0f %2.0f\n", D, MM);
                break;
            case DMMm:
                D = java.lang.Math.floor(this.Angle);
                MM = (this.Angle - D)*60.0;
                System.out.printf("%6.0f %5.2f\n", D, MM);
            case DMMSS:
                D = java.lang.Math.floor(this.Angle);
                MM = (this.Angle - D)*60.0;
                double SS = Math.Fraction(MM) * 60.0;
                System.out.printf("%6.0f %2.0f %2.0f\n", D, (double)(int)MM, SS);
            case DMMSSs:
                D = java.lang.Math.floor(this.Angle);
                MM = (this.Angle - D)*60.0;
                SS = Math.Fraction(MM) * 60.0;
                System.out.printf("%3.0f %2.0f %2.2f\n", D, (double)(int)MM, SS);
        }
    }

    private double Angle;
    private AngleFormat Format;
}
