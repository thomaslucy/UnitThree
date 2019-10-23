import java.util.Scanner;

public class FindLargest
{
    public static void main(String[] args)
    {
        System.out.println("Enter the first number");
        System.out.println("Enter the second number");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.println(num1+" is larger than "+num2);
        }
        if(num1==num2){
            System.out.println(num1+" and "+num2+" are equal");
        }
        if(num1<num2){
            System.out.println(num2+" is larger than "+num1);
        }
    }
}
