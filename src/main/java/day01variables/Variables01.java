package day01variables;

public class Variables01 {

    // Variable nasil olusturulur?
    // 1)Access Modifier  2)Data Type  3)Variable Ismi  4) =  5) Deger  6);
    // Javada ";" Ingilizcedeki "." gibidir.
    // Ingilizcede "cumle" deriz, Javada "statement" deriz
    // "=" sembolunun ismi Assigment Operator demektir.
    // Assigment Operator sagdaki degeri alir soldak variablenin icine koyar.
    //
    public int age = 13;

    public int height = 183;

                                    //Javada Data Typelar

    /*

        `                           Primitive Data Types
        1) int : Integerin kisaltilmasi demektir. Tam sayi demektir.32 bit kullanir
                 Matematikte tam sayilarin basi ve sonu yoktur. fakat javada tam sayilarin basi ve sonu vardir.
                 en kucuk int = -2.147.483.648 tir
                 en buyuk int =  2.147.483.647 dir.

        2) byte: Tamsayilar icin kullanilir.8 bit kullanir
                En kucuk byte = -126
                en buyuk byte =  127

        3) short: tam sayilar icin.16 bit kullanir
                  en kucuk short = -32768
                  en buyuk short = 32767

        4) long: Tam sayilar icin. intin yetmedigi yerlerde kullanilir.memoryde 64 bit kullanir.

        5) float: Ondalikli sayilar icindir. memoryde 32 bit yer kaplar
                  virgulden sonra 7 basamak icerebilir.
                  float degerlerinde sona "f" veya "F" koyman gerekir

        6) double :Ondalikli sayilar icindir. memoryde 64 bit yer kaplar
                   virgulden sonra 16 basamak icerebilir.

        7) boolean: true veya false degerleri icin kullanilir. Memoryde 1 bit kullanir

        8) char: Tek karakterler iciun kullanilir. Memoryde 16 bit kullanir
                 A, c ,2 , ? , _, =

           NOT! Charlara deger verirken degeri tek tirnak arasina koyunuz yoksa hata verir. 'S' gibi

           NOT! byte< short < int < long < float < double (Numeric Data Types )
                boolean ve char (Numeric olmayan data types )

                                        Non-Primitive Data Types
        String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
                String degerleri mutlaka "" arasina konulmalidir yoksa hata verir.
                String non - primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

                            Primitive/ Non- Primitive Data Typelarin farklari nelerdir?
1        1) Non-Primitive data typlerinde degerin yaninda methodlar vardir.
            primitive data typlelerinde ise sadece deger vardir, method yoktur.
         2) Primitive data typleri java tarafindan olusturulmustur toplam 8 tanedir. biz primitive data
            typlari olusturamayiz.
            Non-Primitive data typelari java tarafindan da olusturulmustur, biz de olusturabiliriz.
            Non- Primitiveler sayilamaycak kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
            Class olusturmak bir non-primitive datadir.
            Classlar ayni zamanda Non-Primitivdir. cunku classlar degerin yaninda method da icerir  .
            classlar buyuk harfle baslar. non primitivlerin buyuk harfle baslamasiunin bir sebebi de budur.
         3) Primitive data typeleri isimlendirilirken kucuk harflerle isimlendirilirler. kucuk harflerle baslar.
            Non-Primitive data typleri buyuk harfle baslar.
         4) Primitive data typlelar memoryde farkli buyuklukte yer kullanir.
            Non-Primitive data typelerin hepsi memoryde ayni buyuklukte yeer kullanir.
     */


        public byte price = 12;
        public short populationOfVillage = 23000;

        public float priceOfShirt = 13.99f;
        public double weightOfCell = 0.000012345;

       // long demenize ragmen verilen sayiyi int kabul eder.
       // Bu yuzden long bir variablea intlerin int araliginin disinde bir sayi verirseniz mutlaka sonuna "L"veya "l" koyunuz.
        public long populationOfWorld = 7000000000L;

       // burada l koymadigimiz halde problem yok cunku 1234 int araligina uyar.
        public long x = 1234;

        public boolean isOld = true;
        public boolean isRich = false;

        public char initial = 'S';

        public String name = "Tom Hanks";


       //note: "main method" arabnin motoru gibidir.
                // main method calismadan hicbir sey calismaz.

        public static void main(String[] args) {











        }





}
