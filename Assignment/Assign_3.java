import java.util.Scanner;

public class Assign_3 {
    public static void main(String[] args) {
        int no;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        no = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= no; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of" + no + "is:" + factorial);
    }

}
