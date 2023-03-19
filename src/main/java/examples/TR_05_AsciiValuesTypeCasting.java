package examples;

public class TR_05_AsciiValuesTypeCasting {
    public static void main(String[] args) {

        // 'A' karakterinin Ascii degerini hesaplatan kodu yaziniz
        //1.way
        char a = 'a';
        System.out.println("asci value of 'a' is : " + (a+0));
        //2.way
        int a1 = 'a';
        System.out.println("asci value of 'a' is : " + (a1));
        // long data type'inin short'a cevirelim
        long a2 = 56464654564L;
        short shorta2 = (short) a2;
        System.out.println("shorta2 = " + shorta2);

        // int data type'inin float data type'ina ceviriniz
        int a3 = 46464564;
        float floata3 = a3;
        System.out.println("floata3 = " + floata3);



        // short data type'inin byte data type'ina cevirelim
        short x = 12698;
        byte bx = (byte) x;
        System.out.println(bx);

        byte bmax = Byte.MAX_VALUE;
        System.out.println(bmax);
        short shMax = Short.MAX_VALUE;
        System.out.println(shMax);




    }//mian
}//class
