package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println(names);


        List<String> cities = new ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);  // removeAll () methodu kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names); // [Thomas, Tahsin]
        System.out.println(cities); // [Trump, Tom, Taceddin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        names.containsAll(myNames);  // bu listin icinde ikisi birden varsa true verecek herhangi biri yoksa false verrecek yani thomas +tahsin == true
        boolean sonuc1 = names.containsAll(myNames);  // Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        // Hepsi varsa true, en az biri yoksa false verir.

        System.out.println(sonuc1);


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // Example 1 : "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz.
        a.remove("Shoes");  // remove methodu sadece ilk gorunumunu siler. ama butun gorunumlerini silmek istersen removeAll methodunu kullanmak zorundasin.
        System.out.println(a);  // [TV, Radio, Laptop, Shoes, Book, Shoes]  en bastaki shoes'u sildi digerleri duruyor. remove methodu ilk gorunumu sildi.

        // Example 2 : "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz.
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler); // removeAll kullanmak icin yeni bir liste ihtiyac var. yeni list olmadan bu method kullanilamaz.
        System.out.println(a); // [TV, Radio, Laptop, Book]


        // Example 3 : Bir tane salary listi olusturun. eger salary 10000den az ise %20, 10000 bin ve 10000den cok ise %10 zam yapiniz.

        List<Double> salary = new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary); // [12345.0, 8674.5, 15000.75, 9500.0, 20500.0]
        for (Double w : salary) {

            if (w < 10000) {

                salary.set(salary.indexOf(w), w * 1.2);

            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }


        }
        System.out.println(salary); // [13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

        // Example 4 : Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz. IKI YOLU VAR

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        // Iki ArrayListin esit olabilmesi icin 2 sartimiz var: elemanlar esit olmali ve ayni elemanlar ayni indexte olmalilar.


        // 1.YOL :

        int counter = 0;  // flag

        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir.");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir.");
                break;
               }
            }
            if (counter == 0) {
                System.out.println("Listler esittir");
            }


        // 2.YOL :
        boolean esitmi= m.equals(n);

            if(esitmi){
                System.out.println("Listler esittir");
            }else {
                System.out.println("Listler esit degildir");
            }
























































        }




























































    }



