package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Example 1: Javadan aldiginiz date'i "ay/gun/yil" olarak yaziniz

        LocalDate currentDate = LocalDate.now(); // date ve timein formatini degistirmek icin java bir class olusturmus.
                                                 // ismine de DateTimeFormatter demis.

        System.out.println(currentDate); // 2022-10-21
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  // slash yerine istedigin her seyi koyabilirsin java kabul eder.
        String formatteDate1 = dtf1.format(currentDate);
        System.out.println(formatteDate1); // 10/21/2022


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatteDate2 = dtf2.format(currentDate);
        System.out.println(formatteDate2); // Oct/21/2022


        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatteDate3 = dtf3.format(currentDate);
        System.out.println(formatteDate3); // October/21/2022


        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");// "MM" 10dan kucuk aylari 01, 02, 03 seklinde yazar.  "M" ise 10dan kucuk aylari 1,2,3 diye yazar
        String formatteDate4 = dtf4.format(currentDate);
        System.out.println(formatteDate4); // 10/21/2022


        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formatteDate5 = dtf5.format(currentDate);
        System.out.println(formatteDate5); // 10/21/22


        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy"); // "d" 10dan kucuk gunleri 1,2,3 gibi yazar "dd" ise 01,02,03 gibi yazar.
        String formatteDate6 = dtf6.format(currentDate);
        System.out.println(formatteDate6); // 10/21/22



        // Example 2: Javadan aldiginiz time'in formatini degistiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);// 16:23:54.000002345


        DateTimeFormatter dtf7= DateTimeFormatter.ofPattern("hh:mm"); // : yerine ne koyarsan onu gosterir.
                                                                      // format methodu bize string verir o yuzden stringe atiyoruz.
        String formattedMyTime = dtf7.format(myTime);
        System.out.println(formattedMyTime); // 04:23 der
        // buyuk HH 24 saat sistemini hh ise 12 saat sistemini kullanir o yuzden 04.23 gorduk.


        DateTimeFormatter dtf8= DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2= dtf8.format(myTime);
        System.out.println(formattedMyTime2); // 04.23 PM























































    }
}
