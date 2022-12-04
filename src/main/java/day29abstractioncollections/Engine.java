package day29abstractioncollections;

public interface Engine extends Vehicle{

    // Class ---> Interface ==> implements
    // Class ---> Class ==> extends
    // Interface ---> Interface ==> extends
    // Interface ---> Class ==> Mumkun degil yani bir class bir interface'in parent'i olamaz.

    // class'a, interface'i parent yapcagin zaman implements kullanacaksin
    // interface'e, interface'i parent yaptiginizda extends diyeceksiniz.
    // tipler ayni oldugunda extends kullaniyorsun, tipler farkli oldugunda impelements kullaniyorsun ama mumkun olmayani unutma


    int price=2000;// bu bir vaariable interface icine variable koyabiliyoruz.
                   // Access Modifier yazmadik cunku interfacelerin icindeki butun variableler otomatik olarak(default) "public"tir.
                   // Interfacelerdeki tum variable'lar otomatik olarak "final"dir. Variable'in degerini silersen hata verir.
                   // Deger atamasi yap diye sikayet eder. VE final'in diger ozelligi de variable'in degerini degistiremeyiz
                   // Interface'lerdeki tum variable'lar otomatik olarak(default) "final"dir.
                   // Interface'lerdeki tum variable'lar otomatik olarak(default) "static"dir.





    void run();






}
