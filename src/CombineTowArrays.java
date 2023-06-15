import java.util.Arrays;

public class CombineTowArrays {

    public static void main(String[] args) {

        /*int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length];//to contain thr elements of arr1 and arr2

        int k = 0; // for third arr index number

        for (int i = 0; i < arr1.length; i++, k++) {// i is fo the first arr index number
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {// i is for the second arr index number

            arr3[k] = arr2[i];

        }

        System.out.println(Arrays.toString(arr3));

         */

        System.out.println("------------------------------------------------------");

        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6, 7};

        int arr3[] = new int[arr1.length + arr2.length];

        int k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length){
                arr3[i] += arr1[i];}
            else if (i>=arr1.length){
                arr3[i] +=arr2[k++];
            }
        }

        System.out.println(Arrays.toString(arr3));
    }


    }

