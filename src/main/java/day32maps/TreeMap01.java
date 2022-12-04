package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {

    public static void main(String[] args) {

        /*
            1) TreeMap'ler entrySet'leri Key'lere gore "naturel order"da siralar (alfabetik - kucukten buyuge)
            2) TreeMap'ler en yavas Map'lerdir.
            3) TreeMap'ler thread-safe ve synchronized degildir.
            4)
         */


        TreeMap<String, Double> salaries = new TreeMap<>();

        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Johns", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);
        System.out.println(salaries); // {Jimmy Johns=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        // tailMap() methodu verilen key'denb baslayarak sona kadar tum entry'leri size verir,
        SortedMap<String,Double> map1 =  salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1); // Kevindan sonrakileri verdi. yani girdigimiz datadan sonraki kuyruk.
                                  // TailMap methodu sadece TreeMap'de kullanilan bir method'dur.

        // tailMap(String, Boolean) methodu verilen key'den baslayarak sona kadar tum entry'leri size verir. ama false derseniz sizin verdiginiz keyyi haric tutar onu vermez
        NavigableMap<String,Double> map2 = salaries.tailMap("Kevin Bridgeman", false); // uzun kullanisli olani sectik. keyyi ver o verdgin key dahil olsun mu olmasin mi onu bana soyle diyo
        System.out.println(map2); // {Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String,Double> map3 = salaries.subMap("Kevin Bridgeman", true ,"Tom Hanks", false); // baslangic keysini soyle diyo sonra dahil olsun mu olmasin mi diye soyle diyo daha sonra hangi keyde durayim diyo sonra da durdugum key dahil mi olsun olmasin mi diyor
        System.out.println(map3); // {Kevin Bridgeman=6000.0, Mary Star=1000.0}  bir mapin alt mapini almis olduk

        Map.Entry<String,Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4); // Kevin Bridgeman=6000.0   lower bir oncekini verir. Mary Stardan 1 oncekini verir


        // lowerEntry("Paris Hilton") paris hiltondan bir oncesini verir. paris hilton olmasa da sanki varmis gibi davranir
        Map.Entry<String,Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5); // paris olsaydi maryden sonra tomdan once oolacakti alfabetik siraya gore. o sirada bir oncekinde ne varsa onu verecek
                                  // Mary Star=1000.0 verdi.


        Map.Entry<String,Double> map6 = salaries.higherEntry("Mary Star"); // higher entry girdiginden bir sonrakini verir Mary stardan bir sonrakini verdi
        System.out.println(map6); // Tom Hanks=3000.0

        Map.Entry<String,Double> map7 = salaries.higherEntry("Tom Hanks"); // bir sonrakini verir tom hanks en sonda oldugu icin ondan sonra bbir entry olmadigi icin null verdi.
        System.out.println(map7); // null ==> cunku Tom Hanks'den sonra eleman yok

        // ceilingEntry() var olan key ile kullanilirsa o key'yi verir var olmayan bir key ile kullanilirsa bir sonrakini verir
        Map.Entry<String,Double> map8 =salaries.ceilingEntry("Mary Star"); // varsa var olani verir yoksda bir sonrakini verir
        System.out.println(map8);// Mary Star=1000.0


        Map.Entry<String,Double> map9 =salaries.ceilingEntry("Paris Hilton"); // varsa var olani verir yoksda bir sonrakini verir
        System.out.println(map9); // Tom Hanks=3000.0


        Map.Entry<String,Double> map10 =salaries.floorEntry("Mary Star"); // ceilingEntrynin yaptiginin tersini yapar. varsa var olani verir. yoksa bir oncekini verir
        System.out.println(map10); //Mary Star=1000.0

        Map.Entry<String,Double> map11 =salaries.floorEntry("Paris Hilton"); // ceilingEntrynin yaptiginin tersini yapar. varsa var olani verir. yoksa bir oncekini verir
        System.out.println(map11); // Mary Star=1000.0










    }


}
