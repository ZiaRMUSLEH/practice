package javaQuestionBank;

public class WrapperClasses01 {
    public static void main(String[] args) {

        //1) Type a code to find the sum of the minimum value of the byte and the maximum value of
        //short data types.

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println("result: "+(min+max));

        //2) Type a code to convert “103” String to byte and to convert “2351” String to short then print
        //the difference on the console.

        String s = "103";
        String str = "2351";

        byte sByte = Byte.valueOf(s);
        short strShort = Short.valueOf(str);
        System.out.println("Difference: "+(strShort-sByte));

        /*
        3) What are the differences between valueOf(String s) and parseByte(String s) methods?

        parseByte() returns primitive integer type (int), whereas valueOf() returns java.lang.Integer, which
        is the object representative of the integer. There are circumstances where you might want an Integer object,
         instead of a primitive type.
        Of course, another obvious difference is that valueOf() is an instance method whereas parseByte()
        is a static method.
         */

    }
}
