import java.util.Scanner;

public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int possum = 0;
        int negsum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num > 0) {
                possum += num;
            }
            if (num < 0) {
                negsum += num;
            }
        }
        System.out.println("The sum of the positive numbers is " + possum);
        System.out.println("The sum of the negative numbers is " + negsum);
    }
}
