package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
        key     value
        Cat  =  Kedi
        Dog  =  Kopek

        Map'lerde key kismi unique tekrarsiz data icerir. Value kismi unique olmak zorunda degildir non-unique'dir.
        Key kisminda null tekrarsiz olarak kullanilir ama value'larda null bircok kere kullanilabilir.

        Dog = Kopek ==> yapisina EntrySet denir kisaca Entry denir. Maplere hakkinda konusurken Map'in Entry'si deyin.
        EntrySet'te neden Set kullaniliyor? Unique bir seyle baslayan seyin tamami Unique'dir Cunku bas kismi yani key kismi unique'dir.. O yuzden tekrarsiz oldugu icin Set Kullanilir.
        HashMap'ler EntrySet'leri siralamakla ugrasmazlar, HashMap'ler rastgele siralamaya koyarlar. Cunku siralama zaman ister, siralama yapmadigi icin HashMap'ler super fast'tir.

     */


    /*
        1) Map'ler key value structure kullanir.
        2) Key'ler unique'dir
        3) Value'lar tekrarli data icerebilir
        4) Map'lerde eleman degil EntrySet kullaniriz.
        5) Key'ler de null tekrarsiz olarak kullanilir.
        6) Value'lar null kabul eder
        7) HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar
        8) Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisirlar.
        9) Koseli parantez degil , suslu parantez kullanir.
     */


    public static void main(String[] args) {


        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali",13);
        studentAges.put("Tom",21);
        studentAges.put("Brad",12);
        studentAges.put("Ajda",76);
        studentAges.put("Cuneyt",75);
        studentAges.put("Ali",88); // Ayni key degerini tekrar kullandiginizda hata vermez overwrite yapar Artik yazdiricnca {Ali =88} gorunecek
        studentAges.put(null,55);
        studentAges.put(null,66);
        studentAges.put("Ayhan Isik",null);
        studentAges.put("Sadri Alisik",null);


        System.out.println(studentAges); // {Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=13}

        //Map'den sadece Key'ler nasil alinir?
        Set<String> keys = studentAges.keySet(); // Keyleri setin icine koyarak verir
        System.out.println(keys); // [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        // Map'den sadece value'lar nasil alinir?
        Collection<Integer> values = studentAges.values(); // Collection olarak verir
        System.out.println(values); // [66, null, null, 21, 76, 12, 75, 88]
        // values aldigimizda bize en son guncellenmis degerleri veriri.
        // yani overwrite olduysa overwrite olduktan sonraki son degerleri verir


        // Belli bir key'ye ait value nasil alinir
        Integer cuneytAge = studentAges.get("Cuneyt"); // get methoidu verilen keyye ait value'yu dondurur.
        System.out.println(cuneytAge); // 75


        // Example 1 : Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz.
        Collection<Integer> ages = studentAges.values();
        Integer sum = 0;
        int counter = 0;

        for (Integer w: ages){

            if (w!=null){
                sum+=w;
                counter++;
            }
        }
        System.out.println("Ortalama yas : "+ (sum/counter)); // Ortalama yas : 56


        // Example 2 : A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        Set<String> names = studentAges.keySet();
        System.out.println(names); // [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]
        Integer toplam = 0;


        for (String w : names){

            if (w!= null && !w.startsWith("A")){
                toplam= toplam+w.length();
            }
        }
        System.out.println(toplam);



        // remove("Ajda",76); key'si Ajda ve Value'su 76 olan EntrySet'i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda",76); // sildikten sonra boolean verir
        System.out.println(result); // true ajda'yi sildi.
                                    // Ama 76'yi 77 yaparsam bende Ajda,77 diye bir sey olmadigi icin silemeyecek false diyecek


        Integer result1 = studentAges.remove(null);  // sildikten sonra valuesunu verir
        System.out.println(result1); // 66

        // Key varsa value'u ver, key yoksa sizin istediginiz degeri verir.
        Integer result2 = studentAges.getOrDefault("Brad",0);
        System.out.println(result2); // 12 verir cunku Map'imde Bradd var ve degeri 12 Eger Map'imde brad olmasaydi default Value'ya kac yazdiysak onu verirdi
        Integer result3 = studentAges.getOrDefault("Brandon",0);
        System.out.println(result3);//0
        Integer result4 = studentAges.getOrDefault("Sadri Alisik",0);
        System.out.println(result4); // null
        Integer result5 = studentAges.getOrDefault("Sadriye",0);
        System.out.println(result5); // 0


        // Value null ise ekleme yapar , value null degilse ekleme yapmaz.
        Integer result6 = studentAges.putIfAbsent("Brad",100);
        System.out.println(result6);// 12
        System.out.println(studentAges); // {Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        Integer result7 = studentAges.putIfAbsent("Ayhan Isik",100);
        System.out.println(result7);// null
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        // key yoksa ekleme yapar
        Integer result8 = studentAges.putIfAbsent("Acun Ilicali",200);
        System.out.println(result8);// null
        System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}


        // replace() method'u valuelari degistirmek icin kullanilir.
        studentAges.replace("Acun Ilicali",49);
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        studentAges.replace("Acun Ilicali",49,53);// bu kullanimda acun 49sa degistir. once bak ondan sonra degistir olarak yapiyor
                                                                       // keyyi ve value'yu kontrol ediyor ondan sonra update ediyor
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}
        // replace() method'u value'lari key ve value'yu kontrol ettikten sonraa degistirdi


        // Example 3 : Map'deki her bir Entry'yi ekrana farkli bir satirda olacak sekilde yazdiriniz

        Set<Map.Entry<String,Integer>> entries =  studentAges.entrySet();
        // |--------data tipi------|    ==> set olustururken kucuktur ve buyuktur sembolu arasina data tipini yazariz.
        // loopda once data tipini yaziyorduk ya o yuzden loopun icine onu yazdik
        for (Map.Entry<String,Integer> w: entries){
            System.out.println(w);
        }

        // entruSet() method'u Map'deki her elemanlari bir Set'in icine koyarak size verir.




    }
















}
