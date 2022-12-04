package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // Example 1 : Kullanicidan bir sayi aliniz. sayi 100den kucuk ise ekrana "Kazandiniz!" yazdirin
        //             Aksi halde ekrana "Kaybettiniz!" yazdirin.
        //             Kullanici kazandikca oyun devam etmeli.


        Scanner input = new Scanner(System.in);
        int sayi = 0;

        do{
            System.out.println("Lutfen sayi giriniz");
            sayi = input.nextInt();

            if(sayi<100){
                System.out.println("Kazandiniz!");
            }

        }while(sayi<100);

        System.out.println("Kaybettiniz!");

        // do while loop boyle oyunlarda cok ise yarar. cunku kullanici once bir sey yapar oyunlarda.





        // Example 2 : Kullanicidan ismini aliniz ilk harfinin buyuk olup olmadigini kontrol ediniz.


        do {
            System.out.println("Lutfen isim giriniz.");
            char ch = input.next().charAt(0);

            if (ch>= 'A' && ch<='Z'){
                System.out.println("Isim basariyla kaydedildi.");
            }else{
                System.out.println("Ismi yanlis girdiginiz icin islem iptal edilmistir.");
                break; // sonsuz loop break ile kirilir.
            }

        }while(true);




        // Sonsuz dongu (Infinite loop)  ==> loop olustururken sonsuz olmamasina dikkat etmemiz gerekir.
        // sonsuz donguye girdiyse app dondu demek. appi bi donguye soktun sonraki isi yapmiyor demek.
        // kod calistiginda memory kullanilir. siz sonsuz dongu olusturdugunuzda memory kullanilir kullanilir kullanilir sonra
        // bir yerde memory dolar. memory doldugunda app hata verir out of memory hatasi. memory bitti demek
        // memory bitince otomatik duru ama bu cok tehlikeli bir sey.

        // !!!!      Infinite loop sorunsali, artirma azaltma kisminda hata yaparsaniz olusur. !!!!
        // !!!!      Infinite loop sorunsali, artirma azaltma kismini yazmazsak da olusur.     !!!!


        // Example 3 :



















































    }
}
