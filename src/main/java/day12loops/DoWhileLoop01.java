package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        int i = 1;

        while(i<1){
            System.out.println("While loop");
            i++;
        }
        // while loop bazi durumlarda hic calismayabilir. bu ornekteki gibi. yani while loop icin "zero execulation" mumkundur.


        int k =1;

        do {
            System.out.println("do-while loop");
            k++;
        }while(k<1);

        // do-while-loop kullandiginizda loop bodysi icindeki kod en az 1 kere calisir. yani do-while-loop icin "zero execulation" mumkun degildir.


        //Example 1 : Bir ondalik sayinin ondalik kismindaki rakamlarin toplamini bulunuz.
        //                24.5673  ==> 5+6+7+3==23


        double num = 24.5673;
        System.out.println(num);
        String.valueOf(num); // String.valueof methodu parantrezin icine koyulaan datanin tipini String yapar. ne koyarsan koy icine stringe cevirir.

        String str = String.valueOf(num);
        System.out.println(num); // 24.5673


        // Regex icin nokta kullandiginizda onune "\\" koyunuz. yani nokta "\\." seklinde kullanilir.
        // regexte noktanin ozel bir anlami var. o anlamdan kurtarmak icin ve nokta olarak kullanabilmek icin bunu yapmamiz lazim.


        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart); //inte cevirir.
        System.out.println(decimalInt);//5673


        int sum =0;

        do {

          sum = sum+decimalInt%10;

            decimalInt= decimalInt/10;

        }while(decimalInt>0);

        System.out.println(sum);












































    }
}
