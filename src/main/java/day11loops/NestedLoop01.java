package day11loops;

public class NestedLoop01 {
    public static void main(String[] args) {


/*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz.
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        // bir dongunun icinde baska bir dongu varsa buna nested loop diyoruz. bunlarin kodunu yazarken once distakinin dongusunu yazarsin

        for (int i=1; i<5; i++){

            System.out.println("Week: "+ i);

            for (int k =1; k<8 ; k++ ){
                System.out.println("Day: " + k);
            }
        }

        // variable'i iki suslu parantez arasinda olusturursan o variableyi sadece suslu parantez icinde kullanabilirsin suslu parantez disinda kullanamazsin.
        //suslu parantez ininde bir suslu parantez daha olabilir. ikinci suslu parantez in icinde olusturduysan o suslu parantez disindaki suslu parantezde bile kullanamazsin
        // ilk suslu parantez icinde kullansan icindeki ikincii suslu parantezde de kullanabilirdin. ama yukaridaki gibi tam tersi durumda yapamazsin.


























    }
}
