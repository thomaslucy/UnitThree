public class TrickyDice
{
    public static void main(String[] args)
    {
        System.out.println(regularRoll());
        System.out.println(trickyRoll());
    }
    public static int regularRoll()
    {
        int num = (int)(Math.random()*6+1);
        return num;
    }
    public static int trickyRoll()
    {
        int num =(int)(Math.random()*100+1);
        if(num<=20)
            return 6;
        else if(num<=38)
            return 5;
        else if(num<=54)
            return 4;
        else if(num<=69)
            return 3;
        else if(num<=84)
            return 2;
        else
            return 1;

    }
}
