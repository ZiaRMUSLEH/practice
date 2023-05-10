package javaQuestionBank;

import java.util.ArrayList;
import java.util.Scanner;

public class IfStatement {

   /*
         Type code to print
            a) "Winter" for December, January, February
            b) "Spring" for March, April, May
            c) "Summer" for June, July, August
            d) "Fall" for September, October, November
            e) "Invalid month name" for all the others

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a mont name..");

        String monthName = input.next();

        monthName = monthName.substring(0,1).toUpperCase() + monthName.substring(1).toLowerCase();  //  DECEMBER --> December


        if (monthName.equals("December") || monthName.equals("January") || monthName.equals("February")){

            System.out.println(monthName + " is Winter.");

        }

        else if (monthName.equals("March") || monthName.equals("April") || monthName.equals("May")){

            System.out.println(monthName + " is Spring.");

        }

        else if (monthName.equals("June") || monthName.equals("July") || monthName.equals("Agust")){

            System.out.println(monthName + " is Summer.");

        }

        else if (monthName.equals("September") || monthName.equals("October") || monthName.equals("November")){

            System.out.println(monthName + " is Fall.");

        } else {

            System.out.println("Invalid month name.");

        }
 /*

           Example 2:

          Type code to print
          a) "Valid Password" if the password has at least 8 characters different from space
          character
          b) "Do not use space character in password" if the password has any space
          character in any position
          c) "Invalid Password" if a and b conditions are not satisfied
          Note: Be careful about the orders of conditions in the solution
         */


        String pwd = "a2 s22";


        if (pwd.replaceAll("[^\\s]", "").length() > 0) {
            System.out.println("Don't use space character");
        } else if (pwd.replaceAll("[\\s]", "").length() > 7) {

            System.out.println("Valid Password");

        } else {
            System.out.println("Invalid Password");
        }


        /*
            Example 3.

            Type code to print
            a) "Round up by last digit:" and print the rounded value if the last digit is greater than
            or equal to 5
            b) "Round down by last digit" and print the rounded value if the last digit is less than 5

         */

        int i = 126;
        if (i % 10 >= 5) {
            System.out.println("Round up by last digit:" + (i / 10 + 1) * 10);
        } else {
            System.out.println("Round down by last digit:" + (i / 10) * 10);
        }

        /*
            Example 4:

            Type code to print the name of the month when you entered the number of the month.
            Example; For 1 output is "January", for 2 output is "February" etc.

         */

        int numOfMonth = 5;

        if (numOfMonth == 1) {
            System.out.println("January");
        } else if (numOfMonth == 2) {
            System.out.println("February");
        } else if (numOfMonth == 3) {
            System.out.println("March");
        } else if (numOfMonth == 4) {
            System.out.println("April");
        } else if (numOfMonth == 5) {
            System.out.println("May");
        } else if (numOfMonth == 6) {
            System.out.println("June");
        } else if (numOfMonth == 7) {
            System.out.println("July");
        } else if (numOfMonth == 8) {
            System.out.println("August");
        } else if (numOfMonth == 9) {
            System.out.println("September");
        } else if (numOfMonth == 10) {
            System.out.println("October");
        } else if (numOfMonth == 11) {
            System.out.println("November");
        } else if (numOfMonth == 12) {
            System.out.println("December");
        }else {
            System.out.println("Invalid month number");
        }

        /*
            Example 5:

            Type code to print
            a) "Isosceles Triangle" if two sides of a triangle are equal in length.
            b) "Equilateral Triangle" if all sides of a triangle are equal in length.
            c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
         */

        int a = 3;
        int b = 3;
        int c = 3;

        if (a==b && c!=a || a==c && b!=a || b==c && a!=b){
            System.out.println("Isosceles Triangle");
        }else if (a==b && b==c){
            System.out.println("Equilateral Triangle");
        }else {
            System.out.println("Neither isosceles, nor equilateral");
        }

        /*
            Example 6:

            Type code to create a converter which converts mile to km, second to hour, Fahrenheit to
            Celsius. Find the formulas for conversions from Google.

            a) When user entered 10 and mileToKm String, your code should print "16 km"(The
            number will be dynamic) on the console

            b) When user entered 7200 and secondsToHours String, your code should print "2
            Hours"(The number will be dynamic) on the console

            c) When user entered 83 and fahrenheitToCelsius String, your code should print
            "28.3333 Celsius"(The number will be dynamic) on the console
         */

        System.out.println("Type the number you want to convert and than type 'miletokm' or 'secondtohours' or 'ftocelsius'");
        String question = input.nextLine();



        double digits = Double.parseDouble(question.replaceAll("[^0-9]",""));

        double result;

        if (question.toLowerCase().contains("miletokm")){
            result = digits*1.609344;
            System.out.println(result + " Km");
        } else if (question.toLowerCase().contains("secondtohours")) {
            result = (digits/3600);
            System.out.println(result + " Hours");
        } else if (question.toLowerCase().contains("ftocelsius")) {
            result = (digits-32)*5/9;
            System.out.println(result + " Celsius");
        }else {
            System.out.println("Invalid");
        }


  /*
           8)

            Type code to check the format of state abbreviations in the USA
            a) Your code should print "State abbreviations cannot have more than 2 characters" if the
                abbreviation has more than 2 characters  ****
            b) Your code should print "State abbreviations cannot have lowercase characters" if the
                abbreviation has lowercase characters  ***
            c) Your code should print "State abbreviations cannot have characters different from
                letters" if the abbreviation has characters different from letters.
            Note: If the abbreviation has more than 1 error all related error messages should be printed.
            For example; for "fl3" your code should print, "State abbreviations cannot have more than
                         2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
                         cannot have characters different from letters"
         */


        String abbreviation;





        do {

            System.out.println("Type a state abbreviation in the USA");

            abbreviation  = input.nextLine();


            boolean isLengthMoreThanTwo = abbreviation.length() > 2;
            boolean doesHaveLowerCase = abbreviation.replaceAll("[^a-z]", "").length() != 0;  // kucuk harf varsa(0 a esit deilse) true
            boolean doesHaveChar = abbreviation.replaceAll("[a-zA-Z]", "").length() != 0;



            if (!doesHaveChar && !doesHaveLowerCase && !isLengthMoreThanTwo ){
                System.out.println("You're good to go");
                break;

            }



            if (isLengthMoreThanTwo) {
                System.out.println("State abbreviations cannot have more than 2 characters");
            }
            if (doesHaveLowerCase) {
                System.out.println("State abbreviations cannot have lowercase characters");
            }
            if (doesHaveChar) {
                System.out.println("State abbreviations cannot have characters different from letters");
            }




        } while (true);

         /*

        9)

            Type code to create a simple calculator which does addition, subtraction, multiplication,
            and division with any 2 number
            a) When user entered 10.2 and 5 and + sign your code should print "The result is
                15.2" on the console
            b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
                on the console
            c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
                on the console
            d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
                on the console

         */


        String entry;


        double a1;

        double b1;





        do {

            System.out.println("do ur operation in given format ---> Example:(3*5)       type \"quit\" to end.");

            entry = input.nextLine();


            if (entry.replaceAll("[^+*/-]","").length()>1){
                System.out.println("more than one operation, type again");
            }



            else if (entry.contains("+")){
                a1 = Double.parseDouble(entry.split("\\+")[0].trim());
                b1 = Double.parseDouble(entry.split("\\+")[1].trim());
                System.out.println(a1 + b1);
            }


            // 3 - 2

            else if (entry.contains("-")){
                a1 = Double.parseDouble(entry.split("-")[0].trim());
                b1 = Double.parseDouble(entry.split("-")[1].trim());
                System.out.println(a1-b1);
            }

            else if (entry.contains("*")) {
                a1 = Double.parseDouble(entry.split("\\*")[0].trim());
                b1 = Double.parseDouble(entry.split("\\*")[1].trim());
                System.out.println(a1*b1);
            }

            else if (entry.contains("/")) {
                a1 = Double.parseDouble(entry.split("/")[0].trim());
                b1 = Double.parseDouble(entry.split("/")[1].trim());
                System.out.println(a1/b1);
            }


        }while (!entry.equalsIgnoreCase("quit"));

 /*

        10)

            Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
            Invalid BMI value < 0
            Underweight = <18.5
            Normal weight = 18.5–24.9
            Overweight = 25–29.9
            Obesity = BMI of 30 or greater
         */

        double bmi;

        ArrayList<Double> lastEntries = new ArrayList<>();


        do {

            System.out.println("Type your BMI value");
            bmi = input.nextDouble();


            if (bmi==-1){
                break;
            }
            else if (bmi<0){
                System.out.println("Invalid BMI value");
            }else if (bmi<18.5){
                System.out.println("Underweight");
            } else if (bmi>=25 && bmi <30) {
                System.out.println("Overweight");
            } else if (bmi >=30) {
                System.out.println("Obesity");
            } else {
                System.out.println("Normal weight"); // 18.5–24.9
            }

            System.out.println("Type \"-1\" to quit");

            lastEntries.add(bmi);

        }while (true);

        System.out.println(lastEntries);



    }}
