package practicesesstions.practice01;

import java.util.Scanner;

public class Practice01RPT {
    public static void main(String[] args) {

        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int x = 12345;
        System.out.println((x/10000)+"\n"+(x/1000%10)+"\n"+(x/100%10)+"\n"+(x/10%10)+"\n"+(x%10));

          /*
  Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
          First Name: ...
          Last Name : ...
          Age: ...
          Height: ...
          Weight: ...
  Note: Use only one "System.out.println();"

  */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first name"); String firstName = input.next();
        System.out.println("please enter your last name"); String lastName = input.next();
        System.out.println("please enter your age"); byte age = input.nextByte();
        System.out.println("please enter your weight"); double weight = input.nextDouble();
        System.out.println("please enter your height"); double height = input.nextDouble();

        System.out.println("First Name: "+firstName+ "\n " + "Last Name : "
                +lastName+"\n" + "Age: "+age+"\n" + "Weight: "+weight+"\n" + "Height: "+height);

        //Type a code that calculates the hypotenuse.
        System.out.println("please enter length of a side"); double a = input.nextDouble();
        System.out.println("please enter length of b side"); double b = input.nextDouble();
        double c = Math.sqrt(a*a+b*b);
        System.out.println("hypotenuse = "+c);

        

    }
}
