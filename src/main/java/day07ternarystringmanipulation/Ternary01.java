package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        // Example 1: Bir sayinin pozitif olup olmadigini  ekrana yazdiran kodu yaziniz

        //1.Yol :

        int a = 0;

        if(a>0){
            System.out.println("Pozitif");
        }else {
            System.out.println("Pozitif degil");
        }

        //2.Yol :

                //     Condition  ? Condition dogru ise uygulanacak kod  :  condition yanlis ise uygulanacak kod    ;
        String sonuc = a>0        ? "Pozitif"                            : "Pozitif Degil"                          ;
        System.out.println(sonuc);


        //Example 2: Iki sayidan kucuk olani secen kod yaziniz.

        int b = 23;
        int c = 23;

         int min = b<c ? b : c;
        System.out.println(min);


        //Example 3: Verilen bir sayinin mutlak degerini hessaplayan kodu yaziniz.\
        //           Pozitif sayilarin ve 0'in mutlak degeri kendileridir. Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.
        int d = 45;

        int mutlak = d<0 ? -1*d : d;
        System.out.println(mutlak);

        // Example 4 : iki sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise islem yapamam mesaji veriniz.

        int e =12;
        int f =10;

        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem Yapamam";
        System.out.println(islem);
        // int koyunca :den sonraki kisim hata veriyor cunku orasi int degil farkli data typei. eger string koyarsam da :den oncesi hata veriyor.cunku farkli data typei
        // butun classlarin babasi var OBJECT class.
        // o zaman ornekteki iki farkli data typeini de hata almadaan calistirmak icin objecti conteynir yapariz
        // Ternary farkli data tiplerinde sonbuc return ederse sonucun data tipini "Object" yapiniz.

        // Javada her classi'in en az 1 tane "parent" class'i vardir. Sadece "Object" class'in "parent" classi'i yoktur.





















    }
}
