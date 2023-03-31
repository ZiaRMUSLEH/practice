package practices.practice01;

import java.util.Scanner;

public class Q02_Scanner {
    /*
  Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
          First Name: ...
          Last Name : ...
          Age: ...
          Height: ...
          Weight: ...
  Note: Use only one "System.out.println();"

  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        System.out.println("Enter your weight");
        int weight = input.nextInt();

        System.out.println("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Weight: " + weight);

    }
}