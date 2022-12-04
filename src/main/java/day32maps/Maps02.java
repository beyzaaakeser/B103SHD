package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {


    public static void main(String[] args) {

        // Size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz.
        // abbcaa ==> a=3, b =2 , c=1

        String kelime = "abbcaa";
        HashMap<String,Integer> gorunum = new HashMap<>(); // {} bos map'in olacak loopla eklenecek

        String []harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler)); // [a, b, b, c, a, a]


        for (String w: harfler){

            Integer gorunumSayisi = gorunum.get(w); // Map'in valuesu Integer oldugu icin burada da Integer
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum); // {a=3, b=2, c=1} ayri ayri aartma sirasini yazmaz. yani a=1 ,a=2, a= 3 gibi yazmaz. cunku mapde overwrite yapar son degerini gosterir













    }
}
