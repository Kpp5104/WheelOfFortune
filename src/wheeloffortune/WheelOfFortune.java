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
    String ans = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    String entry = "";
    ArrayList wheel = new ArrayList();
    wheel.add("5000");
    wheel.add("600");
    wheel.add("500");
    wheel.add("300");
    wheel.add("500");
    wheel.add("800");
    wheel.add("550");
    wheel.add("400");
    wheel.add("300");
    wheel.add("900");
    wheel.add("500");
    wheel.add("300");
    wheel.add("900");
    wheel.add("BANKRUPT");
    wheel.add("600");
    wheel.add("400");
    wheel.add("300");
    wheel.add("LOST A TURN");
    wheel.add("800");
    wheel.add("350");
    wheel.add("450");
    wheel.add("700");
    wheel.add("300");
    wheel.add("600");
        
    while (true){
    System.out.println("\n");
    System.out.println("                     =                           =");
    System.out.println("                     =      Wheel Of Fortune     =");
    System.out.println("                     =                           =");
    System.out.println("\n\n");
    
      for (char letter : ans.toCharArray()){
          if (entry.indexOf(letter)==-1){
              if (letter >= 'A' && letter <= 'Z'){
          System.out.print("_ ");
              }
              else{
                  System.out.print("  ");
              }
          }
          else{
              System.out.print(letter);
            }
 
        }
    System.out.println("\n\n1 Spint the wheel \n2 Buy a vowel\n3 Solve the puzzle \n4 Quit the game\n9 Test \n");
    System.out.print("Enter Number: ");
    int numIn = scan.nextInt();
    System.out.println("You have enterd: " + numIn);

    switch (numIn){
    case 1:

        System.out.println("You have spined wheel and landed on: ");
        System.out.print("Enter a letter: ");
        String letterIn = scan.next().toUpperCase();
        char c1 = letterIn.charAt(0);
        if (c1 >= 'A' && c1 <= 'Z'){
        System.out.println("You have enter: " + letterIn);
        }


        
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
        
    case 9:
        
        System.out.println("Test letter input");
        System.out.println("Enter a letter: ");
        String let = scan.next().toUpperCase();
        char c2 = let.charAt(0);
        if (c2 >= 'A' && c2 <= 'Z'){
        System.out.println("You entered: " + c2 + " it is a letter");
        }
        else if (c2 == '4'){
            System.out.println("Quit");
            System.exit(0);
        }
        else{
        System.out.println("You entered: " + c2 + " it is not a letter");
        }
        
    break;
        
    default:
        System.out.println("Entry not valid, pleas try again later");
    
    }
    }
  }
}
