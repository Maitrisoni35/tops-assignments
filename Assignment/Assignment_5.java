import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("eneter number");
        int number = scan.nextInt();
        int tnumber, number1;
        tnumber = number;
        number1 = number;
        int rem, count = 0, sum = 0;
        // no of digit
        while (number != 0) {
            rem = number % 10;
            count++;
            number = number / 10;
        }
        int pow_value;
        while (tnumber != 0) {
            rem = tnumber % 10;
            pow_value = (int) Math.pow(rem, count);
            sum = sum + pow_value;
            System.out.println("sum" + sum);
            tnumber = tnumber / 10;
        }
        if (sum == number1) {
            System.out.println("number is Armstrong");
        } else
            System.out.println("number is  not Armstrong");
    }

}
