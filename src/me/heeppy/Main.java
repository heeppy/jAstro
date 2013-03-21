package me.heeppy;

public class Main {

    public static void main(String[] args)
    {
        double x = 12.3456;
        Angle a;
        /*
        a = new Angle(x,Angle.AngleFormat.Dd);
        a.Print();
        a = new Angle(x,Angle.AngleFormat.DMM);
	    a.Print();
        a = new Angle(x,Angle.AngleFormat.DMMm);
        a.Print();
        */
        a = new Angle(x,Angle.AngleFormat.DMMSS);
        a.Print();

        a = new Angle(x,Angle.AngleFormat.DMMSSs);
        a.Print();

    }
}
