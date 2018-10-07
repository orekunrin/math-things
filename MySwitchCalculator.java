/*
This program's purpose is to function as a basic calculator, implementing elementary functions, while showing off 
use of switch statements.
Written by John Orekunrin
Created on 10/02/2018 @ 09:30 PM
*/

import java.util.Scanner;

public class MySwitchCalculator{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      int num1, num2;
      String operation;
      
      System.out.println("Enter an integer: ");
      num1 = keyboard.nextInt();
      
      System.out.println("Enter another integer: ");
      num2 = keyboard.nextInt();
      
      System.out.println("Choose an operation");
      operation = keyboard.next();
      
      switch(operation){
         case "+":
            System.out.println("Add: " + num1 + " plus " + num2 + " equals " + (num1 + num2));
         break;
         case "-":
            System.out.println("Subtract: " + num1 + " minus " + num2 + " equals " + (num1 - num2));
         break;
         case "*":
            System.out.println("Multiply: " + num1 + " times " + num2 + " equals " + (num1 * num2));
         break;
         case "/":
            System.out.println("Divide: " + num1 + " divided by " + num2 + " equals " + (num1 / num2));
         break;
         case "%":
            System.out.println("Modulo (The remainder of): " + num1 + " and " + num2 + " is " + (num1 % num2));
         break;
         default:
            System.out.println("Enter a valid operation");
         break;
      }
   }
}