package day25exception;

public class E01 {

    /*
        1) "Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
        2)  Exception'lar ile calismanin 2 yolu vaardir
            a) try-catch block kullanmak ve exception olussa bile calismayi devam ettirir.
            b) throw exception kullanarak calismayi durdurur (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz
               gerekiyorsa bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez)
        3) Eger exception'i handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
        4) try-catch kullanirken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz.
        5) try, catch olmaksizin yalniz kullanilamaz.
        6) Eger yazmis oldugunuz hehrnagi bir kod satirinda problem olabilecegini dusunuyorsaniz try -catch block icine koymalisiniz.
        7) catch block parantezi icerisine olmasi muhtemel exception claass ismi yazilir.
        8) e.getMessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
           System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
           e.printStackTrace(); methodu Exception ile ilgili detayli teknik mesaj verir. kod calismaya devam eder.
           System.err.println(); methodu hata mesajini renkli sekilde acikliyor. bu sayede konsolda diger mesajlardan ayirmak icin kullanilir.
        9) Eger try body icindeki kod sorunsuz calisirsa catch block calismaz devreye girmez.
     */



    public static void main(String[] args) {

        divide(6,2); //3
        divide(0,2); //0
        divide(6,0); //Exception - Matematikte bir sayi 0 ile bolunmez.

        System.out.println();
        divide2(5,0); // Exception
        divide2(12,3);


    } // main


    // 1.YOL Tavsiye Edilmez.
    // Bir developer icin tum matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide(int a, int b){
      if(b==0){
          System.out.println("Bir sayi sifir ile bolunemez");
      }else {
          System.out.println(a/b);
      }
    } // 1.method


    // 2.YOL try-catch kullanarak exception'i handle etmek tavsiye edilir.
    // Java matematik ile ilgili karsilasilmasi muhtemel tum istisnalari,hatalari ArithmeticException class'ina koymustur.
    // Matematikteki tum istisnalari detaylari bilmek zorunda kalmiyoruz. bu classtan kullaniyoruz
    // ArithmeticException javada bir classtir.
    // ArithmeticException class'indan bir object olusturdu
    // Burada yazdigimiz e : 'Javanin exeptionu atayacagi obje

    public static void divide2(int a, int b){

        try{
            System.out.println(a/b);
            System.out.println("hi exceptions");
            System.out.println("bye exceptions");
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu ==>" + e.getMessage()); // Bolme isleminde bir problem olustu ==>/ by zero
            e.printStackTrace(); // sout icine koymadik gerek kalmiyor direkt print yapiyor. Java bununla detayli teknik mesaj veriyo
            System.err.println("Bolme isleminde bir problem olustu");
        }

    }// 2.method



}// class
