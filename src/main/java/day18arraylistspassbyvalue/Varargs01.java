package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
         1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.
         2) "Varags" arka tarafta Array kullanir bu yuzden varargs'larla calisirken Array'lerle calisiyormus gibi davranbilirsiniz.
         3) Varargs olusturmak  icin "<data tipi>...   <Varags ismi>" veya "<data tipi>   ...<Varags ismi>"
         4) Bir method'da "Varargs"in yaninda baska bir parametre kullanilabilir mi? Varargslarla beraber baska parametre varargs en sonda olmak sarrtiyla kullanilir.
         5) Bir method'da birden fazla varargs kullanilabilir mi? Varargs en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az biri en sonda olmayacaktir. Bu da 4.kural ile celisir
            Yani ilk varargs kodun sonunda olmadigi icin ulasilamaz kod olur ve ulasilamaz kodlar her zaman hata verir.

     */

    public static void main(String[] args) {

        int r1 = add(2,3);
        System.out.println(r1); //5

        int r2 = add(2,3,4);
        System.out.println(r2); //9

        int r3 = add(2,3,4,5,6,7,8,9);
        System.out.println(r3); //44

    }


    // iki sayinin toplamini return eden bir method olusturunuz.

//    public static int toplamaYap (int a, int b){
//       return a+b;
//    }
//
//    // uc sayinin toplamini veren methodu yaziniz.
//    public static int add(int a, int b, int c){
//        return a+b+c;
//    }
//
//    // 4 sayinin toplamini veren methodu yaziniz.
//    public static  int add(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    // Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim.
    public  static int add(int... a){  // data tipinden sonra uc nokta koyup isim verdigimiz yerin(int... a) adi varargs'tir. dipsiz kuyu gibidir. icine ne atarsan kabul eder.
        int sum=0;
        for (int w : a){
            sum = sum+w;
        }
        return sum;
    }





}
