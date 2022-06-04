import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {

      java.util.Scanner scanner = new java.util.Scanner(System.in);
      Scanner keyboard = new Scanner(System.in);

      int userNum = 0;

      System.out.println("Please enter a number: ");
      userNum = keyboard.nextInt();

      if(userNum % 2 == 0){
        System.out.println("The number is even");
      }
        else if(userNum % 2 != 0){
          System.out.println("The number is odd");

      scanner.close();
        }
      }
}
