
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        int no1, no2, no3;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        no1 = scan.nextInt();
        System.out.println("enter second number:");
        no2 = scan.nextInt();
        System.out.println("enter  third number:");
        no3 = scan.nextInt();
        if (no1 > no2 && no1 > no3) {
            System.out.println("maximum number  is:" + no1);
        } else if (no2 > no1 && no2 > no3) {
            System.out.println("maximum number is" + no2);
        } else {
            System.out.println("maximum number is" + no3);
        }

    }

}
