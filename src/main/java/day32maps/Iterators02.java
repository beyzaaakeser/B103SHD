package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        /*
            1) has.next() methodu pointerdan sonra eleman varsa true, yoksa false return eder.
            2) next() methodu pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder.
            3) hasPrevious() methodu pointer'dan once eleman varsa true yoksa false return eder.
            4) previous() methou pointer'i bir onceki elemanin sonuna koyar ve ustunden atladigi elemani verir
         */

        /*
            ListIteratord'da
                                i)hasNext()
                                ii)next()
                                iii)set()
                                iv)hasPrevious()
                                v) previous()
                                vi)remove()
                                                    ogrendik
         */
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // Example 1: Iterators kullnarak list elemanlarini tersten console'a yazdiriniz.
        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()){
            itr.next(); //pointer'a gelir senden SONRA eleman var mi diye bakar. eleman varsa true dondurur. eleman yoksa false olur loop kirilir.
                       // eleman varsa bir sonraki elemana atlar ve ustunden atladigi elemani size verir
        }
                        // ustteki kodda pointer'i en saga aldik. alttaki kodda en sagdaki pointer'i one alarak elemanlari yazdirdik. pointer'i en saga almanin baska yolu yok.

        while (itr.hasPrevious()){
           String el=  itr.previous(); // pointer'a gelir senden ONCE eleman var mi diye bakar. eleman varsa true dondurur. eleman yoksa false olur loop kirilir.
                                       // eleman varsa bir onceki elemana atlar ve ustunden atladigi elemani size verir
            System.out.print(el+" ");  // M J A K Z
        }

        System.out.println();


        // Example 2 : Listteki tum elemanlari siliniz.(normalde bunu clear methodu ile yapabiliriz ama clear methodu arkada Iterator kullanir.)

        while (itr.hasNext()){
            itr.next(); // pointer'i bir saga itecek
            itr.remove(); // ustunden atlanan elemani silecek.
        }
        System.out.print(myList); // []

        System.out.println();

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();
        while (iterator.hasNext()){
            String el=iterator.next();
            System.out.print(el+ " "); //Z K A J M
        }
        /*
            Iterator'da
                                i)hasNext()
                                ii)next()
                                iii)remove
                                                methodlari vardir
         */










    }//main
}//class
