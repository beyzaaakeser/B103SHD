package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        Java primitivelere methodlar ekleyerek yeni bir yapi olusturdu, bu yapiya "Wrapper Class" denir

            Primitive    ==>   Wrapper
            byte         ==>   Byte
            short        ==>   Short
            int          ==>   Integer   ==> dikkat!
            long         ==>   Long
            float        ==>   Float
            double       ==>   Double
            boolean      ==>   Boolean
            chaar        ==>   Character  ==> dikkat!


           Wrapper Classlaar Non-Primitivedir. zaten Non-Primitivelerde deger ve method vardi ya wrapperlarda da deger ve method vardir. bu yuzden  non primitivedir.

         */


        byte primitiveByte = 12; // primitiveByte yazip nokta koydugunuzda (primitiveByte.) hic method goremezsiniz cunku primitiveler method icermez sadece deger icerir.


        Byte wrapperByte = 12;// wrapperByte yazip nokta koydugunuzda ( wrapperByte.) bircok method gorursunuz cunku wrapperlar method icerir.

       // Example 1: byte data typenin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        // Example 2: short , int, long, data  tyupelerinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // primitiveler nasil wrapperlara cevrilir (Autoboxing)

        float f1 = 13.99F;
        Float wrapperF1 =f1;

        // wrapperler primitivelere nasil cevrilir (Unboxing)

        Character w1 = 's';
        char primitiveW1 = w1;

        // Note : Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir.

    }

}
