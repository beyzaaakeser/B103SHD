package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
         Not : char variableleri matematiksel islemlerde kullanirsaniz java onlarin ascii degerlerini kullanir.
         ornegin: System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
         Not : Java'da + sembolunun iki anlami vardir 1) toplama islemi  2 ) birlestirme islemi
         Java +  sembolu gorunce once toplama islemi yapmaya calisir, yapamazsa birlestirme islemi(Concatenation) yapmaya calisir, o da olmazsa hata verir.

     */


    public static void main(String[] args) {

        //Example 1 : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy ismionin harflerini ekrana yazdiriniz. Ali Can ==> AC

        Scanner input = new Scanner(System.in);


        // 1.Yol :
//        System.out.println("Ilk isminizi giriniz");
//        char ilk = input.next().charAt(0); // java string'lerde her birt kareaktere index verir. index demek 0 dan baslayio birer birer artmak demek. o yuzden char at methodu koyariz ve parantez icine o koyariz. 0 demek ilk karakter demek cunku
//
//        System.out.println("Soy isminizi giriniz");
//        char son = input.next().charAt(0);
//
//        System.out.println(""+ ilk + son); // eger charlarin arasina matematiksel islem yaparsan ascii degerlerini kullanir. matematik olarak kullanmasini istemiyorsan bi string ekleyeceksin. string ile chari birlestirdiginde sonuc string olur char olmaz. Stringlerle toplama yapilamaz ve stringten sonra toplama isareti koydugunda birlestirme yapar


        // 2.Yol :
        System.out.println("Tam isminizi giriniz");
        String tamIsim = input.nextLine();// Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);





















    }


































}
