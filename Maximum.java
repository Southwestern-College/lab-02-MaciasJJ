
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

//Display the maximum
        System.out.println("The max is:");
        if (number1 >= number2)
            System.out.println(number1);
        if (number1 >= number3)
            System.out.println(number1);
        if (number2 >= number1)
            System.out.println(number2);
        if (number2 >= number3)
            System.out.println(number2);
        if (number3 >= number1)
            System.out.println(number3);
        if (number3 >= number2)
            System.out.println(number3);
    }
}