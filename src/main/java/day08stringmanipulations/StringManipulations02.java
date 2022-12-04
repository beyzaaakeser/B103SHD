package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1: Bir Stringdeki space haric kac tane karakter kullanildigini gostreren kodu yaziniz.
        //           "Ali okula gitti."  ==> 14 karakter var noktalama isaretleri de sayiliyor ama space sayilmayacak.

        String str = "Ali okula gitti.";

        // replace() methodu : Bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ","").length();

        System.out.println(num);

        // Example 2 : Bir Stringdeki tum 'a' harflerini 'A' ya ceviriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";

        String a = s.replace("a","A");
        System.out.println(a);

        // Example 3 : Bir Stringdeki tum "kara" kelimesinin yerine "*" koyunuz

        String t = "Kara kara dusunme Ankara";

        String yeniT = t.replace("kara","*");
        System.out.println(yeniT);//Kara * dusunme An* // yani karakterlere buyuk harf kucuk harf olarak uyumlu olmasi gerekir ve karakterler mustakil olmak zorunda deguil kelime icinde olsa da degisterecek

        //Example 4 : Bir String'deki tum sayilari "*" ceviriniz.
        //            "AC202117004" ==> AC*******
        String satdId = "AC202117004";
        String yeniStdId = satdId.replaceAll("[0-9]","*");
        System.out.println(yeniStdId);// AC*********

        /*
              Bir grup data'yi ifade eden kod'lara "Regex" denir.
              "Regex" Regular Expressions'in kisaltilmis halidir.

              1) Tum rakamlar ==> [0-9]
              2) Tum kucuk harfler ==> [a-z]
              3) Tum buyuk harfler ==> [A-Z]
              4) Tum harfler ==> [a-zA-Z]
              5) Sesli harfler ==> [aeiouAEIOU]
              6) Space ==> [ ]
              7) Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
              8) Tum noktalama isaretleri ==> \\p{Punct}  ==> google a noktalama isaretleri icin regex dersek cikar.

              1) Rakamlar haric tum karkaterler ==> [^0-9]
              2) Kucuk harfler haric tum karakterler ==>[^a-z]
              3) Buyuk harfler haric tum karakterler ==> [^A-Z]
              4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
              5) Space haric ==> [^ ]// space gorunmuyor ama var


         */


            //Example 5: Verileen bir String de kullanilan noktalama isareti ve rakamlar ve space kararkteri haric
            // tum karakterlerin sayisini bulan kodu yaziniz.

            String u = "Ali 13 yasinda, dersem inanma!...";

           int sonuc = u.
                         replaceAll("[0-9]",""). // Ali yasinda,dersem inanma!...
                         replaceAll(" ",""). // Aliyasinda,derseminanma!...
                         replaceAll("\\p{Punct}",""). // Aliyasindaderseminanma
                         length();//Aliyasindaderseminanma ==> 22 karakter icerir 22 yazacak

           System.out.println(sonuc);



           //Example 6: Bir pwd'nin gecerli olup olmadigini asagidaki kurallara gore test eden kodu yazininz.
          //            i) Space haric enn az 8 karakter olmali
          //            ii) En az bir sembol icermeli
          //             iii) En az bir rakam icermeli
          //             iv) En az bir buyuk harf icermeli
          //             v) En az bir kucuk harf icermeli


        String pwd = "B78c? K!m";

        // i) Space haric enn az 8 karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        // ii) En az bir sembol icermeli ==> sembol icermeli demek icinde rakamlar buyuk harf kucuk harf ve space disindakiler demek
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        // iii) En az bir rakam icermeli//rakamlar disindakileri sil
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        // iv) En az bir buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        // v) En az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second&& third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz Gecerlidir...");
        }else {
            System.out.println("Password'unuz Gecerli Degildir...");
        }



        //Example 7 : Bir Stringdeki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();

        System.out.println(number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdiriniz.
        //           Aksi halde "Normal" yazdirin.

        String v = "kAlex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result =  baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);


















    }
}
