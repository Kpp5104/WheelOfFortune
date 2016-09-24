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

    private static String ans = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"; //string
    private static String entry = "";//empty string
    public static Scanner scan = new Scanner(System.in);
    public static int flag = 0;//used as boolean
    public static int numIn;
    /**
     *
     */
    private static ArrayList wheel = new ArrayList();
    
    
    public static void main(String[] args) {

    wheel.add("5000");// add elements
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
    wheel.add("600");// add elements
        
    while (true){

        title();// call title method
        mask();// call mask mathod
    
        System.out.println("\n\n1. Spint the wheel \n2. Buy a vowel\n"
                + "3. Solve the puzzle \n4. Quit "
                + "\n8. Toggle puzzle reveal \n9. Test letter input \n");
        System.out.print("Enter choice: ");
        numIn = scan.nextInt();// user input menu choice 
       
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
    public static void mask (){// this mathod masks the "ans" string with "_ "(added space to split the letter
        // and leave the spaces as is (added extra space to split the words)
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
    public static void title(){//title mathod
        
        System.out.println("\n");
        System.out.println("                     ======================");
        System.out.println("                     =  Wheel Of Fortune  =");
        System.out.println("                     ======================");
        System.out.println("\n");
    }
    
    public static void choicenum1 (){//menu choice input = "1" 
        Object spin = wheel.get(new Random().nextInt(wheel.size()));// pick random object from wheel arraylist
        System.out.println("You have spined wheel and landed on: " + spin );//print the opject
        System.out.print("Enter a letter: ");// ask user for letter input
        String letIn = scan.next().toUpperCase();// comvert user input to upper case
        char c1 = letIn.charAt(0);// pase the latter as char
        if (c1 >= 'A' && c1 <= 'Z'){//check if the letter is from A-Z
            System.out.println("You have enter: " + letIn);
            entry += letIn;// add the latter to entry (empty array used to mask the ans array) which unmask the letter from ans string
        }
        else
            System.out.print("Not a letter try again");// if the user enter wrong input
    }

    public static void choicenum8(){// this  mathod toggle the answer on/off

        switch (flag){
            case 0:
           
                System.out.print(ans);
                flag = 1;
            break;
        
            case 1:
                System.out.print(entry);
                flag = 0;
            break;
        }
    }

    public static void choicenum9 (){ // enter letter test mode,
        
        System.out.println("Test letter input");
        System.out.println("Enter a letter: ");
        String let = scan.next().toUpperCase();
        char c2 = let.charAt(0);
        if (c2 >= 'A' && c2 <= 'Z'){
            System.out.println("You entered: " + c2 + " it is a letter");// display when user enter correct input
        }
        else{
            System.out.println("You entered: " + c2 + " it is not a letter");// display when user enter wrong input
        }
    }

}
