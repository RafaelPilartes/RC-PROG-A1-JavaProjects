
package com.mycompany.methodcelsiustofahrenheit;
import java.util.Scanner;

public class MethodCelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the temperature in celsius: ");
        celsius = input.nextDouble();
        
        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("The temperature in fahrenheit is " + fahrenheit + "ºF");
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
