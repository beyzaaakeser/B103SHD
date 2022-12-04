package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    // iki stringi karsilastirirken biz equals() methodunu kullaniriz. ingilizcede equal esittir demektir. stringlerin esit olup olmadigini anlamak icin == kullanmayin.
    // .equalsIgnoreCase() methodu isae iki string arasindaki kucuk harf buyuk harfi onemsemez verilen her seyi esit kabul eder.
    // .equals() dedigimizde Pazar ile pazari ayni kabul etmiyordu ama equalsIgnoreCase de pazar ile Pazar ayni ve kod dogru calisir.
    public static void main(String[] args) {
        //Example 1: kullanicidan gun isimlewrini aliniz o gunun hafta sonu mu hafta ici mi oldugunu yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("Gun isimi giriniz");

        String gun = input.next();

        if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta ici....");
        }else if(gun.equalsIgnoreCase("Sali")){
            System.out.println("Hafta ici....");
        }else if(gun.equalsIgnoreCase("Carsamba")){
            System.out.println("Hafta ici....");
        }else if(gun.equalsIgnoreCase("Persembe")){
            System.out.println("Hafta ici....");
        }else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici....");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu....");
        }else {
            System.out.println("Gecerli bir gun ismi giriniz.");
        }

        // 2.Yol :
        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                 gun.equalsIgnoreCase("Sali") ||
                 gun.equalsIgnoreCase("Carsamba") ||
                 gun.equalsIgnoreCase("Persembe") ||
                 gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //3.Yol :

        // gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi"); bu islem bana boolean verecek cunku || (or) operatoru hep boolean verir.
        // veya isleminin sonucu her zaman boolean olacak o yuzden boolena bir varioable oilusturup icine yaziyoruz
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci =  gun.equalsIgnoreCase("Pazartesi") ||
                            gun.equalsIgnoreCase("Sali") ||
                            gun.equalsIgnoreCase("Carsamba") ||
                            gun.equalsIgnoreCase("Persembe") ||
                            gun.equalsIgnoreCase("Cuma");

        if(haftaSonu){
            System.out.println("Hafta sonu...");
        }else if(haftaIci){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }























    }
}
