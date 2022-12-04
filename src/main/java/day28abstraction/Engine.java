package day28abstraction;

public interface Engine {


        /*
         1) Atomic olsun diye “parent”i parcaladim ama bir “Child Class” in birden fazla “parent” i oldu bu ise Java’da mumkun degildir.
         Cunku Java “multiple Inheritance” i desteklemez.

         Multiple inheritance classlarda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
         bu yapida "multiple inheritance"a musaade etti.

         2) Interfacelerdeki tum methodlar abstract oldugu icin "interface"lere "fully abstraction" denir.
            "Abstract Class"larda abstract method ve concrate method bir arada kullanildigi icin abstract classlara "fully abstraction" DENMEZ.


        */

    // interface'lerdeki tum method'lar "abstract" olmak zorundadir.
    // interface'lerde abstract method olustururken abstract keyword kullanmaya gerek yoktur
    // cunku java o method'un abstract oldugunu bilir
    // interface'lerdeki methodlar java tarafindan otomatik olarak public kabul edilir. bu yuzden o method'lar icin public yazmaya gerek yoktur.

    // public abstract void eco();  ile  void eco(): ayni anlama gelir
     void eco();
     void gas();
     void tsi();


     // default keyword kullanarak interface'lerin icinde body'si olan metodlar uretebilirsiniz.
     public default int add(int a, int b){ // buradaki default access modifier degil. Bu interfacelerin icinde concrate method olusturmka icin javanin kullanmamizi istedigi keyword
         return a+b;
     }

     // static keyword kullanarak da interface'lerin icinde body'si olan metodlar uretebilirsiniz. Bu method static methodtur. staticler classlara yapistirilir.
     public static String update(String str){
         return str+"!";
     }



}


