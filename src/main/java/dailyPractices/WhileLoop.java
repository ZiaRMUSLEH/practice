package dailyPractices;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // While loop
        //1. While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrena yazdiriniz.
        int i1 = 3;
        while (i1<=13){
            if (i1%2!=0){
                System.out.println(i1);
            }
            i1++;
        }

        //2. For loop ve While loop kullanarak 3 bsamakli sayilardan 15, 20 ve 90'na tam bolunebilen sayilari yazdirin.
        for (int i = 100; i<=999;i++) {
            while (i%15==0 || i%20==0 || i%90 ==0){
                System.out.println(i);
                i++; }
        }
        //3. Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri dahil aradalarindaki
        // tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the start number");
        int start = input.nextInt();
        System.out.println("enter the final number");
        int fnal = input.nextInt();

        while (start<=fnal){
            if (start%2==0){
                System.out.println(start);
            }
            start++;
        }

        //4. Kullanicidan baslangic ve bitis harflarini alin ve Baslangic harfinden baslayip bitis harfinde biten
        // tum harflari buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.

        System.out.println("please enter the first Alphabet");
        char frstAlphabet = input.next().charAt(0);
        System.out.println("please enter the last Alphabet");
        char lstAlphabet = input.next().charAt(0);
        String result1 = "";

        for (char i = frstAlphabet; i<=lstAlphabet; i++ ){
            result1 = result1+i;
        }
        System.out.println(result1.toUpperCase());

        //5. Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin.
        // Kullanicinin hata yapmadigini farz edin.

        System.out.println("please enter a number to make its multiply chart");
        int num2 = input.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(num2 + " x "+i+" = "+ (num2*i));

            i++;}

        // 6. Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini
        // ekranda yazdirin

        System.out.println("please enter an Integer");
        int num3 = input.nextInt();
        int counter = 0;
        int i4 = 1;
        while (i4<=num3){
            if (num3%i4==0){
                System.out.println(i4);
                counter++;
            }
            i4++;
        }
       System.out.println(num3 + " is dividable by "+counter+" numbers");

        //7. Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        System.out.println("please enter an Integer");
        int num4 = input.nextInt();
        int sumNum4Digits =0;
        while (num4>0){
            sumNum4Digits = sumNum4Digits+ num4%10;

            num4 = num4/10;
        }
        System.out.println("sumNum4Digits = " + sumNum4Digits);


    }//main
}//class
