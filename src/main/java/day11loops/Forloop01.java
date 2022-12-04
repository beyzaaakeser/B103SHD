package day11loops;

public class Forloop01 {
    public static void main(String[] args) {


        // Example 1: 3den 6ya kadar tam sayilarinin toplamini bulan kodu yaziniz

        int sum = 0;

        for (int i = 3; i<7; i++ ){

            sum = sum+i;
            //System.out.println( sum = sum+i);eger her adimdaki sonucu gormek istersen sout'u loopun icine koy.
            // eger sadece son degeri gormek istersen loopin disina koy. genelde loopun disinda kullanilir.
        }

        // note: sout loopun disina yazilirsa  sum'in sadece son degerini ekrana yazdirir.
        // loopun icine yazilirsa her bir loop icin sum'in hangfi dfegerleri aldigini yazdirir.
        System.out.println(sum);//18


        // Example 2 : 6dan 3e kadar tamsayilarin carpimini bulan kodu yaziniz.

        int multiply =1; // 1 koyduk cunku carpida 1 etkisiz elemandir. 0 koysak her seyin sonucu 0 olur.

        for (int i =6; i>2 ;i--){
            multiply =multiply*i;
        }
        System.out.println(multiply);


        // Example 3 : Size verilen bir tam sayinin rakamlari toplamini bulunuz

        int num =385;
        num = Math.abs(num);
        int sonuc =0;

        for (int i = num ; i>0 ; i = i/10 ){
                sonuc = sonuc+i%10;
            // javada tam sayiyi tam sayiya bolersen sonuc tam sayi olur. eger sonuc virgullu sayi ise java ondalikli kismi siler. java yuvarlama islemi yapmaz.
            // !!!!javada son rakamin kac oldugunu anlamak icin her zaman %10 yap!!!!
        }
        System.out.println(sonuc);



        // Example 4 : Size verilen bir Stringi ters ceviren kodu yaziniz.  !!!!!!! Interview sorusu !!!!!!!
        //             "Kaba"  ==> "abaK"


        String str = "Kaba";

        // Concatenation yapacaksaniz bos String kullanin.

        String ters = "";

        for (int i = str.length()-1 ;i>=0 ; i--){
            char c =str.charAt(i);

            ters = ters +c;
        }

        System.out.println(ters);























































    }
}
