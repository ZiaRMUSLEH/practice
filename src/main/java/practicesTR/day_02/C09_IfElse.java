package practicesTR.day_02;

import java.util.Scanner;

public class C09_IfElse {
    public static void main(String[] args) {

/*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */


        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();
        if (sayi<0){System.out.println("Negative sayi");}
    else { if (sayi<10){System.out.println("Pozitive Rakam");}
        else {System.out.println("Pozitive Sayi");}}

    }//main
}//class
