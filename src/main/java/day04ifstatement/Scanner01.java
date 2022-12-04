package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

            /*
            Kullanicidan ilk, orta ve soy ismini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789
            */

        Scanner input = new Scanner(System.in);


        //1.YOL :

//         System.out.println("Ilk isminizi giriniz...");
//
//        String ilkIsim = input.next(); // next(); methodu kullanicidan string datasi almak icin kullanilir. sadece ilk kelimeyi ali9r bosluga kadarki kismi alir devamini almaz
//
//        System.out.println("Orta isminizi giriniz...");
//        String ortaIsim = input.next();
//
//        System.out.println("Soy isminizi giriniz...");
//        String soyIsim = input.next();
//
//        System.out.println("Kimlik numaranizi giriniz...");
//        String kimlikNo = input.next();// Int de olabilir ama biz inti matematiksel islemler yapmamiz gerektiginde tercih ederiz. matematiksel islem yapmayacagimizda string tercih ederiz cunku kimse kimlik nosu ile toplama carpma yapmaz
//
//        System.out.println(ilkIsim+ " " +ortaIsim+" "+ soyIsim);
//        System.out.println(kimlikNo);



        //2.YOL:
        // yukaridaki GIBI PARCA PARCA YAPMAK YERINE HEPSINI TEK BIR YERDE YAPMAK

//        System.out.println("Ilk, orta , soy isminizi ve kimlik numaranizi giriniz...");
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik =input.next();
//
//        System.out.println(ilk+ " " +orta+" "+ soy);
//        System.out.println(kimlik);
//

        // 3.YOL:

        System.out.println("Ilk, orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine(); // nextLine(); methodu kullanicinin girdigi butun bir satiri butun Stringi bastan sona alir demek.
        System.out.println(tamIsim);


        System.out.println("Kimlik numaranizi girin");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);


        /*
            next() ile nextLine() in farki nedir?
            next() methodu kullanicidan gelen String'in sadece ilk kelimesini alir
            nextLine() methodu kullanicidan gelen Strin'in tamamini alir

         */
























    }





































}
