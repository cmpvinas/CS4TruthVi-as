/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02truthviñas;
import java.util.Scanner;
/**
 *
 * @author cxarl
 */
public class Ex02TruthViñas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String response;
        String repeat;  
        int range = 10;
        int min = 1;
        int guesses = 3;
        do {
        System.out.println("""
                           Welcome to Higher or Lower! What will you do?
                           -Start game
                           -Change settings
                           -End application""");
        response = sc.nextLine();
            
        if (response.equalsIgnoreCase("Start game")) {
            do {
                int random = (int) Math.floor(Math.random()*range) + min;
                int guess = Integer.parseInt(sc.nextLine());

                System.out.printf("You have %d guess(es) left. What is your guess?", guesses);
              
                for (int remaining = guesses; remaining > 0; remaining--)
                if (guess < random) {
                    System.out.printf("Guess higher! You have %d guess(es) left. What is your guess?", remaining);
                }
                else if (guess > random) {
                    System.out.printf("Guess lower! You have %d guess(es) left. What is your guess?", remaining);
                }
                else {
                    System.out.println("You win!");
                    break;
        }
        
        System.out.println("Play again (y/n)? ");
        repeat = sc.nextLine(); 
    }
    while(repeat.equalsIgnoreCase("y"));
    break;
    }
    
    else if (response.equalsIgnoreCase("Change settings")) {
        System.out.println("""
                           What is the lower limit of the random number?
                           What is the upper limit of the random number?
                           How many guesses are allowed?""");
      
        System.out.print("Lower limit: ");
        min = sc.nextInt();
        
        System.out.print("Upper limit: ");
        range = sc.nextInt();
      
        System.out.print("Guesses: ");
        guesses = sc.nextInt();
    }
    else if (response.equalsIgnoreCase("End application")) {
        break;
    }
    else {
        System.out.println("Invalid input.");
    }
    }
        while(!response.equalsIgnoreCase("End application"));
}
}
