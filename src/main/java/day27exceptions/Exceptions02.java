package day27exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
        1) FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
           "new" den sonraki "FileInputStream" hata verir. Cunku biz javaya verilen adresteki dosya'ya git dedik.
           Java iki endiseye kapildi i) ya adres yanlissa ii) ya verilen adresde dosya yoksa
           Biz method isminden sonra "throws FileNotFoundException" yazarak javaya bu iki endise duydugun durum olusursa
           "Exception At" dedik.

        2) while((k= fis.read()) != -1){} yazdigimizda read methodu hata verir. Cunku biz Java'ya dosyadaki karakterleri oku dedik.
           Java bir endiseye kapildi ya okumasi gerekrn karakterler Java'nin bilmedigi karakterlerse
           Biz method isminden sonra "throws IOException" yazarak, bu durumla karsilastiginda "Exception At" dedik.

        3) Method isminden sonra "throws IOException" yazarsaniz "throws FileNotFoundException"'i siler. Cunku "IOException", "FileNotFoundException"'i kapsar.
           "IOException", "FileNotFoundException"in parent'idir, onun yaptigi her seyi yapabilir o yuzden "IOException" varken "FileNotFoundException"a gerek yoktur.

           "IOException" ==> "Input Output Exception" demektir.

        4) Gordugunuz gini "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
           Bu tarz Exception'lar "Compile Time Exception" denir. Diger adlari "Checked Exception"dir.

           "Compile Time Exception" kesinlikle halledilmelidir(Exception Handling), Halletmeden kod yazmaya devam etmeyiniz.

     */


    // IOException, FileNotFound'in Parent'idir.



    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();
        System.out.println();
        readTheText();

    }// main





    // Bir text file'daki text'i okuyan kodu yaziniz
    // 1.YOL :
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k = 0;
        while((k= fis.read()) != -1){  // read methodu okunacak baska bir karakter kalmadiginda -1 verir.
            System.out.print((char) k);
        }//loop


    }// 1.method



    //2.YOL :
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

            int k = 0;
            while((k= fis.read()) != -1){  // read methodu okunacak baska bir karakter kalmadiginda -1 verir.
                System.out.print((char) k);
            }//loop

        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }


    }// 2.method






}//class
