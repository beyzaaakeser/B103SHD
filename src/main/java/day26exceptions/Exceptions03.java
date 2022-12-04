package day26exceptions;

public class Exceptions03 {


    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d);//41.0
        divideStringByTheNumOfTheChar(null); // NullPointerException






    }// main

    //String'deki karakter sayisini bulunuz, Stringi integer'a ceviriniz. sonra da integer'i character sayisina bolunuz
    public static double divideStringByTheNumOfTheChar(String str){

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try{

            length = str.length(); // NullPointerException: "null" String ile length method kullanildiginda alinir.

            i = Integer.valueOf(str); // NumberFormatException : icinde rakamdan farkli karakter olan String'ler valueOf() ile kullanildiginda alinir.

            sonuc = i/length; // ArithmeticException: Bolen sayi sifir oldugunda alinir.
        }catch (NullPointerException e){
            System.out.println("==>"+e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }// 1.method


    public static double divideStringByTheNumOfTheCharacter(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {

            length = str.length(); // NullPointerException: "null" String ile length method kullanildiginda alinir.

            i = Integer.valueOf(str); // NumberFormatException : icinde rakamdan farkli karakter olan String'ler valueOf() ile kullanildiginda alinir.

            sonuc = i / length; // ArithmeticException: Bolen sayi sifir oldugunda alinir.
        } catch (Exception e) {
            System.out.println("-->"+e.getMessage());
        }
            return sonuc;



    }// 2.method


    public static double divideStringByTheNumOfTheCharacters(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {

            length = str.length(); // NullPointerException: "null" String ile length method kullanildiginda alinir.

            i = Integer.valueOf(str); // NumberFormatException : icinde rakamdan farkli karakter olan String'ler valueOf() ile kullanildiginda alinir.

            sonuc = i / length; // ArithmeticException: Bolen sayi sifir oldugunda alinir.
        }catch (NullPointerException e){
            System.out.println("NullPointerException'a ozel.");
        }catch (Exception e) {
            System.out.println("Diger tum Exception'lar icin");
        }

        return sonuc;

    }// 3.method

    /*
        Note: 1) Aralarinda Parent Child Relationship olan Exception Class;lari multiple catch'lerde kullanmak isterseniz Child olan once kullanilmalidir, aksi takdirde hata verir.
              2) Aralarinda Parent Child Relationship olmayan Exception Class'lari multiple catchlerde kullanmak isterseniz siralamanin bir onemi yoktur.
     */




 }// class
