/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Keval Patel
* ID: kpp5104
*/
package wheeloffortune;

import java.util.*;

public class WheelOfFortune {

  /**
   * @param args the command line arguments
   */
   
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random(); 
   
    System.out.println("Spint the wheel: 1, Buy a vowel: 2, Solve the puzzle: 3, Quit the game: 4 ");
    System.out.println("Enter Number: ");
    int numIn = scan.nextInt();
    System.out.println("You have enterd: " + numIn);
  
    if (numIn == 1){
        int spinNum = random.nextInt(50);
        System.out.println("You have spined wheel and got " + spinNum);
        System.out.println("Enter a letter: ");
        String letter = scan.next().toUpperCase();
        char c1 = letter.charAt(0);
 
        if (c1 >= 'A' && c1 <= 'Z'){
        System.out.println("You entered: " + c1);
        }
        else
        System.out.println("Input error");
    }
    else if (numIn == 2){
        System.out.println("Enter a Vowel: A, E, I, O, U");
    }
    else if (numIn == 3){
       System.out.println("You want to solve the puzzle");
    }
    else if (numIn == 4){
       System.out.println("Quit");
       System.exit(0);
    }
    else{
        System.out.println("Invalid input");
    }
  }
}
