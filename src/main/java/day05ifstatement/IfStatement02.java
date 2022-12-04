package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 1 : Kullanici gun numarasini girsin kod gun ismini yazsin. gunler pazardan baslayacack

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz...");

        byte gunNo = input.nextByte();


        if(gunNo==1){
            System.out.println("Pazar");
        }else if(gunNo ==2){
            System.out.println("Pazartesi");
        }else if(gunNo ==3){
            System.out.println("Sali");
        }else if(gunNo ==4){
            System.out.println("Carsamba");
        }else if(gunNo ==5){
            System.out.println("Persembe");
        }else if(gunNo ==6){
            System.out.println("Cuma");
        }else if(gunNo ==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gun numarasi giriniz...Gecerli gun numaralari 1,2,3,4,5,6,7den birisidir");
        }

        //kodlarda kullanilan degerler kritik degerlerdir. bunlar kesinlikle test edilmelidir.
        // bu kritik degerlerden buyuk veya kucuk herhangi degerler test edilmelidir. ve app kullaniciya bu degerler hakkinda bir sey soylemelidir. eger soylemezse kullanici donuyor ya da appde hata var der.

























    }































}
