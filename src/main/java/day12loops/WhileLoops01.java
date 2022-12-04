package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        // Example 1 : 3den 10a kadar tam sayilari ayni satirda ekrana yazdiran kodu yaziniz.


        // 1.YOL :
        for (int i = 3 ; i<11; i++){
            System.out.print(i+ " ");
        }


        System.out.println();


        // 2.YOL :
        // butun looplarda baslangic degeri, hangi sartlarda calisacagi, artirma azaltma mutlaka vardir.

        int i =3; // baslangic degeri

        while(i<11){ // hangi sartlarda calisacagi
            System.out.print(i+ " ");

            i++;  // increment decrement
        }


        System.out.println();


        // Example 2 : 17den 4 e kadar tum cift sayilari ekrana ayzdiran kodu yaziniz ayni satirda

        int k = 17;

        while(k>3 ){
               if (k%2==0){
                   System.out.print(k+ " ");
               }
            k--;
        }


        System.out.println();

        //Example 3: 12den 67 ye kadar olan sayilarin toplamini veren kodu yaziniz

        int sum =0;

        int m =12;

        while(m<68){

            sum = sum+m;

            m++;
        }

        System.out.println(sum);


        // Example 4  : Size verilen tam sayinin rakamlari toplamini ekran yazdiran kodu yaziniz. !!! ONEMLI SORU !!!


        int sonuc =0;

        int sayi = 385;

        while(sayi>0){

           sonuc = sonuc+ sayi%10;

            sayi = sayi/10;
        }

        System.out.println(sonuc);


        // Example 5 : kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int s = input.nextInt();

        int n = 1;

        while(n<11){

            System.out.println(s + "x" + n + "=" + s*n);

            n++;
        }





















































    }
}
