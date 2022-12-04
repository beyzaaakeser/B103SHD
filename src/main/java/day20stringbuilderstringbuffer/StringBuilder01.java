package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
        1) StringBuilder Java'da bir Class'dir.
        2) StringBuilder, String olusturmaya yarar.
        3) String Class varken nicin "StringBuilder"a ihtiyac duyariz.
           Cunku "String" Class "Immutable Class"dir, ama biz bazen "Mutable" Stringlere ihtiyac duyariz.
           StringBuilder bize "Mutable" String verir.
        4) Immutable Classlarda var olan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde
           i) Memory'de yeni bir variable yeni degerle olusturulur.
           ii) Eski variable'nin pointer'i yeni variable'ye dondurulur.
           iii) Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir.


           "Mutable Class"larda var olan deger degistirilebilir. Orijinal deger korunmaz.

        5) "String Class"Larin "immutable" yapisi "Security" icin onemlidir
            Ayni degere sahip birden fazla String oldugunda, Java bir tane Container olusturur ve ayni degere sahip String'lerin bu container'i kullanmasini temin eder
            Bu memoryyi korumak icin iyidir ancak container'deki degeri bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir.
            Bu tehlikeden kurtulmak icin Java String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
            Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu yeni variableye yonlendirir. Boylelikle hem degisim saglanmis
            hem de digerleri etkilenmemis olur.


     */


    public static void main(String[] args) {
        String str = "Java";
        str = "Java super"; // bu kodu yazdigimizda .. stack memory deki reference pointer kiriliyor yeni pointer olusuruyor.

        String hesapSahibi1 = "Tom Hanks";
        String hesapSahibi2 = "Tom Hanks";
        String hesapSahibi3 = "Brad Pitt";


        //StringBuilder nasil olusturulur..
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1); // Java

        StringBuilder strb2 = new StringBuilder();

        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //Yol 2  ==> Mtehod zinciri
        strb2.append(" Learn").append(" Java earn").append(" money.");

        System.out.println(strb2);


        //StringBuilder larda karakter sayisi nasil bulunur.. ==> length() metodu ile bulunur.

        StringBuilder strb3 = new StringBuilder();  //16 ==> bos iken memory de 16 capacity li kutu olusturur
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);

        //Capacity asimlarinda; capacity var olanin iki katini iki fazlasina cikar
        int capacity = strb3.capacity();
        System.out.println(capacity);  //Capacity asimlarinda; capacity var olanin iki katini iki fazlasina cikar

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity1 = strb3.capacity();
        System.out.println(capacity1); // 70 onceki 34'u 2ile carpti

        strb3.setCharAt(2, 'r');
        System.out.println(strb3); // Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        // delete  methodu ilki dahil ikincisi haric.  delete(3,18)  ==> Index 3(dahil) 18(haric)e kadasr tum karakterleri siler.
        strb3.delete(3,18); // delete methodu ilki dahil ikincisi haric
        System.out.println(strb3); // Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


        // deletecharAt(2);  ==> index 2 deki karakteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);// Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


        // reverse() methodu StringBuilder'i ters cevirir. Ali ==> ilA yapar.
        // "Mutuable" larda sadece method kullanmak orijinal degeri degistirmek icin yeterlidir.
        strb3.reverse(); // Bir Stringi ters cevirin derlerse mutlaka reverse methodundan bahsedin interview sorularinda
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        // "Immutuable"larda orijinal degeri degistirmek icin methodu kullanmak yeterli olmaz. Bir de atama islemi yapmalisiniz.
        String abc ="Java";
        abc = abc.replace("a","i");
        System.out.println(abc);  // Jivi

        // toString() methodu StringBuilder'lari Stringe cevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3); // mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        // Stringden de StringBuilder'a asagidaki gibi donebilirsiniz.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4); // mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        // insert ingilizcede araya yerlestirmnek demek.
        // insert(3,"XXXX"); 3.karakterden sonra "XXXX"leri koyar.
        // StringBuilder'da ilk  3 karakterden sonraya Xleri koy diyor.
        strb4.insert(3,"XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        //                         012345678
        strb4.insert(3,"KLMOPQRSTU",5,8);  // verilen bir stringin belli bir kismini araya sokuyor.
        System.out.println(strb4);// mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC
        // insert(3,"KLMNOPQRSTU",5,8) ==> 3. karakterden sonra, "KLMNOPQRSTU" Stringinin index 5, 6, 7, deki karakterlerini yerlestirir.



        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        int sonuc = a.compareTo(b); // 0
        // a.compareTo(b) methodu i)String builderlar tamamiyla ayni ise 0 verir
        //                        ii)a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii) a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.




















































































































    }
}