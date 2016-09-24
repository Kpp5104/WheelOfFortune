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

    public static String ans = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    public static String entry = "";
    public static Scanner scan = new Scanner(System.in);
    /**
     *
     */
    public static ArrayList wheel = new ArrayList();
    
    
    public static void main(String[] args) {

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

        title();
        mask();
    
        System.out.println("\n\n1. Spint the wheel \n2. Buy a vowel\n"
                + "3. Solve the puzzle \n4. Quit "
                + "\n8. Toggle puzzle reveal \n9. Test letter input \n");
        System.out.print("Enter choice: ");
        int numIn = scan.nextInt();

    switch (numIn){
 
        case 1:
            choicenum1 ();
        break;
    
        case 2:
            System.out.println("comming soon...");
        break;
        
        case 3:
           System.out.println("comming soon..");
        break;
        
        case 4:
            System.out.println("Quit");
            System.exit(0);
        break;
        
        case 8:
             choicenum8();
         break;
        
         case 9:
            choicenum9 ();
        break;
        
    default:
            System.out.println("Entry not valid, pleas try again later");
        }
    }
}
    public static void mask (){
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
    }
    public static void title(){
        
        System.out.println("\n");
        System.out.println("                     ======================");
        System.out.println("                     =  Wheel Of Fortune  =");
        System.out.println("                     ======================");
        System.out.println("\n");
    }
    
    public static void choicenum1 (){
        Object spin = wheel.get(new Random().nextInt(wheel.size()));
        System.out.println("You have spined wheel and landed on: " + spin );
        System.out.print("Enter a letter: ");
        String letIn = scan.next().toUpperCase();
        char c1 = letIn.charAt(0);
        if (c1 >= 'A' && c1 <= 'Z'){
            System.out.println("You have enter: " + letIn);
            entry += letIn;
        }
        else
            System.out.print("Not a letter try again");
    }

    public static void choicenum8(){
            
    }
    public static void choicenum9 (){
        
        System.out.println("Test letter input");
        System.out.println("Enter a letter: ");
        String let = scan.next().toUpperCase();
        char c2 = let.charAt(0);
        if (c2 >= 'A' && c2 <= 'Z'){
            System.out.println("You entered: " + c2 + " it is a letter");
        }
        else if (c2 == '4')
        {
            System.out.println("Quit");
            System.exit(0);
        }
        else{
            System.out.println("You entered: " + c2 + " it is not a letter");
        }
    }
}
