import java.util.Scanner;

public class RockPaperScissors
// Lucy Thomas
// 11/7/2019
// Playing rock paper scissors against the computer using multiple methods
{
    public static String getUserChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors");
        String userchoice = scan.nextLine();
        return userchoice.toLowerCase();
    }
    public static String getComputerChoice(){
        int num = (int)(Math.random()*3+1);
        if (num == 1)
            return "rock";
        if (num == 2)
            return "paper";
        else
            return "scissors";
    }
    

}
