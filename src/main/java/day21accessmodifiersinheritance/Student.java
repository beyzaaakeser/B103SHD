package day21accessmodifiersinheritance;

public class Student {


    /*
          Access Modifier
          1) Public    2) Protected   3) Default(Access Modifier'i default yapmak icin Acces Modifier yazmayiz)   4) Private

          Note : Access Modifierleri genisten dara dogru sayiniz:
                 public > protected > default > private

          Note : Access Modifier'lari birer birer aciklayiniz.
                 public olanlaar her classta kullanilabilir
                 protected olanlar baska baska package'lerden kullanilamaz.Ancak baska package'de "child class" icinden kullanilabilir
                 Default olanlar baska package'den kullanilamazlar
                 private olanlar sadece olusturulduklari Class icinde kullanilabilirler.
          Note : "protected" ile "default" un farkini soyleyiniz.
                  protected olanlar baska package'lerden kullanilamaz.Ancak baska package'de "child class" icinden kullanilabilir
                  Default olanlar baska package'den kullanilamazlar
          Note : Classlar icin hangi Access Modifier'lar kullanilabilir.
                 public, default kullanilir ama protected ve private kullanilamaz.

     */


    // Public her Class'da kullanilabilir.
    public String stdName = "TomHanks";

    // Protected olanlar baska package'lerden kullanilamaz.Ancak baska package'de "child class" icinden kullanilabilir.
    protected String address = "Miami";

    // Default olanlar baska package'den kullanilamazlar
    String email = "th@gmail.com"; // neden emaili default yaptik? Sirket emali belli bir grup tarafindan kullanilir. onun oglu benim mailimi kuallanamz

    //private olanlar sadece olusturulduklari Class icinde kullanilabilirler.
    private  String stdId = "20206517004";














}
