package day31maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {

    /*
        1) Siz HashMap<String ,Double> salaries = new HashMap<>(); yazdiginizda Java memory'de 16 kutu(Bucket) iceren bir yapi olusturur vve
           bu yapidaki herbir kutuya index verir.  indexler 0'dan 15e kadardir, cunku 16 kutu var
        2) Siz salaries.put("QA",110000.00); yazdiginizda Java key icin bir HashCode olusturur. Bu HashCode'u 16'ya boler ve kalani index olarak kullanir.
           ve bu elemani o index'e yerlestirir
        3) Yerlestirirken 4lu bir yapi olusturur bu yapinin ilk bolumune "HashCode'u, ikinci bolumune key'yi, ucuncu bolumune value'yu, ve dorduncu bolumune
           pointer'i koyar. Bu cok bolumlu yapui LinkedListlerdeki "Node"dur. Yani HashMap Bucket'lara koydugu data'yi LinkedList olarak depolar
        4) Java null icin hep HashCode olarak 0 zero uretir. O yuzden key null oldugunda eleman ilk bucket'a yerlestirilir.
           Bundan dolayi key'si null olan elemanlar Map'in icinde genellikle ilk sirada gozukurler.
        5) Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin ayni HashCode uretilebilir buna "Hash Collision" denir
           "Hash Collision" meshur bir Java Development problemidir. bu problem ile karsilasildiginda developerlar bu problemi cozmek icin kodlar yazarlar
           Ama bu Core Java'nin konusu degildir.

     */


    public static void main(String[] args) {

        HashMap<String ,Double> salaries = new HashMap<>();  // biz bu kodu yazdigimizda java memoryde 16 tane kutu(Bucket) olusturuyor sonra bu kutulari indexliyor 0 1 2 3 4..15 diye

        salaries.put("QA",110000.00); // sonra biz bu kodu yazinca java keyye bakarak hashcode olusturuyor
        salaries.put("Dev",130000.00);
        salaries.put("Salesforce",125000.00);

        // HashMap bucket'larin icinde LinkedListler kullaniyo
        // Key null oldugunda hashcode'u hep 0 verir. 0 da ilk bucket oldugu icin null'i hep ilk gosterir. normalde siralama yapmaz ama nullar bu sebepten basta olur.
        // Genellikle 1 tane 16liyla calismaya calisir. eger doluluk orani asarsa 2.bir 16li olusturabilir. ama bizim buna girmemize gerek yok.


        Set<Map.Entry<String,Double>> entries =salaries.entrySet();
        System.out.println(entries);

    }


}
