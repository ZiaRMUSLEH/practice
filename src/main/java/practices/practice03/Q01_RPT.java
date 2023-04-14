package practices.practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01_RPT {
    public static void main(String[] args) {

        // Get as many grades as a teacher wants to enter, and find the number of students who pass the average.

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int numberOfPassedStudents =0;
        int sum = 0;

        do {System.out.println("enter student's grade");
            grades.add(input.nextInt());
            System.out.println("do you want to continue (Y/N)");
            String condition = input.next();
            if (condition.equalsIgnoreCase("n"))
            {break;}
            }
        while (true);

        for (Integer w:grades){
        sum=sum+w;}
        double average = sum/grades.size();
            for (Integer w : grades)
            { if (w>average){numberOfPassedStudents++;}}

        System.out.println("Entered grades = "+grades);
        System.out.println("Average = " + average);
        System.out.println("numberOfPassedStudents = " + numberOfPassedStudents);

    }
}
