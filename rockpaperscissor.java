package Exercises;

import java.util.Random;
import java.util.*;
public class rockpaperscissor {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        //Prompting the user to enter their move
        System.out.println("Enter your move(rock, paper, scissor): ");
        //Reading and standardizing the user's input
        String man = sc.nextLine().toLowerCase(); //reads a line of text from the console input and waits for the user to type their move and press enter
       
        //Ensure the player enters a valid move
        while(!man.equals("rock") && !man.equals("paper") && !man.equals("scissor")) {
            System.out.println("Invalid move. Please enter rock, paper, or scissor: ");
            man = sc.nextLine().toLowerCase();
        }
        
        //Generating the computer's move
        String[] moves = {"rock", "paper", "scissor"};
        String comp = moves[rand.nextInt(3)];

        //Displaying the choices
        System.out.println("You chose: " + man);
        System.out.println("Computer chose: " + comp);

        //Determining the winner
        if(comp.equals(man)) {
            System.out.println("It's a tie!");
        } 
        else if((comp.equals("rock") && man.equals("scissor")) || 
                (comp.equals("paper") && man.equals("rock")) ||
                (comp.equals("scissor") && man.equals("paper"))) {
                    System.out.println("Computer wins!!");
        }
        else {
            System.out.println("You win!!");
        }
    }
}