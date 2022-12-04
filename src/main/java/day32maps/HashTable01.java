package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
            1) HashTable bir Map'dir.
            2) HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
            3) HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
                                                                            thread-safe ==> ayni anda birden cok is yapabilme becerisi.
                                                                            synchronized ==> coklu islerin zamandan tasarruf ederek yapabilme becerisidir mantikli bir siralamayla.
            4) HashTable'larda Key null olamaz, key'yi null yaparsaniz NullPointerException atar.
            5) HashTable'larda value null olamaz, value null olursa NullPointerException atar.
               HashTable ==> Keyde de Value'da da null kabul etmez

            Note : to String() method'u objeleri kondolda detayleriyla gorebilmek icin classlarin icinde olusturulur.
                   to String() method'unu olusturmadan objeyi konsola yazdirirsaniz java o objenin adresini yazdirir.

     */




    public static void main(String[] args) {


        Hashtable <String, Integer>  countryPopulations = new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);
        System.out.println(countryPopulations); // {USA=400000000, Germany=83000000, Turkey=90000000}
        //countryPopulations.put(null,9000000); HashTable'larda key null olamaz, nullpointerexception atar.
        //countryPopulations.put("France",null);


        /*
                HashMap ile HashTable farklari nelerdir?
                HashMap thread-safe ve synhcorinized degildir, HashTable thread-safe ve synhcorinizedir
                HashMapde key ve valueda null kullanilabilir ama HashTableda kullanilamaz
         */


        Hashtable<String,Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com",21,true));
        System.out.println(myStudents); // {Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}
                                        // |KEY| |---------------------------------VALUE--------------------------------|

        // Javanin classlari gibi kendi classlarimizi da data tipi olarak variable olarak kullanabiliriz. javanin classlari ile ne yapabilirsek kendi classlarimizla da onu yapabiliriz
        // bi classda to string varsa o classin objelerin detaylarini istedigimiz formatta konsolda gorebiliriz. to stringi kaldirirsaniz objenin detaylarini degil adresini goruruz

        String name = myStudents.get("Math").name;
        System.out.println(name); // Tom Hanks

        //get methodu key ile calisir. benim burdaki key'im sadece MAth. siz tom hankse ulasmak icin Mathi kullanamazsiniz. Math dersek butun datalari verir.
        // sadece ismi gormek istersek Students name = myStudents.get("name"). koyup name'i secmelisiniz. keysi math olan datanin sadece name'ini istiyorum dedik

        int age = myStudents.get("Math").age;
        System.out.println(age); //21






    }


}
