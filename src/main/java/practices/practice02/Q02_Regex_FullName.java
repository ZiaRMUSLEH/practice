package practices.practice02;

import java.util.Scanner;

public class Q02_Regex_FullName {
    /*

     Divide the 2-word name and surname you will receive from the user into 2 separate words.
     Print the name and surname on the screen separately.
     eg:
     Input: John doe
     Name: John
     Surname: Doe

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstname and lastname with a space between them");
        String fullName = scanner.nextLine().replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim();// '\\s+' ==> One or more spaces

        String name = fullName.split(" ")[0].substring(0, 1).toUpperCase() + fullName.split(" ")[0].substring(1).toLowerCase();
        String surName = fullName.split(" ")[1].substring(0, 1).toUpperCase() + fullName.split(" ")[1].substring(1).toLowerCase();

        System.out.println("Name: " + name + "\nSurname: " + surName);




    }

}