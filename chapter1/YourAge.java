import java.util.Scanner;

class YourAge {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How old are you?");
    String strAge = scanner.nextLine();
    int intAge = Integer.parseInt(strAge);

    System.out.println("You are " + intAge + " years old.");  
  }
}