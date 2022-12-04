package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
            Method overloading nasil yapilir?
            1) Method isimleri qayni olmalidir.
            2) Methodparametreleri farekli olmalidir.
               i) Parametre sayilari degisebilir
               ii) Parametrelerin data tiplerini degistirebilirsiniz.
               iii) Parametrelerin yerlerini degistirebilirsiniz. Ancak data tipleri farkli ise.
            3) Method ismi+ Parrametreler = Method Signature
               Method Signature disinda ne degisitirirseniz degistirin java o methodlari farkli kabul etmez.

     */




    public static void main(String[] args) {

        add(3,5); // 1.method kullanir data tipleri uydugu icin
        add(3,5.0);// 3.method kullanir  data tipleri uydugu icin
        // add(3.0,4.0); // uygun method olmadigi icin hata verir...


    }

    public static  void add(int a, int b){
        System.out.println(a+b);
    }
    public static  void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static  void add(int a, double b){
        System.out.println(a+b);
    }
    public static  void add(double a, int b){
        System.out.println(a+b);
    }

    // java parametrelere bakiyor ona gore islem yapiyor. o yuzden hata vermiyor. java tam uyum saglayanla islem yapar


}
