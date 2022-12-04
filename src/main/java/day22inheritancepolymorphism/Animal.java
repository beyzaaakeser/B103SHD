package day22inheritancepolymorphism;

public class Animal {

    public int a =12;

    public int c =45;


    // method
    public void eat(){
        System.out.println("Animal eat");
    }

    // Constructor olusturmak icin ==> access modifiere -class ismi-()-{}
    // methodlarin return type olur ama Constructorlarda return type yoktur.
    // methodlarin isminde esnegiz istedigimizi koyabiliriz ama Constructor isimleri class ismiyle ayni olmak zorunda
    // methodlarin ismimleri kucuk harfle baslar ama Constructor isimleri class ismi oldugu icin buyuk harfle baslar.


    // Constructor
    public Animal(){
        System.out.println("Animal");
    }










}
