import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int userSelection;

    do{
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      userSelection = scanner.nextInt();

      switch(userSelection) {
          case 1:
            System.out.println("Hello Human");
            break;
          case 2:
            System.out.println("Apples, Bananas, Coconuts");
            break;
          case 3:
            System.out.println("Goodbye");
            System.exit(0);
          default:
            System.out.println("Invalid Input");
    }

    }
    while(userSelection != 0);

    scanner.close();
  }
}
