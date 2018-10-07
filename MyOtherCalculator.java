/*
This program's purpose is to function as a calculator, outputting basic operations by taking in two user inputs
Written by John Orekunrin
Date: 10/02/2018 @ 02:58 AM
*/

import java.util.Scanner;

public class MyOtherCalculator{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      int num1, num2;
      
      System.out.println("Enter one number: ");
      num1 = keyboard.nextInt();
      
      System.out.println("Enter another number: ");
      num2 = keyboard.nextInt();
      
      System.out.println("Addition: " + add(num1, num2));
      System.out.println("Subtraction: " + subtract(num1, num2));
      System.out.println("Multiplication: " + multiply(num1, num2));
      System.out.println("Divide: " + divide(num1, num2));
      System.out.println("Modulo: " + modulo(num1, num2));
   }
   
   public static int add(int num1, int num2){
      return (num1 + num2);
   }
   
   public static int subtract(int num1, int num2){
      return (num1 - num2);
   }
   
   public static int multiply(int num1, int num2){
      return (num1 * num2);
   }
   
   public static int divide(int num1, int num2){
      return (num1 / num2);
   }
   
   public static int modulo(int num1, int num2){
      return (num1 % num2);
   }
}