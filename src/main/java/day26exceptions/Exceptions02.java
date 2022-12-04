package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java",2);
        System.out.println(ch1);// v

        char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2); // Exception ==> StringIndexOutOfBoundsException ==> String'in araliginin disinda diyor.
                                 // Eger bir Strngden bir karakter veya karakterler alirken olmayan bir index kullanilirsa StringIndexOutOfBoundsException alinir









    } // main

    public static char getCharFromString(String str, int idx){

        char c = ' ';

        try{
            c= str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili bir problem olustu.");

            System.out.println(e.getMessage()); // javanin tekjnik mesaji kisa bir cumle ile ==> Index 8 out of bounds for length 8

            // en guzel kullanim System.out.println("Index ile ilgili bir problem olustu." + e.getMessage());

            e.printStackTrace(); // Javanin detayli hata mesaji hangi pacakgede hangi classta hangi satirda hata oldugunu veren kod budur.
                                 // Detayli "log" icin. log : akisi takip etmek demek.
        }
            return c;


    } // method







} // class
