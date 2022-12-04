package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    // scannerlar disardaki datayi dijital ortama tasir. javadaki scanner da disardaki datayi benim kodumun icine tasir.
    //Scanner kullanicidan data almaya yarar. Scanner kullanici ile etkilesim kurmamizi saglar
    // Scanner bir java classidir. bu Classi kullanabilmek icin import etmek gerekir.
    // Scanner classi javanin util kutuphanesindedir.

    public static void main(String[] args) {


        // Kullanicidan data almak icin yapilmasi gerekenler.

        //1. Adim : Scanner Classindan object olusturunuz
        Scanner input = new Scanner(System.in);

        // 2.Adim : Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir...");

        // 3. Adim : Kullanicidan aldiginiz datayi bir varaiablenin icine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin" + age);























    }


































}
