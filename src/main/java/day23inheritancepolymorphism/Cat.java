package day23inheritancepolymorphism;

public class Cat extends Mammal {


    public void meow(){
        System.out.println("Cats meow");
    }

    // overriding : Parent classta uygulamasini begenmediginiz methodun, uygulamasini degistirip kullanmaya denir.


    @Override // eat methodu sifirdan olusturulmus method degil. eat methodu parent classtan olusturulmus bir method demektir.
              // bunu koydugumuzda javaya @ovveride annotation'ini kullanarak Javanin yaptigimiz ovveride islemini kontrol etmesini saglariz.

    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override  // Asagidaki method "Overriding Method" denir.
    public Animal create() {
        return new Mammal();
    }


    /*
                    Butun kurallar override kurallari, genel kural degil

        1) Override yaparken methodun body'si degistirilir. (Curly Braces arasi)
        2) Override yaparken asla method signature'a dokunulmaz. yani isim ve parametre kismina dokunulmaz asla degistirilemez.
        3) Override yaparken inheritance olmak zorundadir. Parent olacak ki parent'dan alabilesin. (override yapmanin on sarti parent child reliationship'in olmasidir yani inheritance)
        4) Override yaparken "Access modifier"Lar belli kurallara gore farklilastirilabilirler.
            i) "Private" methodlar Override edilemezler.
            ii) Child Class'daki override edilen methodun access modifier'i Parent Classdaki methodun access modifier'i ile ayni veya daha genis olmalidir. Childaki genis olacak yani
            Note: Child Classdaki methodun access modifier'i daha dar olamaz. aynisi olabilir genisi olabilir ama dari olamaz
            iii) Default methodlar ayni package icindeyse override edilebilirler. Farkli package'den override edilemezler.
        5) Parent Class'daki method'un "Return type"i void ise return type degistirilemez.
        6) Parent Class'daki methodun return type'i primitive ise return type degistirilemez.
        7) Parent Class'daki methodun return type'i Wrapper Class ise return type degistirilemez.
        8) Parent Class'daki methodun return type'i Parent Class ise return type childlardan biri olabilir.
           Note : Child Class'daki return type Parent Classdakinden genis olamaz.
           Note : Aralarinda Parent Child iliskisi olmayan Classlar overriding'de Return Type degisiminde kullanilamazlar.
                  Mesela Short, Integer'den kucuktur fakat aralarinda Parent Child iliskisi olmadigindan Integer yerine Short kullanamzsiniz.
        9) Child'daki methodun Return Typeindan Parent'daki methodun Return Type'ina gidiste "IS-A" Relationship olmali.
           Note : Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
           Child<Parent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
           HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.

       10) Final methodlar override edilemezler. cunku overridingde  method body degistirilir. fakat final method body degistirilmesine musaade etmez.
       11) Polymorphism(Cok Bicimlilik) = Overloading + Overriding'dir.
           Note : Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin.
       12) Overloading ile Overriding arasindaki farklar nelerdir?
           1) Overloading icin inheritance gerekmez fakat overriding icin gerekir.
           2) private methodlar overload edilebilir, private overrid edilemezler.
           3) final methodlar overload edilebilir, override edilemezler.
           4) overloading static polymorphism olarak, overriding dinamik polymorphism olarak adlandirilir.
              Cunku static methodlar Overload edilebilir, overide edilemezler.
               "Method Overloading" Compile Time Polymorphism'dir, "Method Overriding" Run Time
                Polymorphism'dir.
           5) Overloadingde method signature degisir ama overridingde method signaturea dokunulmaz.

     */
































}
