
package com.mycompany.usingscanner;
import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = input.nextLine();
        
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("==============");

        System.out.println("Hello " + name + " the sum is: " + sum);

    }
}
