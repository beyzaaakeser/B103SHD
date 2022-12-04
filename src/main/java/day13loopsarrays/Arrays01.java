package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays01 {

    /*
            1) Ayni data tipinde, coklu data'i depolamak icin Java'nin olusturdugu yapilar vardir.
               Bu yapilardan birisi de Array'lerdir.

              coklu data alabilen container'lar ayni tip datayi alirlar. farkli data tiplerini kullanamazsin.
              bu coklu data tiplerini depolayabildiginiz containerlara "Array" denir.



                                            Array Nasil Olusturulur ?
              Array olusturmak icin once hangi tip data olusturacaksak onu yazariz
              sonra o Array'e isim veririz ve isimin sonuna bosluksuz koseli parantez koyariz.
              Koseli parantez olmazsa Java bunun Array oldugunu anlamaz.
              sonra = diyip new keyword'unu yaziyoruz.
              sonra da data tipini yazip koseli parantez yazariz yine. o koseli parantezin icine de kac tane coklu data koyacagimizi yazariz
              sonra da noktali virgul
              int stdAges[] = new int[7];    gibi     genel kullanim bu sekildedir.

              koseli parantezi istersek data isminden sonra da koyabiliriz. bu da calisir.  int[] stdAges = new int[7]; gibi
              koseli parantezi istersek array isminden once de koyabiliriz. bu da calisir.  int []stdAges = new int[7]; gibi


                                            Array Nasil Yazdirilir ?
              Bir Array'i yazdirmak icin ==> System.out.println(); diycez. Arrays classina gidicez. o classtan toString classini secip icine Arrayin ismini yazicaz.
              System.out.println(Arrays.toString(stdAges));   ==>  seklinde olacak.


                                            Array'lere Elemanlar Nasil Eklenir ?
              stdAges[1] = 11; Java benim olusturdugum Arraye git indexi 1 olan elemani bul onu 11 yap demektir bu




     */


    public static void main(String[] args) {

    int stdAges[] = new int[7]; // [ 0, 0, 0, 0, 0, 0, 0 ]

        System.out.println(Arrays.toString(stdAges));

        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;


        System.out.println(Arrays.toString(stdAges));// [ 12, 11, 13, 14, 10, 12, 12 ]



        // Arraydeki herhangi bir elemani nasil yazdirabiliriz ?
        System.out.println(stdAges[4]); //10



        // Example 1 :  Array'deki en kucuk ve en buyuk elemani ekrana yazdiriniz ?

        Arrays.sort(stdAges);  // .sort methodu arrayin icindekilerini al elemanlari kucukten buyuge diz demek
        System.out.println(Arrays.toString(stdAges));  // 10, 11, 12, 12, 12, 13, 14

        int ilk = stdAges[0];
        int son = stdAges[stdAges.length-1];  // length() parantezli sekilde Stringlerde kullanilir. length parantezsiz sekilde olunca Array'lerde kullanilir.
        System.out.println(ilk+son);//24



        // Exmple 2 : stdAges Array'i icindeki tum elemanlarin toplamini yazdiran kodu ekrana yazdiran kodu yaziniz.
            // Arrayler index kullandigi icin 0 dan basliyor.



        // 1.YOL : for-loop
        int sum = 0;

        for (int i= 0 ;i< stdAges.length; i++ ){

            sum = sum + stdAges[i];
        }
        System.out.println(sum);//84




        // 2.YOL : while-loop

        int i = 0;
        int toplam =0;

        while(i<stdAges.length){

            toplam = toplam + stdAges[i];
            i++;
        }
        System.out.println(toplam);


        // 3.YOL : do-while-loop

        int k =0;

        int s =0;

        do{

            s = s +stdAges[k];

            k++;
        }while(k<stdAges.length);

        System.out.println(s);


        // 4.Yol :  for-each-loop  en gelismis looptur. Array'lerde ve Collections'larda kullanilir.
        // for each loopda parantezin icine ilk yazilacak sey data tipidir.
        // for each loop index kullanmaz.


        int t = 0;

        for(int w: stdAges ){
              t = t+w;
        }

        System.out.println(t);



        // Example 3 : String bir Array olusturunuz. Bu Array'e 5 tane isim yerlestiriniz. Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz.

        String stdNames[] = new String[5];

        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";

        int karakterSayilariToplami = 0;

        for (String w: stdNames){
            karakterSayilariToplami= karakterSayilariToplami +w.length();
        }
        System.out.println(karakterSayilariToplami);//18


        // Example 4: Char bir Array olusturunuz. Bu Array'e 5 eleman ekleyiniz. Bu Array'deki sadece buyuk harfleri ekrana yazdiriniz.

        char ch[]= {'A' , 'c', 'D', 'k', 'M'};

        for (char w : ch){


            if (w>= 'A' && w<='Z'){
                System.out.print(w);
            }

        }






















































    }
}
