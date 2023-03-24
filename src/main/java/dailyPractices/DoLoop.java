package dailyPractices;

import java.util.Scanner;

public class DoLoop {
    public static void main(String[] args) {
        //1. 9 den 190 e kadar 7 nin kati olan tum tamsyilari ekrana yazdirniz.
        int num = 9;
        do {
            if (num%7==0){
                System.out.println(num);
            }

        num++;
        }
        while (num<=190);

        //2. 'm' harfinden baslayarak 'c' harfine kadar tum harflari yazdirin.
        char harf = 'm';
        do {
            System.out.println(harf);
            harf--;
        }
        while (harf>='c');


        //3. Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
        //Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin oplaminin kac
        // oldugunu yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a positive number to add, to stop press '0' ");
        int add = 0;
        int counter = 0;
        do {int num3 = input.nextInt();
            if (num3 ==0){break;}
            else {
            add = add + num3;
            counter++;}
        }
        while (true); System.out.println( "Total of "+counter+" Integers is = "+add);


        //4. Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve "Negative sayi giremezsiniz"
        // yazdirip basa donun
        // Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negatif sayi girdigini ve
        // girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        System.out.println("please enter a positive number to add, to stop press '0' ");
        int negativeCounter = 0;
        int positiveCounter = 0;
        int result = 0;
        do {int num4 = input.nextInt();

            if (num4 == 0) {
                break;
            } else if (num4 <0){
                System.out.println("you can not enter Negative number");negativeCounter++; continue;

            } else {positiveCounter++; result= result+num4; }
        }
        while (true);
        System.out.println("you have entered " + positiveCounter+ " positive number(s)" + "\n" +
                "you have entered " + negativeCounter+ " negative number(s)"+" \ntotal of positive numbers are "
                 + result);



       /* 5. Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki
         hatalari yazdirin.
         kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre gir diginde
         "Sifreniz Kabul edilmistir" yazdirin.
         - Sifre kucuk harf icermelidir
         - sifre buyuk harf icermelidir
         - sifre ozel karakter icermelidir
         - sifre en az 8 karakter olmalidir.

        */

        do {
            System.out.println("please enter your password");
            String pwd = input.next();
            boolean kucukHarf = pwd.replaceAll("[^a-z]", "").length()>0;
            boolean buyukHarf = pwd.replaceAll("[^A-Z]", "").length()>0;
            boolean ozelKarakter = pwd.replaceAll("[^\\p{P}]", "").length()>0;
            boolean karakter = pwd.length()>=8;

            if (kucukHarf && buyukHarf && ozelKarakter && karakter){
                System.out.println("Your password is accepted"); break;
            } else {
                System.out.println("Incorrect Password");
            }

        }
        while (true);

        //6. Kullanicidan toplamak icin sayi isteyin ve toplam 500'e ulasincaya kadar devam istemeyi ettirin.
        // toplam 500'e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.


        int total = 0;
        int counter3 = 0;

        do{
            System.out.println("please enter a number");
            int num5 = input.nextInt();
            total=total+num5;
            counter3++;

        }
        while (total<500);
        System.out.println("you entered "+ counter3 + " numbers, and total is "+total);











    }//main
}//class
