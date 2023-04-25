package javaQuestionBank;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*
        1) Create a String variable for city names which have just a single word.
        Print the city name with the initial is in uppercase and all the other characters
        are in lower cases on the console.
        Example: mIAMI should be printed as Miami
        miami should be printed as Miami
        MIAMI should be printed as Miami
        mIaMi should be printed as Miami etc
         */

        String citynName = "   MIAMI   ";
        String updateCityName = citynName.trim().substring(0,1).toUpperCase()+citynName.trim().substring(1).toLowerCase();
        System.out.println("updateCityName = " + updateCityName);

        //2) Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String first = "Ali Can";
        String second = "Merve Star";
        String third = "Mark Tom";

        int fst = first.replaceAll("\\s", "").length(); // \\s ==> space
        int snd = second.replaceAll(" ", "").length();
        int trd = third.replaceAll(" ", "").length();

        System.out.println("Total number of characters different from space: "+(fst+snd+trd));

        //3) Create a String variable, print the total number of alphabetical and numeric characters in
        //the String on the console.
        //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

        String st ="  Miami 33018!!!  ";
        int numOfChars = st.replaceAll("[^a-zA-Z0-9]", "").length();
        System.out.println("Total num of alphabetical and numeric characters chars:" + numOfChars);

        //4) Create a String variable, print the number of non-digit characters in the String on the
        //console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

        String st4 = "1a3Bcf4!...";
        int numOfNondigitCharacters = st4.replaceAll("[0-9]", "").length();
        System.out.println("Total number of non-digit characters: "+ numOfNondigitCharacters);


    }
}
