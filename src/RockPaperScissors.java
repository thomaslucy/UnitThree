/* Lucy Thomas
11/7/2019
Playing rock paper scissors against the computer using multiple methods */
import java.util.Scanner;

public class RockPaperScissors
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
        else if (num == 2)
            return "paper";
        else
            return "scissors";
    }
    public static String whoWins(String computer, String person){
        if (computer.equals(person))
            return "You chose "+person+".\nThe computer chose "+computer+".\n You tied!";
        else if(person.equals("rock") && computer.equals("paper"))
            return "You chose "+person+".\nThe computer chose "+computer+".\nThe computer wins!";
        else if(person.equals("paper") && computer.equals("rock"))
            return "You chose "+person+".\nThe computer chose "+computer+".\nYou win!";
        else if(person.equals("scissors") && computer.equals("rock"))
            return "You chose "+person+".\nThe computer chose "+computer+".\nThe computer wins!";
        else if(person.equals("rock") && computer.equals("scissors"))
            return "You chose "+person+".\nThe computer chose "+computer+".\nYou win!";
        else if(person.equals("paper") && computer.equals("scissors"))
            return "You chose "+person+".\nThe computer chose "+computer+".\nThe computer wins!";
        else
            return "You chose "+person+".\nThe computer chose "+computer+".\nYou win!";
    }
public static void main(String [] args){
        String person = getUserChoice();
        String computer = getComputerChoice();
        System.out.println(whoWins(computer, person));
}


}
