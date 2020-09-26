/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.util.Scanner;

/**
 *
 * @author Tarun
 */
public class CompareIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter num 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = scanner.nextInt();
        
        // additive operators
        long sum = num1 + num2;
        int difference = num1 - num2;

        System.out.println("Sum: " + sum + ", difference: " + difference);

        // muliplicative        
        long mulitple = num1 * num2;
        int division = num1 / 10;
        int remainder = num1 % 10;

        System.out.println("multiple: " + mulitple + ", difference: " + division + ", remainder: " + remainder);

        // relational
        boolean isLess = num1 < num2;
        boolean isGreater = num1 > num2;
        boolean isLessthanorEquals = num1 <= num2;
        boolean isGreaterthanorEquals = num1 >= num2;

        System.out.println("Lessthan: " + isLess + ", Greaterthan: " + isGreater + ", Lessthan or equals: " + isLessthanorEquals + ", Greater than or equals: " + isGreaterthanorEquals);
        // equality
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);

        System.out.println("Equal: " + isEqual + ", Not Equal: " + isNotEqual);
    }
}
