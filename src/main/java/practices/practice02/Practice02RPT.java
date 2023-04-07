package practices.practice02;

import java.util.Scanner;

public class Practice02RPT {
    public static void main(String[] args) {
           /*
 A company decided to give bonus of 5% of salary to employee if his/her year of
 service is 5 and more than 5 years.
 Ask user for their salary and year of service and print the net bonus amount.
 If employee can not get bonus, print how many more years he/she should work.

 EXAMPLE:
 INPUT   :   Year    => 4 year service
             Salary  => 4000

 OUTPUT :  You need to work 1 year(s) to get bonus
*/

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your worked year(s)");
        int workedYear = Math.abs(input.nextInt());


        if (workedYear > 4) {
            System.out.println("please enter your salary");
            int salary = Math.abs(input.nextInt());
            System.out.println("your net bonus amount is " + (salary / 100 * 5));
        } else {
            System.out.println("you need to work " + (5 - workedYear) + " years(s) to get bonus");
        }


        /*

     Divide the 2-word name and surname you will receive from the user into 2 separate words.
     Print the name and surname on the screen separately.
     eg:
     Input: John doe
     Name: John
     Surname: Doe

         */


        System.out.println("please enter your name and surname");
        String nmAndSrnm = input.nextLine();
        String name = nmAndSrnm.replaceAll("[^A-Za-z ]", "").replaceAll("\\s+", " ")
                .trim().substring(0, 1).toUpperCase() + nmAndSrnm.trim().replaceAll("[^A-Za-z ]", "")
                .replaceAll("\\s+", " ").split(" ")[0].substring(1).toLowerCase();

        String surname = nmAndSrnm.replaceAll("[^A-Za-z ]", "").replaceAll("\\s+", " ")
                .trim().split(" ")[1].substring(0, 1).toUpperCase() + nmAndSrnm.trim().replaceAll("[^A-Za-z ]", "")
                .replaceAll("\\s+", " ").split(" ")[1].substring(1).toLowerCase();
        System.out.println("Name: " + name + "\nSurname: " + surname);


        /*
 Type code to ask user to enter the number of row
 and print the shape below according to that number:

  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
  16 17 18 19 20 21

  */

        System.out.println("please enter row number");
        int row = input.nextInt();
        int number = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }


    }

}
