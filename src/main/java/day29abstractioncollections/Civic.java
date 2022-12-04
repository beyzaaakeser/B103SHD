package day29abstractioncollections;

public class Civic implements Engine, Ac{

    /*
        "abstract method"lar sadece ne yapilacagini soyler(what to do)
        'Concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini(how to do) da soyler(body kisminda)

        "interface"ler yapilack isler listesidir. (To do list)
        "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu methodlarin
         return type'lari ayni olmalidir. aksi takdirde hata verir

         "interface"lerde constructor olmadigi icin interface'lerden obje olusturulamaz.
         "abstract class"larda class olduklari icn constructor vardir.Ama constructorlar abstract classlarda obje olusturaamazlar.

         Soru: "Abstract Class" ile Interface'in farklari nedir?
         (Hocanin konusma siralamasi onerisi  ==>  1) Once methodlar hakkinda konus     2) Variableler hakkinda konus     3) Parent-Child iliskisi hakkinda konus )

         1) Method :
         "Abstract Class" hem abstract methodlar hem de concrete methodlar icerebilir.
         "interface"ler ise sadece abstract methodlar icerir.
         Ama istersek interface'ler icinde de default ve static keywordler kullanarak concrete methodlar olusturabiliriz.

         2) Variable :
         "abstract class"larda normal classlardaki gibi her turlu variable olusturulabilir
         "interfacelerde ise variable'lar public static ve final olmak zorundadir.

         3) Inheritance(Parent-Child iliskisi) :
         "Abstract Class'lar class olduklari icin multiple inheritance'a musaade etmezler.
         "interface"ler ise multiple inheritance'i desteklerler.

         4) Object Creation
         "Abstract Class"larda constructor vardir ama object olusturmada kullanilmazlar
         "interface"lerde ise constructor olmadigindan object olusturulamaz.



         Soru 2 : Obcejt Oriented Programming Prenciples nelerdir?
                  1) Inheritance
                  2) Polymorphisim
                  3) Encapsulation
                  4) Abstraction






     */


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }

//return typle'lar farkli olcaksa method isimleri ayni olamaz price ornegine bak ders kaydindan.
//    @Override
//    public void price() {
//
//    }


}
