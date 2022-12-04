package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        // Example 1: Kullanicidn aldiginiz ismin ilk ve son harfini ekrana yazdiriniz.==> Ramazan Rn

        Scanner input = new Scanner (System.in);
//        System.out.println("Lutfen isminizi giriniz.");
//        String isim = input.next();
//
//        char ilkHarf = isim.charAt(0);
//
//        char sonHarf = isim.charAt(isim.length()-1);// yazdiginiz kod sadece bazi durumlar icin calisirsa o koda "Hard Coding" denir.
//                                                    // yazdiginiz kod her durum icin calisirsa o koda "Dynamic Coding" denir.
//
//
//        System.out.println(""+ilkHarf+sonHarf);// basina string ekliyoruz ki ascii degerlerini toplamasin.
//
//
//        //2.Yol :
//        String ilk = isim.substring(0,1);
//        String son = isim.substring(isim.length()-1);
//        System.out.println(ilk+son);
//
//        //Example 2 : Verilen Stringdeki tum hayvan isimlerini ekrana yazdiriniz.
//        //            "Ben kedi, esim tavuk, oglum sever inek."
//
//        String str = "Ben kedi, esim tavuk, oglum sever inek";
//
//        String kedi = str.substring(4,8);
//        String tavuk = str.substring(15,20);
//        String inek = str.substring(34);
//
//        System.out.println(kedi +" " +tavuk + " "+inek);

        // substring()'in iki kuyllanimi vardir
        // 1) substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar.
        // 2) substring(baslangic indexi) String'in verilen indexten sonuna kadar almaya yarar .


        // Example 3: ILk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz.
        //                Tahsin  Yurdakul ==> TY
        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);

        String b = tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a+b);




















    }
}
