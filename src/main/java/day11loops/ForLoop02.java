package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        // Example 1 : Bir Stringdeki "m" karakterleri haric tum karakterleri yazdiriniz.
        // Andromeda  ==> Androeda

        String str= "madam";


        // 1.YOL :
        for (int i = 0; i<str.length();  i++){

            char c= str.charAt(i);

            if (c!= 'm'){
                System.out.print(c);
            }

        }


        // 2.YOL :

        for (int i = 0; i<str.length(); i++){

            char c = str.charAt(i);

            if (c=='m'){
                continue; // bosveer demek javada :)  continue oldugu zaman deveamindaki kodlar calismaz sizi direkt artirma azaltma kismina goturur
                          // looplarda kullanilir. sizi artirma azaltma bolumune alir.
                          // loopun icinde bazi degerler icin Loopun calismamasini isterseniz "continue" kullaniniz.

            }
            System.out.println(c);
        }


        // Example 2 : 1'den 100e kadar 6 ile bolunenler haric tum tam sayilari ekrana yazdiriniz.

        for (int i = 0 ; i<101 ; i++){

            if (i%6==0){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();

        // Example 3 : Size verilen bir Stringdeki 'm'den onceki karakterleri yazdiriniz

        String s = "Luxemburg";  // Luxe

        for (int i = 0; i<s.length() ; i++){

            char c = s.charAt(i);

            if (c=='m'){
                break; // eger karakter m ye esitse loopu kir. break calisinca sizi alir loopun disina atar.
            }
            System.out.print(c);
        }















































    }
}
