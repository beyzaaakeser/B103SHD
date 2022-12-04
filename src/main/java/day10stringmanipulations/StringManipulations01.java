package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {


      //  Java Document'e ulasmak icin ctrl'ye basili tutup methodun ustune tikliyorsun. Java kutuphanesinden aciklama gelecek.


      String a = "Java kolaydir. ";

      // startsWith("kola", 5) kodu ilk 5 karakterden sonraki stringe bakar ve o stringin kola ile baslayip baslamadigini kontrol eder. kola ile basliyorsa true, kola ile baslamiyorsa false return eder.
      boolean b= a.startsWith("va",2);// 2.karakterden sonra neyle basliyor diyoruz burada ikinci karakter "a".    a'dan sonra "va" oldugu icin  true dedi. yani sayi olarak girdigini gececeksin. ondan sonraki stringe bakiyoruz.boslugu her zaman sayacagiz
        System.out.println(b);

        String c= a.replaceFirst("a","*"); // replace butun a'lari yildiza donusturur.
        System.out.println(c);                             // ama replacefirst yaparsak sadece ilk a'yi yildiz yapar

        //replaceFirst("a" ,"*"); kodu ==> Stringdeki ilk "a"yi "*"a cevirir.
        //replace("a","*"); Stringdeki butun a harfleriniini "*" cevirir

        String d = a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir Anladin mi?

        //concat() methodu iki tane Stringi birbirine yapistirmaya yarar.
        // "Concatenation" islemi iki turlu olur  ==>    1) + ile yapilir    2) concat() ile yapilir
        // Java bir islem icin method uretmisse o method'u kullanmak "best practice"dir.


        String e = "     Tom Hanks    ";
        System.out.println(e);// "     Tom Hanks    "

        String f = e.trim(); // Bir Stringin sadece bastaki ve sondaki space karakterlerini siler duzeltmeleri yapar .. Aradaki space'i silmez.
        System.out.println(f);// "Tom Hanks"



        // h.compareTo(i) kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        // Buyuk harf kucuk harfe duyarlidir.
        // Buyuk harf kucuk harfe duyarli olmasini istemezsek compareToIgnoreCase kullanabilirsiniz.
        // Bu kodda "h" nin alfabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        String h = "Java";
        String i = "Java";

        int k = h.compareTo(i);
        System.out.println(k);


        // a.repeat(5); a Stringin yan yana 5 kere yazar tekrarlar. Ve bu method bize String return eder.
        // a.concat(a).concat(a).concat(a).concat(a);  ==> boyle yapip tekrar tekrar yazacagimiza repeat diyip sayi girmek daha kolaydir ve kullanislidir.
        // repeat(0); empty String return eder.
        // eger dondurulucek sayi negatif ise ekrana hata mesaji verecek

        String n = a.repeat(5);
        System.out.println(n);












































    }
}
