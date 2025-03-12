
package com.mycompany.methodgreeting;
import java.util.Scanner;

public class MethodGreeting {

    public static void main(String[] args) {
        String yourName;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you name: ");
        yourName = input.nextLine();
        
        greeting(yourName);
    }
    
    public static void greeting(String name) {
        System.out.println("Hello " + name + ", goodmorning");
    }
}
