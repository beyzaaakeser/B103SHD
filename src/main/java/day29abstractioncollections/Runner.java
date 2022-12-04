package day29abstractioncollections;

public class Runner {

    public static void main(String[] args) {

        System.out.println(Engine.price);//2000
        System.out.println(Ac.price);//3000

        // Java ayni isimli farkli interfacelerde variable'lar varsa hangisinin degerini yazdiracagini karistirmaz.
        // Cunku siz o variable'lari interface'in ismiyle cagiriyorsunuz
        // Engine.price dediginde 2000 verir yani Engindekini, baska ihnterfacedekini cagirinca da o interfacedeki degeri verir
        // variable'larda data type'lar farkli olabilir. Sorun olmaz.
        // yani varible'lari ayni isimle ayni data tipiyle ya da farkli data tipiyle olusturabiliriz hicbir sorun yok
        // Ama methodlarda method ismi ayni ise farkli return type kullanamiyoruz.
        // Interfacelerde obje olusturamayiz. Nicin cunku interfacelerde constructor yoktur. Constructor olmadigi icin obje olusturamayiz.





    }//main





}//class
