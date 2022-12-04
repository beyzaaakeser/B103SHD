package day22inheritancepolymorphism;

public class HondaAccord extends Honda{


    // Gorunmez Constructor'in gorunur halidir. Bunu yazmazsak gorunmez 1 tane  Constructor var demektir. bunu yazarsak gorunur 1 tane Constructor olur

    /*
        1) Siz Class olusturdugunuzda Java otomatik olarak gorunmez bir Constructor verir.
           Cunku Java, Class'in bir kalip oldugunu ve object olusturmak icin yaratildigini ve object olusturmak icin
           Constructor'in sart oldugunu bilir.
        2) Java'nin otomatik olarak olusturdugu bu gorunmez Constructor'a, Default Constructor denir.
        3) Siz kendiniz herhangi bir Constructor olusturdugunuzda Java "Default Constructor"i siler.
        4) Bir Class'ta birden fazla Constructor olabilir. Fakat bu Constructor'larin paraemtreleri farkli olmalidir.
        5) "this" keyword'u "bu class" anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
           "this.price" syntax'i constructor'larin icinde kullanilir.
        6) Constructor kullanarak variable uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir. Classdaki variable
           degerlerini degistiremez.

     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){ // burda HondaAccord olusturuken hicbir kriterim yok

    }

    public HondaAccord(int price){ // ama burada HondaAccordu fiyatini belirtmeden olusturamazsin dedik. fiyatini sizin belirlediginiz hondaaccord olustur dedik
        this.price = price;
    }

    public HondaAccord(int price, int year){  // fiyatini ve yilini vererek honda olusturmak istiyorum dedik.

        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord(int price,int year,String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;

    }























}
