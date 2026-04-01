import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no, sum = 0;
        System.out.println("enter no of element");
        no = scan.nextInt();
        int numbers[] = new int[no];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter element:");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        System.out.println("Array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("total no of sum are" + sum);
    }

}
