package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {


        /*
             ArrayLists'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.

             Array ile ArrayList'in farki nedir? !!! interview sorusu!!!
             1) Array olusturuken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz.
                Arrayler eleman sayisinda "fixed" dirler.

                ArrayListleri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayListler eleman sayisinda "flexible" dirlar.

             2) Arraylerin icine primitive ve adreslerini (referencelar) konabilir.
                ArrayListlerin icine ise sadece "non - primitive"ler konulur. !!!!!!!!!

             3) Arrayler super fast, cok hizlidir. Arrayler memoryyi cok az kullanir.
                Eleman sayisi(uzunluk, length) kesin belli olan coklu datalari depolamak icin Array kullaniriz. Ama eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.
                Eger length hakkinda eminseniz (uzunlugundan emin oldugunuz) durumlar icin Arrray kullaniniz. haftanin gunlerinin 7 olmasinda mesela.
         */




        // ArrayList nasil olusturulur?

        //1.YOL :
        ArrayList<Integer> ages = new ArrayList<Integer>();  //new den sonraki kisim constructor. icine data tipini de yazabilirz o da olur

        // 2.YOL :
        ArrayList<Integer> heights = new ArrayList<>();  // bu ozel bir tanimlama arraylists derken. list demek genel bir tanimlama gibi

        // 3.YOL :
        List<Integer> nums = new ArrayList<>();  // genellikle 2. ve 3. yol kullanilir. hatta 3 daha kisa diye cogunlukla 3 kullanilir.


        // ArrayList'ler nasil yazdirilir ?
        System.out.println(nums);  // [] bos oldu.


        // ArrayList'lere nasil eleman eklenir ?
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums); // [21, 18, 20]
        // add methodu() her zaman elemani en sona ekler. (insertion order)
        // add methodu() boolean return eder. true veya false . true demek gorev tamam demek. false ise add dememize ragmen yerlestirilemedi demek.

        nums.add(1,50); // 2 parametreli add methodu verilen indexe verilen elemani koyuyor. bu indexli olanda java hicbir sey return etmez. data tipi void'tir.
        System.out.println(nums); //[21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices); // Collectionlu method : bir listi baska bir liste ekleyebilirsiniz demek. yani nums listine prices listindeki her seyi ekle demek. en sona ekler
                             // addAll ' u kullandigimizda ilki degisir.
        System.out.println(nums); //[21, 50, 18, 20, 23, 185]
        System.out.println(prices); //[23,185]

        nums.addAll(2,prices); // num'in 2. indexine prices'i ekliyor. coklu eleman ekleyebiliriz ve onu istedigimiz indexe koyabiliriz.
        System.out.println(nums);  // [21, 50, 23, 185, 18, 20, 23, 185]


        // ArrayList'lerin eleman sayisi nasil bulunur ?
        int elemanSayisi = nums.size(); // size methodu size kac eleman oldugunu,eleman sayisini verir o da int 'tir.
        System.out.println(elemanSayisi); // 8

        // NOTE : Array'lerde eleman sayisini "length" veriyordu. ArrayListlerde ise eleman sayisini "size" verir.


        // ArrayList'lerde herhangi bir eleman nasil secilir ?
        int el1 = nums.get(3);  // indexi 3 olan elemani al demek. spesifik bi elemani almak icin kullanilir.
        System.out.println(el1); // 185
        // get() methodu istenen bir indexdeki elemani verir.


        // ArrayList'in bos olup olmadigini nasil anlariz ?
        boolean bos1 = nums.isEmpty(); // boolean return eder. bos oldugu zaman true veriri bos degilse false verir.
        System.out.println(bos1);  // false cunku nums listi eleman iceriyor.

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2); // true


        //ArrayList'de bir eleman nasil degistirilir?
        nums.set(3,200); // set() methodu degistirme update etmek donusturmek icin kullanilir. index ile calisiyor. indexi vericeksiniz yeni elemana degisecek.
        System.out.println(nums); // [21, 50, 23, 200, 18, 20, 23, 185] oldu artik nums


        // Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for(int w: nums){
            if( w% 2 != 0){

                nums.set(nums.indexOf(w), w+11);

            }
        }
        System.out.println(nums);  // [21, 50, 23, 200, 18, 20, 23, 185] idi  == > [32, 50, 34, 200, 18, 20, 34, 196] oldu



        // Example 2: ArrayListten 34 elemaninin ilk gorunumunu siliniz.

        // NOTE : tum tam sayilar java icin aksi soylenmedikce primitive'dir. yani "int"dir.
        // NOTE 2 : " primitive " ler ArrayListlerin elemani olamazlar.
        // NOTE 3 : ' primitive " i Wrapper Classa cevirirseniz non-primitive olur ve non primitiveler ArrayListlerin elemani olur, index olamaz.

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums); // [32, 50, 200, 18, 20, 34, 196]
        // remove() methodunun icine tam sayi koyarsaniz java onu index olarak kabul eder. ve onu silmeye calisir. non -primitiveleri java index kabul etmez.










































































    }
}
