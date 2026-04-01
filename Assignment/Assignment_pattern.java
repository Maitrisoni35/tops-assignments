import java.util.Scanner;

public class Assignment_pattern {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

}
