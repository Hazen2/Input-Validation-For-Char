import java.util.Scanner;

/**
 * This simple program will use an input validation loop to make sure 
 * the user entered a 'Y', 'y', 'N', or 'n'.
 */

public class InputValidateChar
{
 public static void main(String[] args)
 {
   
   // Declare variables
   Scanner keyboard = new Scanner(System.in);
   char charLine; // Variable for the character that will be extracted
   String keyboardInput; // Variable saved for the keyboard's string input.
   
   // Ask the user to enter a Y for YES or N for NO
   System.out.println("Please enter 'Y' for YES or 'N' for NO.");
   keyboardInput = keyboard.nextLine();   
   charLine = keyboardInput.charAt(0); // Extract the single character from the entered text.
   
   // Consume the empty line
   // keyboard.nextLine();
   
   // Validate input using a while loop
   while (charLine != 'Y' && charLine != 'y' && charLine != 'n' && charLine != 'N')
   //while (charLine != 'Y')
   {
    System.out.println("Invalid entry. Try again.");     
    keyboardInput = keyboard.nextLine();
    charLine = keyboardInput.charAt(0);
   }
   
   // Successful entry.
   if (charLine == 'Y' || charLine == 'y')
   {
     System.out.println("You have entered: \"" + charLine + "\" for YES.");     
   }
   else if (charLine == 'N' || charLine == 'n')
     System.out.println("You have entered: \"" + charLine + "\" for NO.");
   
     
 }
}
