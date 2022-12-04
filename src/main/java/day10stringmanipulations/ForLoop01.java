package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

       // Example 1 : Ekrana bes kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        // Tekrarli isler icin "loop" kullaniriz.
        // 4 cesit "loop" vardir.  ==>  1) for-loop   2) while-loop    3) do-while-loop   4) for-each-loop


        //1) for-loop
        // Example 2 : Ekrana 5 kere Hi yazdiriniz



        //    baslangic degeri    loop hangi sart altinda calisacak onu yazacagiz     Increment (artirma) veya DEcrement (azaltma)
        for ( int i = 1       ;                     i<8;  i = i+1                                    ){

            System.out.println("Hi");
        }


        // Example 3 : 4den 7ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz.

        for(int i = 4 ;  i<8 ; i=i+1){
            System.out.print(i+ " ");
        }

        /*
         Increment :
         1.YOL:  int i =12;  i = i+3 yaparsin. yani i'ye 3 ekle i'nin icine koy atama yapar. ama bunda i tekrar ediyor java tekrar sevmez,
         2.YOL:              i+= 3 dersin  ayni sonucu verir ve i tekrar etmedigi icin kullanmak daha iyidir
         3.YOL:              i++  demek  ==>  sadece 1 artirmak demektir. sadece 1 artirirken bunu kullaniriz.

         increment diyince ssadec toplama akla gelmesin carpoma da olur.
         i = i*3
         i*= 3


         Decrement:
         int k = 15;
         1.YOL:  k = k-7
         2.YOL:  k-= 7
         3.YOL: k--   demek ==>  sadece 1 eksiltirken azaltirken bu kullanilir.

         bolmede de kullanilir
         k = k/3
         k/=3

         */

        System.out.println();// bi ustteki soruyla yan yana yazdirmqasin diye bos sout koyduk


        //Example 4 : 14ten 5 e kadar yazdir

        for(int i = 14 ; i>4; i-=1){
            System.out.print(i+ " ");
        }
        System.out.println();
        //Example 5 : 14den 5e kadar tum cift sayilari yazdiriniz


        //1.YOL:
        for (int i =14 ; i>4  ; i-=2 ){
            System.out.print(i+ " ");
        }

        System.out.println();

        //2.YOL:
        for (int i = 14; i>4 ; i--){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();

        //Example 6 : 28den 157 ye kadar tum tek tam sayilari yazdir

        for (int i=28; i<158 ; i++ ){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();

        //Example 7 : "Java" Stringini J*a*v*a Stringine ceviren kodu yaziniz. ==> harfi al yildiz koy yaptigin icin tekrarli islem loop kullanilir.
        String str = "Java";

        for (int i =0 ; i<str.length() ; i++ ){
            System.out.print(str.charAt(i)+ "*");
        }

        System.out.println();


        //Example 8 : Size verilen Stringi'de tekrarsiz karakterleri ekrana yazdiriniz
        // "Hellooo Ali"   heAi tekrarsiz

        String s = "Hellooo Ali";

        for ( int i = 0; i<s.length() ; i++){

            char c = s.charAt(i);

            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }





































    }
}
