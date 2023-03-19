package examples;
import java.util.Scanner;
public class TR_08_Ternary {
    public static void main(String[] args) {


        //Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 1st number");
        int number1 = input.nextInt();
        System.out.println("please enter 2nd number");
        int number2 = input.nextInt();
        //1. way
         if (number1>number2) {System.out.println(number2);} else {System.out.println(number1);}
        //2. way
        int result = number1<number2? number1 : number2; System.out.println(result);


        //Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yazdirin, degilse ekrana "Pozitif degil"
        // yazdirin
        System.out.println("enter a number");
       int number = input.nextInt();
        //1. way
        if (number<0){System.out.println("Pozitif degil");} else {System.out.println("Pozitif");}
        //2. way
        String result1 = number>0? "Pozitif": "Pozitif degil"; System.out.println(result1);


     /*
        Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
           1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
           2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
     */
        int year = 2004;
        //1.Way: Nested Ternary
        String result2 = year%100==0? (year%400==0?"Leap": "Leap degil") : (year%4==0? "Leap": "Leap degil") ;
        System.out.println(result2);

        //2.Way:

        if (year%100==0){if (year%400==0){System.out.println("Leap");} else {System.out.println("Leap degil");}}
        else if (year%4==0){System.out.println("Leap");} else {System.out.println("Leap degil");}


        //Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
        System.out.println("enter a number");
        int number3 = input.nextInt();
        Object result3 = number3%2==0? number3/2 : "Bu sayi ikiye bolunmez";
        System.out.println(result3);






    }//main
    }//class