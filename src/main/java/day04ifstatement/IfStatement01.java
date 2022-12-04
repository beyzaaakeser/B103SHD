package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //   If it rains        I will cancel the picnic
        //   sart bolumu         sonuc bolumu
        // sart dogru olursa true diyoruz. yani yagmur yagarsa sonuc kismi active olacak
        // eger sart false olursa sonuc kismi calismayacak deactive olacak
        // if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin

        int s = 12;

        if(s>0){
            System.out.println("Positive");
        }

        // Exasmple 2: verilen character buyuk harf ise ekrana buyuk harf yazdirin
        char ch = 'V';

        if(ch>='A'&& ch<= 'Z'){
            System.out.println("Buyuk Harf");
        }

        // And islemi sadece booleanlarda kullanilir. and isleminin oncesinde ve sonrasinda boolean olmalidir. baska bir seyde kullanamayiz.
        /*
        birinden     cay  ve  kahve     istedigimizi varsayalim
                     +          +           ==> true
                     +          -           ==> false
                     -          +           ==> false
                     -          -           ==> false
        And islemiu mukemmelliyetcidir. sadece hepsinin dogru oldugunda true kabul edilir ve kod calisir.
        and isleminde true alabilmenin tek yolu hepsinin true olmasi. herhangi biri false ise cevap hep falsetur

                    true && true = true
                    true && false = false
                    false && true = fasle
                    false && false = false
         */

        //Example 3: verilen sayi 3 basamakli ise ekrana 3 basamakli yazdiriniz.

        int sayi = -100;

        sayi =  Math.abs(sayi);// abs mutlak deger demek

        if(sayi>=100 && sayi<=999 ){// sayi>99 && sayi<1000 demek daha iyi cunku digerinde javayi ayri ayri > ve = islemlerini kontrol etmek zorunda birakiyoruz ve bu yavas olmasina sebebp oluyor diger kodda ise hizli calismasini sagliyoruz
            System.out.println("Uc Basamakli Sayi");
        }


        //Example 4 : Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.
        // cift sayi olmak demek 2 ile tam bolunmesine baglidir. java bolme isleminden kalan bulmak icin modulus islemini bulmus mod isareti % dir

        int p = -2;
        p = Math.abs(p);
        // = isareti atama operatorudur, matem,atikteki esittir anlamina gelmez
        // matematikteki esittir sembolu javada == seklindedir
        if(p%2 == 0){
            System.out.println("Cift Sayi");
        }

        // Example 5 : Verilen bir sayi 300 den kucuk veya 1200den buyuk ise ekrana "Harika Sayi" yazdirin.

        int r = 250;

        if(r<300 || r>1200 ){
            System.out.println("Harika Sayi");
            // Veyanin oncesine ve sonrasina sadece boolean koyabilirsiniz sadece booleanlarda kullanilir.

             /*
        birinden     cay  veya  kahve     istedigimizi varsayalim
                     +           +           ==> true
                     +           -           ==> true
                     -           +           ==> true
                     -           -           ==> false

                    true || true  ==>  true
                    true || false ==>  true
                    false || true ==>  true
                    false || false ==> false

            Veya islemi poilyanna gibidir 1 tane bile true olmasi true sonucunu verir.
            sadecce iki durumda false oldugunda false sonucunu aliriz

            */




        }















    }
















}
