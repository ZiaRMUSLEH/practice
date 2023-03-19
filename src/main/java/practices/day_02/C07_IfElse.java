package practices.day_02;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("birnci sayiyi giriniz...");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz...");
        int sayi2 = input.nextInt();

        if (sayi1>sayi2) {
            System.out.println("ilk sayi buyuktur");
        } else {
            System.out.println("ikinci sayi buyuktur");
        }




    }//main
}//class
