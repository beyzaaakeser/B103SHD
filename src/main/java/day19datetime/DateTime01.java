package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        // Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 2022-10-21 Bu sizin lokal bilgisayarinizdaki tarihi alir.

        // Example 2: "Anlik Zamani"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // 20:41:13.420548600

        // // Example 2: "Anlik tarihi"(Current Date) ve "Anlik Zamani"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // 2022-10-21T20:44:35.493167300  ==> Aradaki T harfi date bitti time basliyor demek


        // Example 4 : Japonya'daki anlik tarihi ve anlik zamani ekrana yazdiriniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);


        // Example 5 : Istanbul'daki anlik tarihi ve anlik zamani ekrana yazdiriniz.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Asia/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);


        // Example 6 : Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022,10,21); // bu bana spesifik bir tarih verecek
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate); // 2024-12-18


        // Example 7 : Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        // between methodu kullanildiginda daha eski olan tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff); //2824

        // Example 8 : Istanbul'un Fethi ile Cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //             29 Mayis 1453    ==>  29 Ekim 1923

        LocalDate fetih = LocalDate.of(1453,5,29);
        LocalDate cumhuriyet = LocalDate.of(1923,10,29);
        Long aySayisi =ChronoUnit.MONTHS.between(fetih,cumhuriyet);
        System.out.println(aySayisi); // 5645

        // Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1989,5,13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        System.out.println(day+" "+ month);


        // 1.YOL :
        if (day>=21 && month == 3 ){
            System.out.println("koc");
        } else if (day<=20 && month ==4) {
            System.out.println("koc");
        } else if (day>=21 && month==4) {
            System.out.println("Boga");
        } else if (day<=20 && month==5) {
            System.out.println("Boga");
        }



        // 2.YOL :

        if ((day>=21 && month==3) || (day<=20 && month ==4)){
            System.out.println("Koc");
        } else if ((day>=21 && month==4)|| (day<=20 && month==5)) {
            System.out.println("Boga");
        }
































































    }
}
