package day23inheritancepolymorphism;

public class Math extends Courses {


    public void practice(){
        System.out.println("Solve questions");
    }



    public Math(){
        super("X");
        System.out.println("Constructor 1");
    }


    public Math (int a){
        this();// ayni classtaki constructor'i kullan demek. this() parametresi olmayan constructor'i kullanir.
        System.out.println("Constructor 2");
    }

    // ayni class icinde farkli bir constructor kullanmak istiyorsaniz kullandigimiza this(); yaziyoruz.
    // () icine parametre koyarsak java o parametre hangisiyse ona gider. () sadece boyle ise parametresiz olana bos olana gider



}
