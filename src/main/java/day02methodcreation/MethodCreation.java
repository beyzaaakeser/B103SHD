package day02methodcreation;

public class MethodCreation {

    // main method icinde kullanacagimiz her sey "static" olmalidir.

    public static void main(String[] args) {

       System.out.println(toplamaYap(1.2, 5)) ;

       System.out.println(carpmaYap(2,1.5,6));

       System.out.println(ilkIkiSayiyiToplaUcuncuyleCarp (2,8,3.2));

       // sout yazip entera basiniz. System.out.println() otomatik olarak yazilir
       // Ekrana bir sey yazdirmak icin iki tane kod var 1) System.out.println 2) System.out.print()
       // ln = line'in kisaltimidir. line satir demektir ve bir sonraki satira gecer satir basi yapar yani
       // sadece print ise yandan devam eder satir basi yapmaz alt satira gecmez



    }


    // Example 1:  toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a,double b){
        return a+b;
    }

    // Example 2: uc sayiyi birbiriyle carpan bir method olusturunuz.
    public static double carpmaYap(double x, double y, double z){
        return x*y*z;
    }


    //Example 3: uc sayidan ilk iksini toplayip ucuncu ile carpan method olusturup sonucu yazdir.

    public static double ilkIkiSayiyiToplaUcuncuyleCarp(double a, double b, double c){
        return (a+b)*c;
    }


}
