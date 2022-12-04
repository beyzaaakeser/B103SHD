package day28abstraction;

public abstract class Animal {

    // body'si olmayan method'lar "Abstract method" olarak adlandirilirlar.
    // Bir method'u abstract yapmak icin icin iki sey yapmamiz lazim  ==>  1) Method body'si sil      2) "abstract" keyword kullan
    // "abstract" methodlar "abstract class" icinde olmalidir.
    // "abstract class"larda hem "abstract" method hem de "concrete(non-abstract)" method kullanilabilir.
    // "abstract" ==> soyut         concrete ==> somut




    public abstract void eat();

    public void drink(){
        System.out.println("Animals drink...");
    }


    // abstract move method olusturunuz
    public abstract void move(); // public olmak zorunda degil protected, default da olur







}
