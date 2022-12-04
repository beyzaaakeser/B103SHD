package day32maps;

public class StaticBlocks01 {

    public static double pi;

    // static blocklar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar
    // static blocklar class icindeki her seyden once calistirilir mesela main method'dan ve diger tum methodlardan once calistirilir.
    // static blocklar icinde sadece "static variable"lara deger atanabilir.
    // birden fazla static block varsa ustteki once calistirilir. cunku java yukaridan asagi sagdan sola calisir.
    static{
        System.out.println("Static block 2");
    }



    public static void main(String[] args) {
        System.out.println("Main method");








    }

    static { // variable'lari main methoddan once isterseniz statick block arasinda deger atamasi yapmalisiniz. static block hr zaman classi olusturuken yazdigi icin
             // main methoddan sonra olmasinin bi onemi yok static methodlar her zaman once calisir
        pi=3.14;
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static block 3");
    }
}
