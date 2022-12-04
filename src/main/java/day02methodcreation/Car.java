package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //Object nasil olusturulur?
        // 1)Class ismini yaziniz  2)Objeye bir isim veriniz   3) =   4) new keywordunu kullan  5) Class ismini parantezle beraber yaz(constructor) 6);
                Car                       myHonda                 =         new                         Car();
        // myHonda. koydugunda classin sahip oldugu her seye sahip oluyor. altinda cikiyor marka fiyat dur hareket et gibi..
        //objeler classlarrin gorunur halidir diye bu yuzden diyoruz.
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda

       //bunlari sout(System.out.println) icine koymama gerek yok cunku bu method kendisi yazi yaziyor zaten void oldugu icin.
        myHonda.hareketEt();
        myHonda.dur();




         //MeyhodCreation Classindan obje olusturduk
                MethodCreation obj = new MethodCreation();
                System.out.println(obj.toplamaYap(3,5));//8.0
                System.out.println(obj.carpmaYap(2,5,100));
    }

    public void hareketEt(){
        System.out.println("honda guzel hareket eder...");
    }// hareket edin parantezi

    public void dur(){
        System.out.println("Honda guvenli durur...");
    }


} // class
