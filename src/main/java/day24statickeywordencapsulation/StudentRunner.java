package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {

      Student std1 = new Student();
        System.out.println(std1.getStdID()); //TH202201

        System.out.println(std1.getGpa()); //3.8

        System.out.println(std1.isRetired()); // false

        std1.setStdID("AB");
        System.out.println(std1.getStdID()); //AB

        std1.setGpa(4.0);
        System.out.println(std1.getGpa()); //4.0

        std1.setRetired(true);
        System.out.println(std1.isRetired()); //true

        // yaptigimiz butun degisiklikler obje ustunde classta degil bu yuzden classdaki degerler ayni korunur. ama objedekiler degisir.

        Student std2 = new Student();
        System.out.println(std2.getStdID()); // TH202201 bu yeni obje classin kopyasi her sey sifirdan baslayacak














    }
}
