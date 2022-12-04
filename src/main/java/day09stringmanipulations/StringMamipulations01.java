package day09stringmanipulations;

import java.util.Scanner;

public class StringMamipulations01 {
    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);//1

        // indexOf() methodu : verilen karakter veya karakterlerin ilk gorunumunun indexini verir
        // lastIndexOf() methodu: verilenn karakter veya kakarkterlerin saon gorunumunun indexini verir.

        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);//9

        String s = "Mississippi";

        int idxI = s.indexOf('i');// indexOf() methiodu hem String hem char ile kullanilabilir
        System.out.println(idxI);//1

        int idxIss1 = s.indexOf("iss");// ilk gorunumun "ilk" karakterinin indexini verir.
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");// son gorunumun "ilk" karakterinin indexini verir.
        System.out.println(idxIss2);


        //Example 1 : Bir String'deki bir karakterin tekrarsiz veya tekrarli olup olmaigini gosteren kodu yaziniz.
        //            "Helloooo"  ==>    H--> tekrarsiz   e--> tekrarsiz    l--> tekrarli   o--> tekrarli

        /*

                                                    Helloooo

                                                    01234567  // indexler


                       character                    indexof()               lastIndexOf()
                          H                            0                          0                     tekrarsiz
                          e                            1                          1                     tekrarsiz
                          l                            2                          3                     tekrarli
                          o                            4                          7                     tekrarli

                          Eger indexOf'la lastIndexOf esitse tekrarsiz
                          Eger indexOf'la lastIndexof esit degilse tekrarli
         */


        String t = "Helloooo";

        char c = 'H';

        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }


        String u = "Learn Java earn money";
        int sonuc = u.indexOf("a",6);
        System.out.println(sonuc);//7
        int sonuc2 = u.indexOf("n",5);// ilk gorunumu ver ama ilk 5 karakteri dikkate alma gormezden gel diyo. yani ilk 5 karakterden sonra gordugu ilk gorunum
        System.out.println(sonuc2);//14
        int sonuc3 = u.indexOf("e",4);
        System.out.println(sonuc3);//11

        // indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar karakteri gectikten sonra istenen karakterin ilk gorunumunun indexini return eder.



        // lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi inex olarak kabul edip en bastan bu indexe kadar olan karakterleri bir kutu icine aliniz
        // ve lastIndeOf methodunu sadece bu kutu icindeki String icin kullaniniz.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);//8
        System.out.println(e);

        String v = " ";

        boolean bosMu = v.isEmpty();
        // .isEmpty() methodu : Bir String'in bos olup olmadigini kontrol eder eger Strginde hic karakter yoksa isEmpty methodu true return eder, herhangi bir karakter varesa false return eder.
        //Eger verilen Stringte hic karakter yoksa bize true der. bir tane bile karakter varsa bize false diyecek bu karakter space de olabilir.
        // length() == 0 demek isEmpty() true verir. ama lengthde iki is yaparsin bu kullanilmaz kullanma. isEmpty kullan. interviewda garipserler.
        System.out.println(bosMu);//true

        String x = " ";

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        // is.Blank iki durum  icin true verir : hem bos String icin hem de sadece space iceren Stringler icin true return eder. ama isempty sadece bossa true verir space oldugunda false verir.


        //Example 2 : Kullanicidan alinan isim mutlaka Spaceden farkli en az 1 karakter icermelidir.

        Scanner input = new Scanner( System.in);
        System.out.println("Lutfen ilk isminizi giriniz..");

        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else {
            System.out.println(ilk);
        }







































    }
}
