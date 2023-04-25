package javaQuestionBank;

public class Variables01 {
    public static void main(String[] args) {

        //1) Create double variables for the prices of any 3 items.
        // Print the sum of the prices on the console with a label.

        double shirtPrice = 12.99;
        double hatPrice = 23.99;
        double shoesPrice = 15.99;
        System.out.println("Total price: "+ (shirtPrice+shoesPrice+hatPrice));

        //2) Create a float variable, a long variable, and an integer variable for any 3 items.
        //Print the multiplication of the values on the console with a label.

        float x = 45.23f;
        long y = 18L;
        int z = 54;
        System.out.println("Multiplication: "+x*y*z);

        //3) Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

        int principle = 10000;
        double rate = 5.5;
        int numberOfYear = 3;
        double simpleInterest =  principle*rate*numberOfYear/100;
        System.out.println("The simple interest is = "+ simpleInterest);

        //4) Create a String and two Long variables. Print the sum and the multiplication of the long
        //variables with the String on the console.

        String s = "The result is ";

        long l = 100;
        long l1 = 150;
        System.out.println(s+(l+l1));
        System.out.println(s+(l*l1));

        //5) Create two boolean variables whose values are different and print their values in the same
        //line with a space between two consecutive values.

       boolean isOld = true;
       boolean isNotOld = false;

        System.out.println(isOld+" "+isNotOld);



        //6) Create 3 float variables for the price of a book, notebook, and laptop.
        //Print the total price of 2 books, 4 notebooks and 3 laptops on the console

        float bookPrice = 150f;
        float notebookPrice = 100f;
        float laptopPrice = 1000f;
        float totalPrice = 2*bookPrice +4*notebookPrice+3*laptopPrice;

        System.out.println("The total price is: "+totalPrice);

        //7) Type a code to swap two integers

        int c = 4;
        int d = 5;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        c = c+d;//9

        d = c-d;//4
        c = c-d;//5

        System.out.println("c = " + c);
        System.out.println("d = " + d);




    }


}
