package examples;

import java.util.Scanner;

public class TR_10_Loops {

    public static void main(String[] args) {


        //4'den 24'e kadar tum tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
        for (int i = 4; i<25; i++){System.out.print(i+ " ");}

        //33'den 11'e kadar tum cift tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
        for (int i = 33; i>=11; i--){if (i%2==0){System.out.print(i+" ");}}

        //20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
        for (int i = 20; i<=74; i++){if (i%2!=0){System.out.print(i+" ");}}

        //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz
        String word = "Massachusetts";

        for (int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                System.out.println(c);
            }}

        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for (int i = 21; i<=180; i++){if (i%4==0 && i%6==0){System.out.println(i);}}



        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe
        // donusturunuz
        //miami ==> MiAmI
        String a = "miami";
        for (int o = 0; o <a.length(); o++) {
            String y = a.substring(o, o + 1);
            if (o%2==0){
                System.out.print(y.toUpperCase());
            } else {
                System.out.print(y);
            }
        }





        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J
        String v = "Hello Java";
        for (int i = 0; i<v.length(); i++){char c = v.charAt(i);if (c =='a'){break;}
        else {System.out.print(c);}}


        //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci ==> ict
        String s = "Tokatci";
        for (int i = s.length()-1; i>=0; i--){char c = s.charAt(i);if (c =='a'){break;}
        else {System.out.print(c);}}


        System.out.println();

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String b = "Pwd12?Ab";
        for (int i = 0; i<b.length(); i++){char c = b.charAt(i);if ('a'<c && c<'z'){continue;}
        else {System.out.print(c);}}


        System.out.println();

        // Bir String'i ters ceviren kodu yaziniz
        String d = "Tokatci";
        String ters1 = "";
        //1. way
        for (int i = d.length()-1; i>=0; i--){char c = d.charAt(i); ters1 = ters1 +c;
             } System.out.println(ters1);

        //2.Way:
        String ters2 = "";
        for (int i = d.length()-1; i>=0; i--){String c = d.substring(i, i+1); ters2 = ters2 +c;
        } System.out.println(ters2);


        // Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578 ==> 5+7+8 = 20
        int num = 578;
        int sum = 0;
        for (int i = 578; i>0; i= i/10){
            sum = sum +i%10;
        }
        System.out.println(sum);


        //Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
        //1838 ==> 1 + 3 = 4

        String num1 = "1838";
        int sum1 = 0;
        for (int i = 0; i<num1.length(); i++){
            char c =num1.charAt(i);
            if (num1.indexOf(c) == num1.lastIndexOf(c)) {
                sum1 = sum1 + Character.getNumericValue(c);
            }
        }
        System.out.println(sum1);



        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz
        //Alabala ==> la
        String a1 = "Alabala";
        String tkrrsz = "";
        for (int i = 0; i<a1.length(); i++){
            String c = a1.substring(i, i+1);
            if (a1.indexOf(c) != a1.lastIndexOf(c) && !tkrrsz.contains(c)){
                tkrrsz = tkrrsz+c;
            }
        }System.out.print(tkrrsz);

        System.out.println();

        //while
        //3'den 6'e kadar tum tamsayilari console'a yazdiran kodu yaziniz
        int i = 3;
        while (i <=6){
            System.out.println(i);

            i++;
        }




        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        int i1 = 21;
        while (i1 <=180){
            if (i1%4==0 && i1%6==0){
            System.out.println(i1);}

            i1++;
        }

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String miami = "miami";
        int q = 0;
        while (q<miami.length()) {
            String s3 = miami.substring(q,q+1);
            if (q%2==0) {
                System.out.print(s3.toUpperCase());
            } else {
                System.out.print(s3);
            }
            q++;
        }


        //Size verilen tanmsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.
        // 578 ==> 5+7+8 = 20
        int i3 = 578;
        int sum2 = 0;
        while (i3>0){sum2 = sum2 +i3%10;

            i3=i3/10;
        }
        System.out.println(sum2);


        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number to make multiply chart");
        int num3 = input.nextInt();

        int i4 = 1;
        while (i4<=10){
            System.out.println(num3 + " x " + i4 + " = "+ (i4*num3));
            i4++;
        }


        //Kullanicidan aldiginiz String'deki sessiz harfleri console'a yazdiran kodu yaziniz---
        //Alabama ==> lbm
       String f =  "Alabama";
       int h = 0;

       while (h<f.length())
       {char c = f.charAt(h);
           boolean k = (c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'||
                   c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U');
           if (!k){System.out.print(c);

               }
           ++h;
       }









        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz
        System.out.println("enter a word");
       String w = input.next();

        if ('A'<=w.charAt(0) && w.charAt(0)<='Z'&& w.charAt(w.length()-1) =='.' ){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }






           /*
         1.Example:Type code to get the output like
            Week: 1
              Day: 1
              Day: 2
              Day: 3
              .....
            Week: 2
              Day: 1
              Day: 2
              Day: 3
              ....
            Week: 3
              Day: 1
              Day: 2
              Day: 3
         */

        for (int i6 = 1; i6 <4; i6++){
            System.out.println("Week: " + i6);
            for (int i7 = 1; i7 <4; i7++){
                System.out.println("Day: " + i7);
            }
        }




        /*
         2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                   (Asagidaki sekli olusturmak bir Java programi yaziniz)
                        ****
                        ****
                        ****
                   Note: Get the number of the rows and the columns from user*/

        System.out.println("number of rows");
        int row = input.nextInt();
        System.out.println("number of columns");
        int columns = input.nextInt();

        for (int i8 = 1; i8 <=row; i8++){
            for (int i9 = 1; i9 <=columns; i9++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }//mian
}//class