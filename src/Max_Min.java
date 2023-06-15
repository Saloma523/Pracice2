import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class Max_Min {

    public static void main(String[] args) {

        Integer [] a  = {2,5,7,15,1,6};

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(a));



        Integer max1 = Collections.max(arr);
        Integer min1 = Collections.min(arr);
        arr.remove(min1);
        Integer min2 = Collections.min(arr);

        System.out.println(max1 - min2);

        System.out.println("--------------------------------------------------------------------------");

        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }


        }

        System.out.println(max);
        System.out.println(min);

    }
}
/*
Use Collection int a [] = {2,5,7,15,1,6};
   int a [] = {2,5,7,15,1,6};
   output
   13   < Max number minus second min num and result is 13
 */