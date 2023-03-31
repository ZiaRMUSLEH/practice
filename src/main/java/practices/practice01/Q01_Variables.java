package practices.practice01;

public class Q01_Variables {
    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use / and %
    // x: input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5
    public static void main(String[] args) {

        int x = 12345;
        int ones = x % 10;
        int tens = (x / 10) % 10;
        int hundreds = (x / 100) % 10;
        int thousends = (x / 1000) % 10;
        int tenThousends = (x / 10000) % 10;

        System.out.println("x = " + x);
        System.out.println(tenThousends + "\n" + thousends + "\n" + hundreds + "\n" + tens + "\n" + ones);
    }
}