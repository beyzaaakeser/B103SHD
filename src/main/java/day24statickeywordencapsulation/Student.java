package day24statickeywordencapsulation;

// Encapsulation : "Data Hiding(Gizlemek)" demektir.

// Data'yi nicin gizlersiniz? Data'yi dis etkenlerden korumak icin gizleriz.

// Data'yi nasil gizlersiniz? Access Modifier'ini private yaparak gizlerim.

// Data'yi gizledikten sonra baska class'lardan okumak istersen ne yaparsin?
// "get" methodlar(getter) olusturarak gizlediginiz data'lari okunur hale getirebiliriz.

// Data'yi gizledikten sonra baska class'lardan degistirmek istersen ne yaparsin?
// "set" methodlar(setter) olusturarak gizledigimiz data'lari degistirebiliriz.

// Variable'in "data type"i ile get methodun Return Type'i ayni olmalidir.
// get methodlari isimlendirirken "get + <variable name>" ancak variable'in data type'i boolean ise "is + <variable name>"
// set methodlari isimlendirirken "set + <variable name>" ancak variable'in data type'i boolean ise "is + <variable name>"
// Ama set methodu parametre ile calisir. parametre ==> variable data tipinde ve variable ismiyle ayni olur genel kullanim.



public class Student {


    public String stdName = "Tom Hanks";
    private String stdID = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;



    public String getStdID() {
        return stdID;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }


    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }







}
