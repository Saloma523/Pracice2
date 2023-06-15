public class SwabLetters {

    public static void main(String[] args) {

        swabTwoNumbers(10,34);
    }


    public static void swabTwoNumbers(int a, int b){

        a = a + b;// 44
        b = a - b;// 44 -34 = 10
        a = a - b;// 44 - 10 = 34
        System.out.println("a = " + a + " b = " + b);
    }
}
/*
int a=5;
int b=6;
change and print
a==6;
b==5;
 */