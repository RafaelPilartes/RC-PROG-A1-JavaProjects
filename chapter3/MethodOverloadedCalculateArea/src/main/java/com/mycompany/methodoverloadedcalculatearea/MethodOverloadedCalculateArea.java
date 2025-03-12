

package com.mycompany.methodoverloadedcalculatearea;
import java.util.Scanner;

public class MethodOverloadedCalculateArea {

    public static void main(String[] args) {
        double radius;
        double length;
        double width;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();

        System.out.println("The area of the circle is " + calculateArea(radius));
        
        System.out.println("==================================================");

        System.out.println("Enter the length of the rectangle: ");
        length = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextDouble();
        System.out.println("The area of the rectangle is " + calculateArea(length, width)); 
    }
    
    public static double calculateArea(double radius) {
        double PI = 3.14159;

        double area = PI * radius * radius;
        return area;
    }
    
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
    
}

