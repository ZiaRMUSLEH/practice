package miniprojects;

import java.util.Arrays;
import java.util.Scanner;

public class MiniProjects {
    public static void main(String[] args) {


        //1.
        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        String tv = "599.99$";
        String laptop = "299.99$";
        String tv1 = tv.replace("$", "");
        String laptop1 = laptop.replace("$", "");
        double sum = Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("total of tv and laptop = " + (sum) + "$");


        //2.  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
                  A
                 A A
                A A A
         */
        System.out.println(" "+" "+"A"+" "+" ");
        System.out.println(" "+"A"+" "+"A"+" ");
        System.out.println("A"+" "+"A"+" "+"A");

        //3. Kullanicidan alacagınız 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazidiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a five digit number");
        int number2 = input.nextInt();

        int frst = number2%10;
        int snd = number2/10%10;
        int frth = number2/1000%10;
        int ffth = number2/10000;

        System.out.println(frst+snd+frth+ffth);




        //4.
        String tamIsim = "  mehmet fatih  ";
        // Verilen tamIsim String'inin icindeki ilk ismin
        // ilk harfiyle son ismin ilk harfini buyuk harf
        // olarak yan yana yazdiriniz    ==>MF
        char ilkIsminIlkHarfi = tamIsim.toUpperCase().trim().charAt(0);
        //char sonIsminIlkHarfi = tamIsim.toUpperCase().trim().split(" ")[1].charAt(0);-------------

       char sonIsminIlkHarfi = tamIsim.toUpperCase().trim().charAt(tamIsim.trim().indexOf(" ")+1);
        System.out.println("sonuc: "+ilkIsminIlkHarfi+sonIsminIlkHarfi);

        //5.
        /*
        Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

                i) En az 8 karakterden olussun
                ii)Password space icermesin
                iii)En az 1 tane buyuk harf olsun
                iv) En az 1 tane kucuk harf olsun
                v) En az 1 tane sembol olsun
                vi) En az 1 tanede rakam olsun
                */

        System.out.println("please enter Password as below :" +
                " i) En az 8 karakterden olussun\n" +
                "                ii)Password space icermesin\n" +
                "                iii)En az 1 tane buyuk harf olsun\n" +
                "                iv) En az 1 tane kucuk harf olsun\n" +
                "                v) En az 1 tane sembol olsun\n" +
                "                vi) En az 1 tanede rakam olsun ");

        String pwd = input.next();
        boolean i =  pwd.length()>=8;
        boolean ii = !pwd.contains(" ");
        boolean iii = pwd.replaceAll("[^A-Z]", "").length()>0;
        boolean iv = pwd.replaceAll("[^a-z]", "").length()>0;
        boolean v = pwd.replaceAll("[^\\p{Punct}]", "").length()>0;
        boolean vi = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(i&&ii&&iii&&iv&&v&&vi);




        //6.
         /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */

        System.out.println("Lutfen mail adresinizi\ni)mail adresi \"gmail\" icermeli\n" +
                "               ii)Space characteri mail'de olmamali\n" +
                "               iii)mail adresinde buyuk harf olmamali\n" +
                "               iv)En az bir tane noktalama isareti bulunmali\nveriniz ");
        String mail =input.nextLine();

        //   i)mail adresi "gmail" icermeli
        boolean first= mail.contains("gmail");
        System.out.println("gmail icermeli = " + first);


        // ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("space olmamali = " + second);

        //iii)mail adresinde buyuk harf olmamali
        boolean third = mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replace(" ","").length()==0;
        System.out.println("third = " + third);

        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").
                replace(" ","").
                length()>0;
        System.out.println("fourth = " + fourth);

        boolean fourth1 = mail.replaceAll("[^\\p{Punct}]","").//[^\p{Punct}] semboller haric herseyi sil
                length()>0;
        System.out.println("fourth1 = " + fourth1);

        boolean fourth2 = mail.replaceAll("[\\P{P}]","").// [\\P{P}] semboller haric herseyi sil
                length()>0;
        System.out.println("fourth2 = " + fourth2);
        System.out.println(first && second && third && fourth);




        //7.
        // Kullanici gun ismini girsin kod gunu yazsin
        // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
        // 5== Persembe  6 == Cuma  7 == Cumartesi

        System.out.println("Lutfen gun numarasini giriniz\n " +
                "1 ==> Pazar 2 ==>Pazartesi  " +
                "3 ==>Sali  4==>Carsamba\n" +
                "5==> Persembe  6 ==>Cuma " +
                " 7 ==>Cumartesi");

        byte gunNo = input.nextByte();

        if(gunNo ==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3){
            System.out.println("Sali");
        }else if(gunNo==4){
            System.out.println("Carsamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        }else if (gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Lutfen gecerli bir rakam giriniz." +
                    "\"1 ==> Pazar " +
                    "2 ==>Pazartesi   +\n" +
                    "3 ==>Sali  4==>Carsamba\n +\n" +
                    "5==> Persembe  6 ==>Cuma  +\n" +
                    "7\" ==>Cumartesi");
        }

        //8.
        /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
       Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
       Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.
     */
    /*
        1)"If" icinde "if" kullanirsaniz, "nested if" olusturmussunuz demektir.
        2)"nested if" Java'yi yavaslatir bu yuzden mecbur kalmadikca kullanmayiz.
        3)"nested if" gibi Java'yi yavaslatan kodlar "Time Consuming" olarak adlandirilir.
     */


        System.out.println("please enter your age");
        byte age = input.nextByte();
        System.out.println("please enter your gender");
        String gender = input.next();
        if (age>0 && age<120 && (gender.equalsIgnoreCase("male")
                || gender.equalsIgnoreCase("female"))){
            if (gender.equalsIgnoreCase("male")){
                if (age>65){
                    System.out.println("can be retired");
                } else {
                    System.out.println("should work");
                }
            } else if (gender.equalsIgnoreCase("female")){
                if (age>60){
                    System.out.println("can be retired");
                } else {
                    System.out.println("should work");
                }
            } else {
                System.out.println("invalid gender");
            }} else {
            System.out.println("invalid age or gender");
        }



        //9.
        //kullanici gun ismi girsin, konsola haftanin kacinci gun oldugunu console'a yazdiran kodu yaziniz.
        System.out.println("Please enter a day name...");
        //String dayName = input.next();

        //1.Way
        /* if (dayName.equalsIgnoreCase("monday")){System.out.println("1");}
        else if (dayName.equalsIgnoreCase("tuesday")){System.out.println("2");}
        else if (dayName.equalsIgnoreCase("wednesday")){System.out.println("3");}
        else if (dayName.equalsIgnoreCase("thursday")){System.out.println("4");}
        else if (dayName.equalsIgnoreCase("friday")){System.out.println("5");}
        else if (dayName.equalsIgnoreCase("saturday")){System.out.println("6");}
        else if (dayName.equalsIgnoreCase("sunday")){System.out.println("7");}
        else {System.out.println("invalid day name");}*/

        //2.Way
        String dayName = input.next().toLowerCase();
        switch (dayName){
            case "monday": System.out.println("1"); break;
            case "tuesday": System.out.println("2"); break;
            case "wednesday": System.out.println("3");break;
            case "thursday": System.out.println("4");break;
            case "friday": System.out.println("5");break;
            case "saturday": System.out.println("6");break;
            case "sunday": System.out.println("7");break;
            default: System.out.println("invalid day name");
        }

        //10.
        /*
       kullanici Ay numarasi verildiginde numarasi verilen ay'in ismini ve December'a kadarki tum
         aylarin isimlerini console'a yazdiran kodu yaziniz.
     */
    /*
        Note: switch parentezi icinde "String", "int", "byte", "short" ve "char" kullanilabilir.
              "boolean", "float", "double", "long"
     */


            int monthNumber = 23;

            switch(monthNumber){

                case 1:
                    System.out.println("January");
                    //break;
                case 2:
                    System.out.println("February");
                    //break;
                case 3:
                    System.out.println("March");
                    //break;
                case 4:
                    System.out.println("April");
                    //break;
                case 5:
                    System.out.println("May");
                    //break;
                case 6:
                    System.out.println("June");
                    //break;
                case 7:
                    System.out.println("July");
                    //break;
                case 8:
                    System.out.println("August");
                    //break;
                case 9:
                    System.out.println("September");
                    //break;
                case 10:
                    System.out.println("October");
                    //break;
                case 11:
                    System.out.println("November");
                    //break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid month number");
            }

        //11.
        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
        //3 kereye kadar yanlis girerse "Invalid username or password, try again" mesaji alsin
        //Dogru girerse "Welcome to your account" mesaji alsin

        String username = "zia";
        String password = "123";

        int counter = 0;
        do {
            if (counter== 3){
                System.out.println("Your account was blocked"); break;
            } else {
                System.out.println("please enter your username");
                String user = input.next();
                System.out.println("please enter your password");
                String pass = input.next();
                if (user.equals(username) && pass.equals(password)){
                    System.out.println("Welcome to your account"); break;
                } else {
                    System.out.println( (counter+1)+ " Invalid username or password, try again");
                    counter++;
                }

            } }while (true);



        //12.
        //Kullanici bir sayi girsin, sayi 100 den kucuk ise kullanici "Kazandiniz" mesaji alsin
        //diger durumlarda "Kaybettiniz" mesaji alsin

        do {
            System.out.println("enter a number");
            int number = input.nextInt();
            if (number<100){
                System.out.println("you won!");}
            else {
                System.out.println("you lost!"); break;
            }

        } while (true);


        //13.
         /*
         Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
         */
        for (int i6 = 1; i6<=5; i6++){
            for (int j = 1; j<=i6; j++){
                System.out.print(j+" ");
            }System.out.println();
        }

        //14.
        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
        // kullanici data girmeyi durdurmak icin "q" harfini bassin.

        //1. way
        System.out.println("enter the number of students");
        int numberOfStd  = input.nextInt();
        String studentNames [] = new String [numberOfStd];

        for (int i1 = 0; i1 <studentNames.length; i1++) {
            System.out.println("enter "+(i1+1)+ " student name or to stop press 'q'");
            String name = input.next();
            if (name.equalsIgnoreCase("q")) {break;}
            else {studentNames [i1] = name;
            }
        }System.out.println(Arrays.toString(studentNames));

        //2,way

        int indx = 0;

        System.out.println(" enter the no of students");
        int noOfStudent= input.nextInt();
        String student[] = new String [noOfStudent];

        do { System.out.println("please enter the name of student " + (indx + 1)+" to stop press  'q'" );
            String name = input.next();
            if (name.equalsIgnoreCase("q")){System.out.println("see you again"); break;}
            else {student[indx] = name;
                indx++;}}
        while (indx<noOfStudent);
        System.out.println(Arrays.toString(student));


        //15.
        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin

        //1)Kullanicidan data almak icin Scanner object olustur
        //2)Kullanicidan yapacagi islemi almaliyiz
        // 3)Kullanicidan iki tane sayi almaliyiz
        // 4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim




        do{System.out.println("please enter the operation you want to do or press 'q' to stop");
            char opr = input.next().charAt(0);
            if (opr == 'q'){
                System.out.println("see you again"); break;} else if (opr == '+' || opr == '-' || opr == '*' || opr == '/'){
                System.out.println("please enter the first number");
                int num1 = input.nextInt();
                System.out.println("please enter the second number");
                int num2 = input.nextInt();
                switch (opr){
                    case '+':
                        System.out.println("Adding operation: = "+ (num1 + num2)); break;
                    case '-':
                        System.out.println("Subtracting operation: = "+ (num1 - num2));break;
                    case '*':
                        System.out.println("Multiplying operation: = "+ (num1 * num2));break;
                    case '/':
                        System.out.println("Dividing operation: = "+ (num1 / num2));break;

                }
            } else {System.out.println("invalid operation");}} while (true);










    }//main


}//class
