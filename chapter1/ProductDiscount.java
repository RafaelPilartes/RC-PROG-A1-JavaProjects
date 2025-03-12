import java.util.Scanner;

class ProductDiscount{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the price of the product: ");
      String productPriceStr = input.nextLine();
      
      System.out.println("Enter the discount: ");
      int discount = input.nextInt();

      double productPriceDouble = Double.parseDouble(productPriceStr);
      double result = productPriceDouble - (productPriceDouble * discount / 100);

      System.out.println("Disconted price = " + result);
  }
}