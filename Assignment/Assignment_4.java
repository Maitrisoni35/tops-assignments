import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter number:");
        int number = scan.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("number is not prime");
                temp = 0;
                break;
            } else {
                temp = 1;
            }

        }
        if (temp == 1) {
            System.out.println("number is prime");
        }
    }

}
