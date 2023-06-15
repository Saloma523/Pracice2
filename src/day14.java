import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day14 {
    public static void main(String[] args) {

        System.out.println(sum(100));

        System.out.println(factorial(5));

        System.out.println("---------------------------------");


        for(int i = 0; i < 8; i ++){

            System.out.println("* * * * * *");
        }

        System.out.println("-------------------------------------------");


        for (int i = 0; i < 100; i ++) {

            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FINRA");
            }else if(i % 5 == 0){

                System.out.println("FIN");
            }else if(i % 3 == 0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }



        System.out.println("-------------------------------------");

        String str = " mn@#123Ab!";
       String[] str2 = str.split("");


        }





    }

    public static int sum(int n){

        int sum = 0;

        for (int i = 0; i <= n; i++) {

           sum += i;

        }

        return  sum;
    }

    public static int factorial(int limit){
        int fact = 0;

        for (int i = limit ; i >= 1 ; i--) {

            fact += limit * i;

        }

        return fact;
    }




}
