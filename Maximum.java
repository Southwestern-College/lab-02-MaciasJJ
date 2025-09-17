
/**
 * Program description
 * @author Jeremy Macias
 */

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//Prompt the user to enter values for variables number1, number2, and number3.
        System.out.println("Please enter a value for variable 1");
        int number1 = input.nextInt();
        
        System.out.println("Please enter a value for variable 2");
        int number2 = input.nextInt();
        
        System.out.println("Please enter a value for variable 3");
        int number3 = input.nextInt();
    int max;
//Calculate the maximum value
        max = number1;
        if (max <= number2) {
            max = number2;
        }
        if (max <= number3) {
            max = number3;
        }
        
        //Output maximum value
        System.out.println("The maximum value is: " + max);

        //Close the program
        input.close();
    }
}