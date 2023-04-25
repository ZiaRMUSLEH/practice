package tekrar;

import java.util.Scanner;

public class TR_07_IfStatementTKRR {
    public static void main(String[] args) {



        // Ex: Verilen bir karakterin buyuk harf ise ekrana
        // "Buyuk Harf " yazdiran kodu yaziniz"
       char harf = 's';
       if ('A'<=harf && harf<='Z'){System.out.println("Buyuk Harf ");}




        // Ex: Verilen sayi cift sayi ise ekrana "Cift Sayi " yazdiran kodu yaziniz
        int number = 44;
        if (number%2==0) {System.out.println("Cift Sayi ");}



        // Ex Verilen bir sayi 300'den kucuk veya 1200 'den buyuk
        // ise "Harika Sayi" yazdiran kodu yaziniz
        int number1 = 1201;
        if (number1<300 || number1>1200) {System.out.println("Harika Sayi");}


        // Ex : Kullanicidan alinan Datanin Tekmi; CiftMi? oldugunu yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number2 = input.nextInt();
         //1. Way   if Statement
        if (number2%2==0){System.out.println("Cift");}
        if (number2%2!=0){System.out.println("Tek");}


        // 2.Yol If Else
        if (number2%2==0){System.out.println("Cift");}
        else {System.out.println("Tek");}


        // Ex : Verilen bir sayinin negatif mi ,
        // pozitif mi , notr mu oldugunu soyleyen kodu yaziniz
        int number3 = 0;
        if (number3<0){System.out.println("negatif");
        } else if (number3>0) {System.out.println("pozitif");
        } else {System.out.println("notr");}

        // INTERWIEW QUESTINS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        String y ="abbccdc";

         if (y.indexOf('a')==y.lastIndexOf('a')){System.out.println("a");}
         if (y.indexOf('b')==y.lastIndexOf('b')){System.out.println("b");}
         if (y.indexOf('c')==y.lastIndexOf('c')){System.out.println("c");}
        if (y.indexOf('d')==y.lastIndexOf('d')){System.out.println("d");}

        // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz

        System.out.println("please enter a number");
        double number4 = input.nextDouble();
        if (number4>0.0) {System.out.println("Sayi Pozitif ");}


        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
        //Rakamlar 0 1 2 3 4 5 6 7 8 9

        System.out.println("please enter a number");
        int number5 = input.nextInt();
        if (number5>=0 && number5<10) {System.out.println("Verilen Data Rakamdir");}



        // Ex : Sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz
        int sayi = -100;// Ekrana "Verilen Data 3 Basamaklidir"
        sayi = Math.abs(sayi);
        if (99<sayi && sayi<1000){System.out.println("Verilen Data 3 Basamaklidir");}



    }// main
}//