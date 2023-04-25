package javaQuestionBank;

public class TypeCasting01 {
    public static void main(String[] args) {
        //1) Create a short variable and convert it to an int variable.

        short age = 3454;
        int newAge = age;

        //2) Create a long variable and convert it to an int variable.

        long age1 = 12l;
        int newAge1 = (int) age1;

        //3) Create a double variable and convert it to a float variable

        double price = 45.23;
        float newPrice = (float) price;

        //4) Create a double variable and convert it to a short variable, then print the value of the short
        //variable on the console. Be careful about the output, it will not be a decimal value

        double price1 = 45.12;
        short newPrice1 = (short) price1;
        System.out.println("newPrice1 = " + newPrice1);

        //5) Create a byte variable and convert it to a double variable, then print the value of the double
        //variable on the console. Be careful about the output, it will be a decimal number.

        byte age2 = 45;
        double newAge2 = age2;
        System.out.println("newAge2 = " + newAge2);




    }
}
