import java.util.Scanner;

public class SlopeofALine
{
    public static void main(String[] args)
{
    System.out.println("Enter x1: ");
    System.out.println("Enter x2: ");
    System.out.println("Enter y1: ");
    System.out.println("Enter y2: ");
    Scanner scan = new Scanner(System.in);
    int x1 = scan.nextInt();
    int x2 = scan.nextInt();
    int y1 = scan.nextInt();
    int y2 = scan.nextInt();
    System.out.println(slope(x1, y1, x2, y2));
}
public static String slope(int x1, int x2, int y1, int y2){
    if (x1==x2){
        return "The line defined by the points ("+x1+","+y1+") and ("+x2+","+y2+") is a vertical line and the slope is undefined.";
    } else {
        return "The line defined by the points ("+x1+","+y1+") and ("+x2+","+y2+") has a slope of "+(double)(y2-y1)/(x2-x1);
    }
}
}
