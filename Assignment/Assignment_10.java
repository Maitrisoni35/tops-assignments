import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no, sum = 0;
        System.out.println("Enter  element:");
        no = scan.nextInt();
        int numbers[] = new int[no];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter element:");
            numbers[i] = scan.nextInt();
            sum += numbers[i];

        }
        double avg = (double) sum / no;
        System.out.println("Aveage=" + avg);

    }

}
