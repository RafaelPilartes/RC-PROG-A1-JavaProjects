
package com.mycompany.methodsquarenumber;
import java.util.Scanner;

public class MethodSquareNumber {

    public static void main(String[] args) {
        int number;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        
        square(number);
    }
    
    public static void square(int number) {
        int square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }
}
