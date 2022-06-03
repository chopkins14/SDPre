import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int age = 0, currentYear = 2022;

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    int birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
