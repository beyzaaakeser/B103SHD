package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrays'lerin icine sadece "primitive data tipleri" ve "reference'lar" yerlestirilebilir.


    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";
        System.out.println(Arrays.toString(str));


        // Example 1 : String bir array olusturunuz "Tom" ve "Tom"dan onceki tum elemanlari ekrana yazdiriniz.

        String arr[]= {"Jane", "Mark", "Chistopher", "Tom", "Ali", "Rojda"};


        for (String w: arr){
            System.out.print( w + " ");
            if (w.equals("Tom")){
                break;
            }
        }

        System.out.println();
        // Example 2 : String bir array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz.

        String brr[]= {"Jane", "Mark", "Chistopher", "Tom", "Ali", "Rojda"};

        for (String w: brr){

            if(w.equals("Jane") || w.equals("Tom")){
                continue; // bosver yazma demekti ya
            }
            System.out.print(w + " ");
        }


        System.out.println();
        // Example 3  : Kullanici ile beraber bir array olusturunuz.
        //              Bir ogretmenin sinifindaki ogrencilerin isimlerini app'e yuklemesini saglayan kodu yaziniz.



        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet ogrenci isimi gireceksiniz ? ");

        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz. Devam etmek  icin herhnagi bir tusa basiniz.");



        for (int i = 1; i<=numOfStd ; i++){
            System.out.println("Lutfen " + i +  ". ogrencinin ilk ismini giriniz");


            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdName;


        }
        System.out.println(Arrays.toString(names));

























































    }
}
