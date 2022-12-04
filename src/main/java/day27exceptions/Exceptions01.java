package day27exceptions;

public class Exceptions01 {


    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java","xy");
        System.out.println(r1); //2.0

        double r2 = compareNumOfCharacters(null,"xy");
        System.out.println(r2); //2.0

        double r3 = compareNumOfCharacters("Selenium","");
        System.out.println(r3); //2.0


    } //main

    // Verilen iki String'den birinin karkater sayisinin digerinin kac kati oldugunu veren method olusturunuz.
    public static double compareNumOfCharacters(String s , String t){

        double result=0;

        try {
            result = s.length()/t.length();
        } catch (NullPointerException e){
            System.out.println("length() method'u null ile kullanilamaz.");
        } catch (ArithmeticException e){
            System.out.println("Herhangi bir sayi 0 ile bolunemez.");
        }finally {
            System.out.println("Database ile connection kesildi");  // eger kod yazarken her halukarda bir fiili yapmasini istiyorsaniz finally{} suslu parantezleri arasina yazman gerekiyor.
        }
        return result;
    }// method

    /*
        Javada birbirine benzeyen 3 tane keyword vardir. Aciklayiniz. (INTERVIEW SORUSU)
        1) "final"          2) "finally"        3)"finalize"

        1) "Final" bir keyword'dur. Variable,Class ve Methodlar icin kullanilir...
            "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                        final variable'lar isimlendirilirken büyük harfler kullanılır, isimlendirmede birden fazla kelime
                        kullanılırsa kelimeler arasina "_" konulur.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.
        2) "Finally" bir "code block"dur.
           "try-catch" veya sadece try ile kullanilir.
           "finally" code block icine yazilan kodlar her halukarda calistirilir.
           Mesela Database ile connection'i kesmek her halukarda yapilmasi gereken bir fiildir. Bunu finally ile yapabiliriz.
        3) "finalize" bir method'dur. Bu method Java tarafindan datalar imha edilmeden once cagrilir. bu method datalari
           imha edilecek hale getirir ve daha sonra garbage collector bu data'lari imha eder.
           "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.

     */


    /*
                    Interview sorusu : "final", "finally", "finalize" nedir?

            final(keyword): ==> final method override edilemez.
                          final variable degeri degistirilemez.
                          final class child class sahibi olamaz.
            finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

            finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.
     */




}// class
