import java.util.Scanner;

public class RightTriangle {
    public static boolean isTriangle(int a, int b, int c){
        if(a+b>c && b+c>a && a+c>b)
            return true;
        else
            return false;
    }
    public static boolean isRight(int a, int b, int c){
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) || Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2))
            return true;
        else
            return false;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(isRight(a,b,c)==true)
            System.out.println("The side lengths of "+a+", "+b+", and "+c+" form a right triangle");
        else if (isTriangle(a,b,c) == true)
            System.out.println("The side lengths of "+a+", "+b+", and "+c+" form a triangle, but it is not a right triangle");
        else
            System.out.println("The side lengths of "+a+", "+b+", and "+c+" do not form a triangle");



    }
}
