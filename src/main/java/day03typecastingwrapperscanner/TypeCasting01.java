package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: bir numeric data type'ini diger numeric data type'ine cevirmektir.
    //              byte < short < int < long < float <double
    // Note: Kucuk data typeinden buyuk data typine gecis yapmaya veya kucuk data typeini buyuk data typeine cevirmeye "Auto Widening" denir ==> Otomatik Widening
    // Note: Buyuk data typeini kucuk data typeine cevirmeye "Explicit Narrowing" denir ==> Acikca daraltma

    public static void main(String[] args) {


        byte age = 23;

        int newAge = age;

        long population = 1234;

        int newPopulation = (int)population;

        // Example 1 : shortu double a ceviren kodu yaziniz
        //Example 2 :  FLOATI BYTE YAPan kodu yaziniz

            short yil = 1971;
            double yeniyil = yil; //Auto Widening

            float nufus = 2895949F;
            byte yeniNufus = (byte)nufus; // Explicit Narrowing

            // java yuivarlama islemi yapmaz ondalik sayiyi tam sayiya cevirirken yuvarlama islemi yapmaz
            // ondalik kismini siler.

        int number = 515;
        byte newNumber =(byte)number;
        System.out.println(newNumber);//3 ==> intin araligi -128 ile 127 idi ya. java bunu alir bu arralikdaki sayilarin toplamina boler kalani yazar.
        // burada -128 ile 127 arasinda 256 sayi vardir. 515i 256ya boldu 3 kaldi. kalani yazar(kalani return etti) 3 diye
        // bunu cok yapmayiz genelde kullanmayiz ama yapinca sonuclar bu sekilde cikar

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);// -2 ==>

    }












}
