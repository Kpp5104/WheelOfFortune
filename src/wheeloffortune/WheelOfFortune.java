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
   
    System.out.println("Spint the wheel: 1, Buy a vowel: 2, Solve the puzzle: 3, Quit the game: 4, Test: 5 ");
    System.out.println("Enter Number: ");
    int numIn = scan.nextInt();
    System.out.println("You have enterd: " + numIn);

    
    switch (numIn){
    case 1:

        System.out.println("You have spined wheel ");
    break;
    
    case 2:
        System.out.println("Enter a Vowel ");
    break;
        
    case 3:
       System.out.println("You want to solve the puzzle");
    break;
        
    case 4:
       System.out.println("Quit");
       System.exit(0);
    break;
        
    case 5:
        System.out.println("Test letter input");
        System.out.println("Enter a letter: ");
        String let = scan.next().toUpperCase();
        char c2 = let.charAt(0);
        if (c2 >= 'A' && c2 <= 'Z'){
        System.out.println("You entered: " + c2 + " it is a letter");
        }
        else
        System.out.println("You entered: " + c2 + " it is not a letter");
    break;
        
    default:
        System.out.println("Entry not valid, pleas try again later");
    
    }
  }
}
