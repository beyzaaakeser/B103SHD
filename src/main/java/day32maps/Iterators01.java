package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for each loop kullanarak her elemanin sonuna "!" ekleyiniz.
        // Note : looplar kendi baslarina collection'lari list'leri  update edemiyorlar. Java bu yuzden "iterator"lari olusturdu
        //        iterator'lar collection'lari update etmek icn kullanilir. loop benzeri yapilardir.
        // iterator olustururken 0'dan olusturmayiz elimizdeki listten olustururuz.


        for (String w : myList){
            w= w+"!";
        }
        System.out.println(myList); //[Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();// var olan objeden yeni bir obje olusturduk. listimden listIterator olusturuyoruz.

        while (itr.hasNext()){
            String el = itr.next();
            itr.set(el+"!");
        }
        System.out.println(myList);// [Z!, K!, A!, J!, M!]



    }







}
