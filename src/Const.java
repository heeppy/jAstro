public class Const
{
    public static final double pi        = 3.14159265358979324;
    public static final double pi2       = 2.0*pi;
    public static final double Rad       = pi / 180.0;
    public static final double Deg       = 180.0 / pi;
    public static final double Arcs      = 3600.0*180.0/pi;
    public static final double AU        = 149597870.0;    // Астрономическая единица (км)
    public static final double c_light   = 173.14;         // Скорость света а.е./день

    /***
     * Радиусы Земли, Солнца и Луны
     */
    public static final double R_Earth   =   6378.137;     // [km]
    public static final double R_Sun     = 696000.0;       // [km]
    public static final double R_Moon    =   1738.0;       // [km]

    public static final double MJD_J2000 = 51544.5;        // MJD of Epoch J2000.0
    public static final double T_J2000   =  0.0;           // Epoch J2000.0
    public static final double T_B1950   = -0.500002108;   // Epoch B1950

    public static final double kGauss    = 0.01720209895;  // gravitational constant
    public static final double GM_Sun    = kGauss*kGauss;  // [AU^3/d^2]



}