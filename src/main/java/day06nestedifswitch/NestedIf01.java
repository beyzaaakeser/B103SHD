package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        /*
            Password'un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
            Password'un ilk harfi kucuk harf ise
                'z' olursa gecerli password aksi halde gecersiz password
         */

        // Nested ic ice gecmis demek

        String pwd = "5xy12!"; //  gecerli bir pwd cunku ilk harfi buyuk ve A

        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){

            if (ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
        }else if (ilkHarf>='a'&& ilkHarf<='z'){

            if (ilkHarf== 'z'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }


        }else {
            System.out.println("Ilk karakter harf olmalidir");
        }

        // Note : Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir. bu yuzden mumkunse "nested" kod yazmamaya calisiriz.











    }
}
