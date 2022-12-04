package day24statickeywordencapsulation;

public class Car {


    public static String make = "Honda";
    public String model ="Accord";
    public int price = 20000;
    public static int counter = 0;

    // degisiklik yaptigimizda butun objeler etkileniyorsa buna static diyoruz. static olanlar classa baglidir classlara yapistirilir.
    // degisiklik yaptigimizda sadece o obje etkileniyorsa buna non-static diyoruz. static olmayanlar objeye baglanir. objeye yapistirilir. sonra da degisimler onlara gore yapilir.

    public Car(){
        counter++;
        price++;
    }







}
