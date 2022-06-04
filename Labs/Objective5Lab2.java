import java.util.Scanner;

public class Objective5Lab2 {
  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Scanner keyboard = new Scanner(System.in);

    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    if(string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else if(string1.equals(string3)) {
      System.out.println(string1 + " is not equivalent to " + string2);
    scanner.close();
    }
  }
}
