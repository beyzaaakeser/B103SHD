package day30collections;

import java.util.HashSet;

public class HashSet01 {

    public static void main(String[] args) {

      /*
            Hash: Bir tekniktir birbirine benzemeyen kodlar uretir bu kodlar data'yi unique yapar
            Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
            set'lere ayni elemani eklerseniz hata vermez napar bir oncekinin ustune aynisini yazar.
            HashSeet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir
            HashSet'ler index kullanmazlar. Zaten siralamayi rastgele yapiyor nasil kullansin. Ama biz kod yazarken index kullaniyormus gibi yazariz. ayni linkedlistlerdeki gibi

            HashSetler  index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz.

            HashSetler:
            1)tekrarsiz elemanlarda
            2)sırlama onemli degilse
            3)hız cok önemliyse
            4)İndeks kullanmazlar
      */

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); // rastgele siralama yapti [Apple, Fig, Mango, Apricot, Orange]

        // var olan elemani eklerseniz hata vermez, son ekleneni var olan data'nin ustune yazar.(Overwrite)
        emails.add("Mango"); // eklemez cunku setler tekrarsizdir. hata vermez.
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails); // [null, Apple, Fig, Mango, Apricot, Orange]

        //emails.clear();// bir collectiondaki butun elemanlari silmek collectioni bosaltmak icin kullanilir.
















    }//main












}//clas
