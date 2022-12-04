package day07ternarystringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {


        /*
                                            String Class Methodlari
                1) equals() :           i) Iki String'in ayni olup olmadigini anlamamiza yariyor
                                        ii) equals() methodu "boolean" return eder

                2) equalsIgnoreCase() : i) Iki tane stringin ayni olup olmadigini buyuk harf, kucuk harfe dikkat etmeden anlamamiza yarar.
                                        ii) equalsIgnoreCase() methodu "boolean" return eder.

                3) toLowerCase() :      i) Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                        ii) toLowerCase() methodu "String return eder.

                4) toUpperCase() :      i) Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir
                                        ii) toUpperCase() methodu "String" return eder.

                5) charAt() :           i) Bir Strin'den belli bir index'deki characteri almak icin kullanilir.
                                        ii) charAt() methodu "char" return eder.\

                6) length() :           i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir.
                                        ii) length() methodu "int" return edeer.

                7) contains() :         i) Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir.
                                        ii) contains() methodu "boolean" return eder.

                8) split() :            i) Bir String'i istedigimiz characterden parcalamaya yarar.
                                        ii) split() methodu "Array" return eder.

         */



        /*
                Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                i) En az 8 karakter icermeli
                ii) space karakteri icermemeli
                iii) Ilk harfi "M" veya "m" olmali
                iiii) Son karakteri "?" olmali
         */


        String pwd = "manisa12?";

        //i) En az 8 karakter icermeli   //once   pwd.length()>7; yaptik sonra onu boolean icine koyduk.
        boolean first = pwd.length()>7; // true verecek 9>7 9==> Manisa12? den geliyor. length oyle yapiyordu ya hani

        //ii) space karakteri icermemeli once icerir yapip sonra en basa ! ekleyerek icermez dedik sonra boolean icine koyduk
        boolean second = !pwd.contains(" ");

        // iii) Ilk harfi "M" veya "m" olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //iiii) Son karakteri "?" olmali // son indexi bulmak icin harf sayisinin -1 i oluyordu ya. java 4 harfli ama indexi 0123 oluyor son indexi 3 oluyor. yani son index uzunluktan hep 1 eksik oluyor.
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);





    }
}
