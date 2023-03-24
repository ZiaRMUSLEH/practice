package examplesTR;

import java.util.Scanner;

public class TR_09_Switch {
    public static void main(String[] args) {

    /*
        Kullanicidan aldiginiz character'in sesli harf olup olmadigini kontrol eden kodu yaziniz
        Sesli Harfler: a - e - i - o - u
     */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character");
        char c = input.next().charAt(0);

        //1. Way:
        switch (c) {
            case 'a': System.out.println("it is vowel");break;
            case 'e': System.out.println("it is vowel");break;
            case 'i': System.out.println("it is vowel");break;
            case 'o': System.out.println("it is vowel");break;
            case 'u': System.out.println("it is vowel");break;
            case 'A': System.out.println("it is vowel");break;
            case 'E': System.out.println("it is vowel");break;
            case 'I': System.out.println("it is vowel");break;
            case 'O': System.out.println("it is vowel");break;
            case 'U': System.out.println("it is vowel");break;
            default: System.out.println("it is not vowel");}

        //2. Way:
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("it is vowel");break;
            default: System.out.println("it is not vowel");}

        //3. Way:
        System.out.println("enter a character");
        String c1 = input.next().substring(0, 1).toLowerCase();
        switch (c1) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":System.out.println("it is vowel");break;
            default: System.out.println(c+ " is not vowel");}




        }//main

    }//class

