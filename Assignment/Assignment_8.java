import java.util.Scanner;

public class Assignment_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number:");
        int no = scan.nextInt();
        int count = 0, num = 2, sum = 0;
        while (count < no) {
            boolean isprime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("sum of first" + no + "prime number is" + sum);

    }

}
