package day30collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
        Ilk giren ilk kullanmaniz (First in first out ==> FIFO ) gerektiginde Queue en iyi secimdir.
        Queue da elemanlar "insertion order" a gore dizilirler.
        Queue da peek(), poll() , element(), remove() ilk elemani ilgilerndiren bircok method vardir
        offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.

     */



    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse); // [Milk, Meat, Bread, Honey, Tomatoes]

        //wareHouse.offer();
        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        Params: e – the element to add
        Returns:true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue

        !!!! Offer methodu elemani, kapasite uygunsa ekler. Kapasite musait degilse exception atiyor. !!!!
        offer methodu bize boolean veriyor. kapasite uygunsa eklemeyi yaparsa true verir kapasite dolduysa eklemeyi yapamadiysa false'dur

         */

        wareHouse.offer("Potatoes");
        System.out.println(wareHouse); // [Milk, Meat, Bread, Honey, Tomatoes, Potatoes] en sona ekler.





    }

}
