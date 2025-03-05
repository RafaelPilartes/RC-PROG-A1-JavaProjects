import java.util.Scanner;

class inputExample {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number:");
      int num1 = input.nextInt();
      System.out.println("Enter the second number:");
      int num2 = input.nextInt();

      System.out.println("============================");

      int sum = num1 + num2;
      int difference = num1 - num2;
      int product = num1 * num2;
      int quotient = num1 / num2;

      System.out.println("Sum: " + sum);
      System.out.println("Difference: " + difference);
      System.out.println("Product: " + product);
      System.out.println("Quotient: " + quotient);
    }
}