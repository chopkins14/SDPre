import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Scanner keyboard = new Scanner(System.in);
    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

      System.out.print("Please enter the first whole number you would like to add.");
      num1 = keyboard.nextInt();
      System.out.println(num1);

      System.out.print("Please enter the second whole number you would like to add.");
      num2 = keyboard.nextInt();
      System.out.println(num2);

      System.out.print("Please enter the third whole number you would like to add.");
      num3 = keyboard.nextInt();
      System.out.println(num3);

      System.out.print("Please enter the first decimal number you would like to add.");
      dub1 = keyboard.nextDouble();
      System.out.println(dub1);

      System.out.print("Please enter the second decimal number you would like to add.");
      dub2 = keyboard.nextDouble();
      System.out.println(dub2);

      System.out.print("Please enter in the thrid decimal number you would like to add.");
      dub3 = keyboard.nextDouble();
      System.out.println(dub3);

      int product = num1 + num2 + num3;
      double productdub = dub1 + dub2 + dub3;

      System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + product);
      System.out.print("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + productdub);

    scanner.close();

    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
