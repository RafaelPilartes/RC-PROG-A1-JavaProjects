class ConvertLongToString {
  public static void main(String[] args) {
    long number = 1234567890L;

    String strNumber = String.valueOf(number);
    System.out.println(strNumber);

    long longNumber = Long.parseLong(strNumber);
    System.out.println(longNumber);
  }
}