package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        /*
         Static keyword nedir?
         Static keyword Classa baglanmis class elemanlaridir.
         Static Class elemanlari her objenin ortak elemandir.
         Static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
         Static Class elemanlarina class uzerinden ulasilir. objeler staticlere ulasmak icin kullanilmaz hata vermez ama tavsiye edilmez.
         Static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez cunku uzun yoldur.
         Static variable'lara class ismi kullanilarak ulasilmalidir.
        */


        System.out.println(Car.counter);

        System.out.println(car1.counter);
        System.out.println(car1.price);

        System.out.println(); // konsolda ayirsin diye koydum.

        System.out.println(car2.counter);
        System.out.println(car2.price);

        System.out.println();

        System.out.println(car3.counter);
        System.out.println(car3.price);

        System.out.println();

        System.out.println(car4.counter);
        System.out.println(car4.price);




    }
}
