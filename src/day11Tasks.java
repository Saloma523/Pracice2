import java.util.Scanner;

public class day11Tasks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String first = input.next();
        String second = input.next();
        input.close();

        String f = first.substring(1);
        String s = second.substring(1);

        System.out.println(f + s);

        System.out.println("----------------------------------------");






    }
}
