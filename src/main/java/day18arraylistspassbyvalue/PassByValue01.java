package day18arraylistspassbyvalue;

public class PassByValue01 {

    // Gomlek = 100TL
    // Ogrenci = -10TL ==> 90TL
    // Gazi = -20TL ==> 80TL


    /*                                               NOTE:

            1) Java orijinal degerleri variable'larin orijinal degerlerini korumak ister.

            2) Variable method'lar icinde kullanildiginda , Java methodun icine orijinal degeri koymaz o degerin kopyasini uretir.
               ve methoda o kopyayi yollar. Method kopya ustunde calisir, kopya ustunde degisiklik yapar dolayisiyla variablenin orijinal degeri korunmus olur.
               bu sisteme "Pass By Value " denir.
               Java Pass By Value kullanir. Bazi programlama dilleri orijinal degeri koruma altina almamistir.
               bu isi developerlara birakmistir. bu tarz diller "Pass By Reference" kullanir.
     */

    // methodlar main methodun disinda olusturulur. disi derken alti ve ustu fark etmez.
    // methodlarda return type yazmak zorundasiniz.
    // main method statiktir ama

    public static void main(String[] args) {

        int x = 5;// gomlek
        System.out.println(x);
        // static method olan main method'un icindeki her sey static olmalidir.
        change(x); //  ogrenci gomlegi
        System.out.println(x);// gomlek 5 goruruz java orijinal degeri korur.


        int ucret= 100; // bu benim orijinal degerim. bunun degismesini istemiyorum.
        ucret = indirim(ucret);

        System.out.println(ucret);// 100 gelecek


    }
    public static void change(int a){
       System.out.println(a*3);
    }

    // void disindaki "return" type'larda method body'si icinde "return" keyword kullanilmalidir.
    public static int indirim (int gomlekUcreti){
        return gomlekUcreti - 10;


    }








}
