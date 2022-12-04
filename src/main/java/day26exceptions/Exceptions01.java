package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result+5); //128

        String st = "1a2b";
        int r = convertStringToInteger(st); //NumberFormatException  ==> sayi formati hatali diyor.
                                            // Eger icinde rakamdan farkli karakter barindiran bir String'i valuOf() methodu kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.
        System.out.println(r+10); // i ye 0 verdik 0+10 = 10 oldu. burdan geldi


    }// main


    public static int convertStringToInteger(String str){

        int i = 0;

        try{
            // Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz.
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");

        }catch (NumberFormatException e){

            System.out.println("Rakam olmayan karakterler iceren String'ler Integer'a cevrilemez");

        }
        return i;



    }// method








}// class
