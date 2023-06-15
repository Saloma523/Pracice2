import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        ArrayList<Integer> list2 =  new ArrayList<>();

       Integer min1 =  Collections.min(list);
        System.out.println(min1);
        list2.add(min1);
        list.remove(min1);
        System.out.println("min1 = " + min1);

        System.out.println("---------------------------------------------------------------------");


       /* int[] arr = {3,1,99,-5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp ;

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

        */


    }


}
/*
Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]

 */