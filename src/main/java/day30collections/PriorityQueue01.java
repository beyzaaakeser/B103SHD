package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    /*

     */

    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue); // [A, C, B, G, E]
        // Benim verdigim siralamayi kullanmadi alfabetik de degil, Javanin kendisine gore belirledigi bir oncelige gore siralama yapar.
        // oncelikli siralama. Java elemanlara bakti kendisine gore oncelik belirleyerek siralama yapti. random demek degil. randomda java hicbir onccelige bakmaz
        // burada ise arkada java oncelik belirler.
        // PriorityQueue sectigimizde kendimiz sirlama olusturabiliriz. onu lambda dersinde gorcez.

    }


}
