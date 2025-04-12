/* Create an application named NumbersDemo 
whose main() method holds two integer variables.
Assign values to the variables. In turn, pass each value to 
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and 
displayNumberSquared(). Create each method to perform the task its name 
implies
*/
package com.mycompany.numberdemo;

import java.util.Scanner;

public class NumberDemo {

    public static void main(String[] args) {
    //declare the variable to store the values that the user will enter
     int number1;
     int number2;    
       
    Scanner zwanga = new Scanner(System.in);
    //prompt the user to enter value no.1
    System.out.println("Enter an Integer value ");
    number1 = zwanga.nextInt();
    //prompt the user to enter value no.2
    System.out.println("Enter the 2nd Integer value ");
    number2 = zwanga.nextInt();
        
        
        displayTwiceTheNumber(number1);
        displayTwiceTheNumber(number2);
        
        displayNumberPlusFive(number1);
        displayNumberPlusFive(number2); 
        
        displayNumberSquared(number1);
        displayNumberSquared(number2);
        
    }
    //pass each value to methods named displayTwiceTheNumber()
    public static void displayTwiceTheNumber(int number){
    System.out.println(number + " times 2 = " + (number * 2));
    }
    //pass each value to methods named displayTwiceTheNumber()
    public static void displayNumberPlusFive(int number){
    System.out.println(number + " plus 5 = " + (number + 5));
    }
    public static void displayNumberSquared(int number){
    System.out.println(number + " squared  = "  + (number*number));
    }
}
