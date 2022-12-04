package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


     // binarySearch() Method : Bu method'u kullanareak bir elemanin array'de olup olmadigini anlariz.
     // binarySearch() Method'unu kullanmdan once MUTLAKA Arrays.sort kullanilmalidir.
     // bu method true false return ETMEZ
     // binarySearch() Method'u iki parametre kullanir. ilkine arrayin ismini yazarsin ikincisine sayiyi yazarsin
     // binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder. !!!!!!! ONEMLI !!!!!
     // binarySearch() Method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz.
     // bu sayidaki negatif isaretinin anlami bu eleman Arrraydde yok demektir. "a" nin anlami olsaydi kacinci sirada olurdu demek.  !!!!! ONEMLI !!!!!!
     // Note aranan eleman vaarsa indexini yazar. aranan eleman yoksa sira sayisini verir. !!! KACIRMA BU DETAYI !!!

     int arr[]= {12,31,43,14};

     int sayi1 = 43;

     Arrays.sort(arr); // 12, 14, 31 , 43

     Arrays.binarySearch(arr,sayi1); // java sort yaptiktan sonraki Array'de 43 u arar onun da indexi 3tur. bunu yazdirirsak ekranda 3 goruruz.

     int idx1 = Arrays.binarySearch(arr,sayi1);
     System.out.println(idx1);  // 3

     int sayi2 = 58;
     int sonuc = Arrays.binarySearch(arr,sayi2);
     System.out.println(sonuc); // -5  bu - (eksi)' nin anlami o eleman yok demektir. 5 ise olsaydi hangi sirada olurdu onu gosteriyor.


        //NOT : binarySearch() Methodu tekrarlayan elemanlar icin kullanilmaz.















































































    }
}
