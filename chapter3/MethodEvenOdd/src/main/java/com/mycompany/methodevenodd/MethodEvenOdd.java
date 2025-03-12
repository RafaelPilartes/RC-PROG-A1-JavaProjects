
package com.mycompany.methodevenodd;
import java.util.Scanner;

public class MethodEvenOdd {

    public static void main(String[] args) {
        int yourNumber;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        yourNumber = input.nextInt();
        
        evenOdd(yourNumber);
    }
    
    public static void evenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
