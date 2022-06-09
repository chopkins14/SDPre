import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    printMenu();
      }

  public static void printMenu() {
    Scanner scanner = new Scanner(System.in);
    int selection;
    do{
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
    selection = Integer.parseInt(scanner.nextLine());
      switch(selection) {
        case 1:
          System.out.println("Hello Human");
          break;
        case 2:
          System.out.println("Apples, Bananas, Coconuts");
          break;
        case 3:
          System.out.println("Goodbye");
          System.exit(0);
          return;
        default:
          System.out.println("Invalid Input");
          selection = scanner.nextInt();
        }
        }
        while(selection != 3);
        scanner.close();
      }
    }
