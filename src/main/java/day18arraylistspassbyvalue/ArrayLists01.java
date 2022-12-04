package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        // Example 1 : Bir Integer ArrayList'deki 7 haric tum elemanlari 2 artiriniz.


        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for(Integer w: ages){

            if (w==7){
                continue;
            }
            // w = w+2;   ==> List'ler boyle update edilemezler set methodu ile update edilir.
            ages.set(ages.indexOf(w),w+2);

        }
        System.out.println(ages);


        // Example 2 : Size verilen ArrayList'te 8(Inclusive) ve 8'den onceki tum
        //             elemanlari 2 katina cikariniz.


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);


        for(Integer w: nums){

            nums.set(nums.indexOf(w),w*2); // eger bunu if in altina koysaydik 8 degismezdi. ama biz 8in degismesini istiyoruz
                                           // o yuzden 8e kadar zaten degistirecek ifle 8i gorecek ondan sonrasini degistirmeyecek
            if (w==8){
                break;
            }

        }
        System.out.println(nums);


























































    }
}
