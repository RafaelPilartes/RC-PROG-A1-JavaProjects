
package com.mycompany.methodsumnum;
import java.util.Scanner;

public class MethodSumNum {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        num1 = input.nextInt();
        System.out.println("Enter the second number:");
        num2 = input.nextInt();

        sum(num1, num2);
    }

    public static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
