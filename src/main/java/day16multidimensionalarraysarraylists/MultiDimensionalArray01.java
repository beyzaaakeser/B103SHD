package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        // Bir tane integer multidimensional array olusturunuz/
        // bu arraydeki tum sayilarin toplamini veren kodu yaziniz.


        int arr[][] = { { 2,5,1} ,  {32,75} , {13,21,43,56} };

        int sum = 0;

        for (int[] w : arr){

            for (int k : w){
                sum = sum + k;
            }

        }
        System.out.println(sum);


        /* Array veya Collection varsa "For Each Loop" kullanmak ilk tercihimiz olsun.
           Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for - each - loop " calismaz.
           "for loop" veya "while loop" veya "do while loop" kullanmalisiniz.

         */


        // Bir Multidimensional Array'i normal Arraye ceviren kodu yaziniz.
        // {{ 2,5,1} ,  {32,75}}  ==?  { 2, 5, 1, 32, 75 }

        // 1.ADIM : Multidimensional Array'deki eleman sayisini bulunuz. Cunku yeni bir Array olusturmaliyiz ve bu yeni Array'in uzunlugu orijinal Array'in eleman sayisina esit olmalidir.

        int brr[][] = { { 2,5,1} ,  {32,75} };

        int toplam = 0;

        for(int[] w : brr){
            toplam = toplam + w.length; // bu kod bana brr'deki eleman sayisini verecek yani 5'i

        }
        System.out.println(toplam);

        int idx = 0;

        int crr[]=new int[toplam]; // orijinal arrayde kac elemena varsa bu da o uzunlukta olacak.  [ 0, 0, 0, 0, 0, ] default value olarak sifir koyacak

        for (int[] w: brr){ // brr denen sey [ [2,5,1] , [32,75] ]

            for (int k : w){
                crr[idx] = k;
                idx++;
            }

        }
        System.out.println(Arrays.toString(crr));

























































    }
}
