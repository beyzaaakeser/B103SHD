package day26exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        int age = 250;

        try {
            printAge(age);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }// main


    // Yas'i ekrana yazdiran bir method olusturunuz.
    public static void printAge(int age){

        if (age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif veya 200'den buyuk olamaz");
        }
        System.out.println(age);
    }


    // Methodun icinde Exception uretme hangi senaryolarda kullanilir?
    // 1) App'in mimarlari kural olustururlar.O kurallari buraya exceptionlarla koyuyorlar
    // 2) Gunluk hayatta yasak ama java icin yasak olmayan seyler vardir. mesela java icin yas negatif pozitif ve sifir olabilir.
    //    ama gunluk hayattaki kural yasin negatif olmamasidir. bu tarz sizin kuraliniz olup javada yasak olmayan seyler oldugunda method icinde exception atmamiz gerekir.










}// class
