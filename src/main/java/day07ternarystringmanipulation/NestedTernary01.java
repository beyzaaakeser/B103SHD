package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

       /*
             Verilen yilin leap yil( artik yil) olup olmadigini kontrol eden kodu veriniz.
             i) Yil 100e bolunurse 400e de bolunmelidir ==> 1600+   1800-
             ii) Yil 100e bolunmezse 4 e bolunmelidir   ==> 1996+   2001-
        */

        int year =2000;

        String leap = year%100==0 ? (year%400==0 ? "Leap year": "Leap Year degil") : (year%4==0 ? "Leap Year": "Leap Year Degil") ;
        System.out.println(leap);

        /*
            Asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz.
            i) 8 karakterden fazla veya 8  karakter varsa ilk harfi 'i' olmalidiri.
            ii) 8 karakterden az karakter varsa ilk harfi "K" olmalidir.
         */

        // length() methodu size kac tane karakter oldugunu verir.
        String pwd = "K2a3";
        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (ilkHarf=='K'? "Gecerli" : "Gecersiz") :(ilkHarf=='i'? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);






























    }
}
