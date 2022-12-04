package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    // ArrayListler index kullanir ama index kullanmak keleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir
    // Cunku bircok elemanin re-index edilmesi gerekir. Java bu problemi cozmek icin yeni bir yapi olusturmus
    // bu yapiya linkedList demis. LinkedList nasil calisir?
    // Linkedlistteki her eleman iki bolumden olusur. ilk bolumde deger yani data konulur buraya data bolumu derler
    // ikinci bolum ise pointer bolumleridir. bu kisima pointer kidmi deniyor. bu iki bolumlu yapi farkli oldugu icin bu yapinin ismi Node'dur.
    // Yani Linkedlistler hakkinda konusurken eleman kelimesini kullanmayin Node kullanin.
    // En son Node'un pointer kismi null gosterir. en son node'un ozel ismi var ==> Tail(kuyruk)
    // Ilk Node'u gostermek icin tek bolmeli ve sadecde pointer bolmeli bir yapi var. Pointer'i ilk node'u gosterir. Bu yapiya da Head deniyor

    // ArrayList eleman ekleme cikarmada basarisiz demistik
    // ama LinkedList eleman silme ve eleman eklemede cok basarilidir.

    // ArrayListlerde index kullanmanin pozitif yonleri ==> index adres demektir index verdigin an elemani gider bulur.  ArrayList eleman bulmada basarilidir.
    // Ama LinkedListte index yok Z'yi bul dedigimde tek tek elemanlara bakiyor buluyor bu da cok islem gerektirir. Linkedlist eleman bulmada (search) basarisizdir.



    /*
        1) LinkedList'deki her eleman iki bolumden olusur i)Data  ii)Pointer
        2) LinkedList'deki her bir eleman "node" olarak adlandirilir.
        3) LinkedList'ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar
        4) LinkedList'ler eleman arama islemlerinde basarisizdirlar
        5) 3. ve 4. maddelerden dolayi eleman ekleme ve eleman silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir.
        6) ArrayList'ler index kullanir LinkedList'ler index kullanmaz
        7) index kullanmak eleman vulma islemlerinde cok basarilidir. Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz
     */


    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("tom");
        visitors.add("hanks");
        visitors.add("tom hanks");
        visitors.add("brad");
        visitors.add("pitt");
        visitors.add("brad pitt");
        visitors.add(2,"Angelina Jolie"); // buradakiindex degil javaya mesaj vermek gibi oluyo. nereye koymasi gerektigini gosterir.
        visitors.add("brad pitt");
        visitors.add("tom hanks");


        System.out.println(visitors); // [tom, hanks, Angelina Jolie, tom hanks, brad, pitt, brad pitt, brad pitt, tom hanks]


        // LinkedListler ekleme ve silme isleminde cok basarili oldugundan ekleme ve silme ile alakali cok fazla method icerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);//[Cuneyt Arkin, tom, hanks, Angelina Jolie, tom hanks, brad, pitt, brad pitt, brad pitt, tom hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors); // [Cuneyt Arkin, tom, hanks, Angelina Jolie, tom hanks, brad, pitt, brad pitt, brad pitt, tom hanks]

        visitors.removeFirst();
        System.out.println(visitors); // [tom, hanks, Angelina Jolie, tom hanks, brad, pitt, brad pitt, brad pitt, tom hanks]

        visitors.removeFirstOccurrence("tom hanks"); // ilk gorunumu sil  ==>  [tom, hanks, Angelina Jolie, brad, pitt, brad pitt, brad pitt, tom hanks]
        System.out.println(visitors);

        visitors.removeLastOccurrence("brad pitt"); // son gorunumunu sil ==>  [tom, hanks, Angelina Jolie, brad, pitt, brad pitt, tom hanks]
        System.out.println(visitors);

        //visitors.pop(); // iki is yapar. 1) ilk elemani siler 2) sildigi elemani bana verir.
        // eger LinkedList bossa NoSuchElementException atar. throws: NoSuchElementException
        // Cut + Paste ==> Ctrl+X yapar .pop();
        String firstEl= visitors.pop();
        System.out.println(firstEl); //tom
        System.out.println(visitors); // [hanks, Angelina Jolie, brad, pitt, brad pitt, tom hanks]


//        LinkedList<String> myList = new LinkedList<>();
//        myList.pop(); // NoSuchElementException atti cunku LinkedList bos. yoruma aldik cuinku throwdan sonra kodlar durur










    }







}
