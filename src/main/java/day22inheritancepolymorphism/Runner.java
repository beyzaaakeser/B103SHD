package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {


        // obje
        Cat cat1 = new Cat();
        System.out.println(cat1.a);  // 14 bu a'yi secerken java cat'tekine gider. data tipine bakarak variableyi secer
        System.out.println(cat1.b);  // 34 hey java cat1 objesini kullanarak b'yi bul diyoruz. Eger classin kendisinde o variable yoksa parent'dakini kullanir.
        System.out.println(cat1.c);  // 45 babada yok dedeye gidecek. ondaki kodu kullanacak ve yazdiracak

        // obje
        Mammal cat2 = new Cat();
        System.out.println(cat2.a); // 13 data tipine bakarak a'ya ulasti. burdaki data tipi mammal ordaki a da 13

        //obje
        Animal cat3 = new Cat();
        System.out.println(cat3.a); // 12 data tipine bakarak a'ya ulasti. burdaki data tipi animal ordaki a da 12


        // Inheritance'da variableler secilirken Java objenin data tipine bakar. Oncelikle istediginiz variable'i objenin
        // data tipi olan Class'ta arar. O Class'ta bulamazsa Parent Class'lara bakar hicbir Parent Class'ta bulamazsa hata verir.

        // Obje olustururken objectin data tipi Child Classlardan secilemez.

        // Inheritance'da method'lar secilirken Java Constructor'a bakar.
        // Oncelikle istediginiz methodu Constructori kullanilan Class'tan alir.
        // O Class' da bulamazsa Parent Classlara bakar.
        // Hicbir yerde o method'u bulamazsa hata verir.

        // obje
        Cat cat4 = new Cat();


        cat4.eat();  //  Cat eat
        cat4.drink(); // Mammal drink

        // obje
        Mammal cat5 = new Mammal();
        cat5.eat(); // Mammal eat

        //obje
        Animal cat6 = new Animal();
        cat6.eat(); // Animal eat








































    }
}
