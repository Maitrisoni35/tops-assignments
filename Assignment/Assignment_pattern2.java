import java.util.Scanner;

public class Assignment_pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter  num:");
        int no = scan.nextInt();
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no - i; j++)
                System.out.print("      ");
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "*");
                if (k < i) {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no - i; j++)
                System.out.print("      ");
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "*");
                if (k < i) {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

}
