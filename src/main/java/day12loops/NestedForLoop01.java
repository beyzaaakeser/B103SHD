package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {


     //Asagidaki sekli ekrana yazdirin
     // ****
     // ****
     // ****
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz.");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz.");
        int sutun = input.nextInt();


        System.out.println("Karakter seciniz.");
        char ch = input.next().charAt(0);

        for (int i = 1; i<satir+1; i++){ // satir+1 ve sutun+1 diyoruz cunku en son satiri sutunu da alsin diye. yani <= satir demedik java iki is nyapmasin diye <satir+1 dedik


            for (int k = 1; k<sutun+1 ; k++){
                System.out.print(ch);
            }

            System.out.println();

        }

        System.out.println();

        /*
                Example 2 : Asagidaki sekli cizen kodu yaziniz

                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5

         */



        for (int i = 1; i <6 ; i++){ // int i =1 diyoruz cunku 0.satir diye bi sey yok satiri 1den baslatiriz sayma sayisi olarak

            for (int k =1; k<=i; k++){  // k<= i dedik cunku bu k satir sayisina kadar gitmeli diyoruz.
                System.out.print(k+ " ");

            }


            System.out.println();


        }

        System.out.println();


        /*
                    Example 3 : ASagidaki sekli cizen kodu yaziniz

                    * * * *
                    * * *
                    * *
                    *
         */
            int row = 4;

            for (int i = 1; i <=row ; i++){

                for (int k = row; k>=i ; k--){
                    System.out.print("* ");
                }

                System.out.println();



            }
























































    }
}
