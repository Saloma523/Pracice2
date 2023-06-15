import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(same("abc", "cba"));
        System.out.println(same("salma","aalma"));
    }

    public static boolean same(String a , String b){

        char[] arr1 = a.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr2);




        return Arrays.toString(arr1).equals(Arrays.toString(arr2));
    }
}
/*
.
use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:

 */