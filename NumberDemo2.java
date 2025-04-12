/* Create an application named NumbersDemo 
whose main() method holds two integer variables.
Assign values to the variables. In turn, pass each value to 
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and 
displayNumberSquared(). Create each method to perform the task its name 
implies
*/
package com.mycompany.numberdemo2;

import java.util.Scanner;
public class NumberDemo2 {

    public static void main(String[] args) {
     //declare the variable to store the values that the user will enter   
    int a;
    int b;
    
      Scanner number = new Scanner(System.in);
      //prompt the user to enter values
      System.out.println("Enter the 1st value : ");
      a = number.nextInt();
    
      System.out.println("Enter the 2nd value : ");
      b = number.nextInt();
      
      displayTwiceTheNumber(a, b);
      displayNumberPlusFive(a, b);
      displayNumberSquared(a, b);
      
   }
   public static void displayTwiceTheNumber(int a, int b) {
      System.out.println(a + " times 2 = " + a * 2);
      System.out.println(b + " times 2 = " + b * 2);
   }
   public static void displayNumberPlusFive(int a, int b) {
      System.out.println(a + " plus 5 = " + (a + 5)  );
      System.out.println(b + " plus 5 = " + (b + 5)  );
   }
   public static void displayNumberSquared(int a, int b) {
      System.out.println(a + " squared  = " + Math.pow(a, 2) );
      System.out.println(b + " squared  = " + Math.pow(b, 2) );
   }
}
   
