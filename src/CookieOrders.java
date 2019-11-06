import java.util.Scanner;

public class CookieOrders
{
    public static String TotalCost(int numboxes) {
        if(numboxes < 1)
            return "Your input is invalid";
        if (numboxes < 5) {
            double cost = 6.95;
            double total = cost * numboxes;
            return "You bought " + numboxes + " boxes of cookies at $" + cost + " per box. Your total bill is $" + total;
        } else if (numboxes < 10) {
            double cost = 5.95;
            double total = cost * numboxes;
            return "You bought " + numboxes + " boxes of cookies at $" + cost + " per box. Your total bill is $" + total;
        } else if (numboxes < 16) {
            double cost = 5.50;
            double total = cost * numboxes;
            return "You bought " + numboxes + " boxes of cookies at $" + cost + " per box. Your total bill is $" + total;
        } else {
            double cost = 4.95;
            double total = cost * numboxes;
            return "You bought " + numboxes + " boxes of cookies at $" + cost + " per box. Your total bill is $" + total;
        }
        }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("1-4 boxes:              6.95 per box");
            System.out.println("5-9 boxes:              5.95 per box");
            System.out.println("10-15 boxes:            5.50 per box");
            System.out.println("16 or more boxes:       4.95 per box");
            System.out.println("Enter the number of boxes you wish to purchase: ");
            int box = scan.nextInt();
            System.out.println(TotalCost(box));
        }

}
