package examplesTR;

import java.util.Scanner;

public class TR_03_Scanner {
    public static void main(String[] args) {

        //1. adim: scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);

        // 2. adim: kullaniciya ne istediginize dair masaj veriniz
        System.out.println("please enter your name");

        // 3.adim: uygun methodu kullanarak kullanicinin verdigi datayi memoriye yerlestirin
        String name = input.nextLine();
        System.out.println(name);

        // kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
        System.out.println("Please enter your name");
        String isim1 = input.next();
        System.out.println("Please enter your surname");
        String soyIsim1 = input.next();
        System.out.println(isim1+" "+soyIsim1);

        // kullanicidan adressini aliniz ve ekrana yazdiriniz
        System.out.println("please enter your address");
        input.nextLine();
        String adress1 = input.nextLine();
        System.out.println(adress1);

        // kullaniciden 2 sayi alip dort islem yapin ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        System.out.println("plese enter first number");
        double firstNumber = input.nextDouble();
        System.out.println("plese enter second number");
        double secondNumber = input.nextDouble();
        System.out.println("Add : =" + (firstNumber+secondNumber));
        System.out.println("Subtract : =" + (firstNumber-secondNumber));
        System.out.println("Multiply : =" + (firstNumber*secondNumber));
        System.out.println("Divide : =" + (firstNumber/secondNumber));

        // kullanicidan bir dortgeninin iki kenar uzunlugunu aliniz
        // 1. alanini hesaplayiniz kisa kenar * uzun kenar
        // 2. cevresini hesaplayiniz 2* kisakenar+2*uzunkenar
        System.out.println("please enter short side of the rectangle");
        double shortSide1 = input.nextDouble();
        System.out.println("please enter long side of the rectangle");
        double longSide1 = input.nextDouble();
        System.out.println("area : = "  +(shortSide1*longSide1));
        System.out.println("perimeter : = "  +(shortSide1*2 + longSide1*2));

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini soran bir program yaziniz

        System.out.println("please enter your gender");
        String gender = input.next();

        System.out.println("please enter your name");
        input.nextLine();
        String name1 = input.nextLine();

        System.out.println("please enter your country");
        String country = input.next();

        System.out.println("please enter your age");
        byte age = input.nextByte();

        System.out.println("please enter your height");
        int height = input.nextInt();

        System.out.println("please enter your true if you love your country or false if you don't'");
        boolean country1 = input.nextBoolean();



        System.out.println("gender = " + gender);
        System.out.println("name = " + name1);
        System.out.println("country = " + country);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("country1 = " + country1);




        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve sonrakaminin toplamini
        //ekrana yazdiran programi yaziniz

        //Scanner input = new Scanner (System.in);
        System.out.println("please enter a four digit number");
        int number = input.nextInt();
        int firstDigit = number%10;
        int LastDigit = number/1000;
        System.out.println(firstDigit+LastDigit);







    }//main
}//class
