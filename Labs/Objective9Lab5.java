import java.util.Scanner;

public class Objective9Lab5 {

public static void printMenu(String[] args) {
}

  public static void printMenu(); {
      System.out.println();
      System.out.println("========= MENU =========");
      System.out.println("|                      |");
      System.out.println("|   1. Add Numbers     |");
      System.out.println("|   2. Find Average    |");
      System.out.println("|   3. Calculate Tax   |");
      System.out.println("|   4. Exit            |");
      System.out.println("|                      |");
      System.out.println("========================");
      System.out.println();
    while (true) {
        System.out.print("Which would you like to do? ");
        System.out.print("Please give me a number: ");
        num1 = kb.nextDouble();
        System.out.print("Please give me another number: ");
        num2 = kb.nextDouble();
        double choice = kb.nextdouble();
        double average = (num1 + num2) / 2;
        double sum = num1 + num2;
        double calcTax = sum * (8.31/100);
        double num1, num2;
        double answer = 0.0;
        Scanner kb = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println(+num1 + " + " + num2 + " = " + sum + ".");
                break;
            case 2:
                System.out.println("The average of " + num1 + "and" + num2 + "is" + average + ".");
                break;
            case 3:
                System.out.println("The amount in tax to be collected from a purchace of " + num1 + " and " + num2 + " is " + calcTax + ".");
                break;
            case 4:
                System.out.println("You've chosen to quit.");
                return;
            default:
                System.out.println("Invalid entry. Please try again."); }
      }
    }
  }
