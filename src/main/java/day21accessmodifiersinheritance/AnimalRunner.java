package day21accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {

            // Javada butun classlarin babasi olan bir class var ==> object class
            // Animal extends Objecttir aslinda ama bunu yazmayiz. cunku javda varligi kesin olan seyleri yazmayiz.
            // hashcode gibi diger kodlar bu object classtan geliyor.
            // Bir method private ise inherit edilemez.
            // Java Multiple inheritance'i desteklemez. (doesn't support) yani javada multiple inheritance kullanamazsiniz.


        /*

            1) "Inheritance" sayesinde
                i) kod tekrarlaridnan kurtuluruz.
                ii) kod tamiri(Maintenance) kolay olur.
                iii) child classlari daha atomik yapmis oluruz.

            2) Bir Classi baska bir classin child classi yapmak icin "extends" keywordu kullanilir. Ilk yazilan class child
               ikinci yazilan class parent olur Cat extends Animal derken cat child, animal parent olur

            3) Child Class object'leri Parent Classs'dan method ve variable'lari kullanabilir.

            4) Parent Class object'leri Child Class'tan method ve variable'lari kullanamazlar.

            5) Object Class her Class'in Parenti'dir. Javada Object Class haric her Class'in Parent'i vardir.
               Javada parenti olmayan tek class Object Class'tir.

            6) Private method ve variable'lar Child Class'lar tarafindan kullanilamaz.(inherit edilemez)
               Protected method ve variable'lar Child Classlar tarafindan kullanilabilir (Inherit edilebilir)
               Baska bir packageda'da olsa kullanilabilir.
               Default method ve variable'lar ayni package'deki Child Classlar tarafindan kullanilabilir (Inherit edilebilir)
               Public method ve variable'lar Child Classlar tarafindan kullanilabilir (Inherit edilebilir)
               Note : Child Classlar tarafindan kullanilabilir olmak "inherit edilebilir" demektir.

            7) 4 tip Inheritance vardir:
               i) Multilevel Inheritance : Java bunu kabul eder.
               ii) Hierarchical Inheritance : Bir Parent icin coklu Child. Java bunu kabul eder
               iii) Multiple Inheritance : Bir Child'a coklu Parent, Java bunu desteklemez.(Java does not support multiple inheritance)
               iv) Single Inheritance : Bir Child Class icin bir Parent Class demektir, Java bunu destekler.


         */


        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        System.out.println();

        Dog d1 = new Dog();


        d1.eat();
        d1.drink();
        d1.bark();

        System.out.println();

        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();





































    }
}
