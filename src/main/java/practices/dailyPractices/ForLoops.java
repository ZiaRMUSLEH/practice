package practices.dailyPractices;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

    // For loop
    //1. Ekrana 10 kez "Java guzeldir" yazin.

       for (int i = 0; i<10; i++){
            System.out.println((i+1)+". Java guzeldir");
        }



        //2. 10 ile 30 arasindaki (10 ve 30 dahil) sayilari arlarinda virgul olarak ayni satirda yazirin.
        for (int i = 10; i<=30; i++){
            System.out.print(i+", ");
        }

        //3. 100'den baslayarak 50'ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin.
        for (int i = 100; i>=50; i--){
            System.out.print(i+", ");
        }
        System.out.println();

        //4. Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un kati olan
        // sayilari yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer number smaller than 100");
        int number = input.nextInt();

        if (number<100){
            for (int i =1; i<=number; i++){
                if (i%3==0){System.out.println(i);}

            }
        } else {
            System.out.println("invalid entry");
        }

       //5. Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati
        // sayilari yazdirin.
        System.out.println("please enter an integer number smaller than 100");
        int num = input.nextInt();
        if (num<100){ for (int i = 1; i<=num; i++){
            if (i%3==0 || i%5==0){
                System.out.println(i);
            }
        }

        }else {
            System.out.println("invalid entry");
        }

        /* 6. IQ. Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar tum sayilari
         yazdirin. Ancak;
         - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
         - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
         - Sayi 3'un hem 5'in kati ise yerine "Java Guzeldir" yazdirin.
        */
      System.out.println("Please enter an Integer number, smaller than 100");
        int num1 = input.nextInt();
        if (num1<100){
            for (int i = 1; i<=num1; i++){
                if (i%3==0 && i%5==0) {
                    System.out.println(i + " Java Guzeldir");
                }
                 else if (i%5==0){
                    System.out.println(i + " Guzeldir");
                } else if (i%3==0){
                    System.out.println(i + " java");
                }
            }
        }else {
            System.out.println("invalid entry");
        }

        //7. IQ. Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        System.out.println("please enter a sentence");
        input.nextLine();
        String sentence = input.nextLine();
        String reversed = "";
        for (int i = sentence.length()-1; i>=0; i--){
            String ch = sentence.substring(i, i+1);
            reversed= reversed+ch;
        }
        System.out.println(reversed);

        //8. IQ. Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
        System.out.println(reversMethod(""));

        //9.IQ. Kullanicidan bir String isteyin. Kullanicinin girdigi String'in palindrome olup olmadigini kontrol eden
        // bir program yazin

        System.out.println("please enter a String to check is it Palindrme or not");
        String palindrome = input.next();
        String trsPalindrome = "";
        for (int i = palindrome.length()-1; i>=0; i--){
            String ch = palindrome.substring(i,i+1 );
            trsPalindrome = trsPalindrome +ch;
        } if (palindrome.equals(trsPalindrome)){
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }

        //10. Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran
        //bir program yaziniz

        System.out.println("please enter first number");
        int fst = input.nextInt();
        System.out.println("please enter second number");
        int snd = input.nextInt();
        int result = 0;
        if (fst<snd){
        for (int i = fst; i<=snd; i++ ){
            result = result +i;
        }} else {
            for (int i = snd; i <= fst; i++) {
                result = result + i;
            }}
            System.out.println(result);

        //11. Kullaicidan 10'dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel'ini bulun (5!=5*4*3*2*1)
        System.out.println("enter an integer smaller than 10 to do factorial operation");
        int factorialNum = input.nextInt();
        int result2 = 1;
        for (int i = factorialNum; i>=1; i--){
            result2 = result2*i;
        }
        System.out.println(result2);

        //12. Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin.
        /*
                                    *
                                    * *
                                    * * *
                                    * * * *
        */
      System.out.println("please enter a positive number to make star triangle");
        int starTriangle = input.nextInt();
        for (int i = 1; i<=starTriangle; i++){
            for (int j = 0; j<i; j++){
            System.out.print("* ");}
            System.out.println();}

        //13. Kullanicidan poztif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun.
        /* ornek, kullanici 3 girerse,
                    1 2 3
                    2 4 6
                    3 4 9
       */

       System.out.println("please enter a positive number to make multiply table");
        int multiplyTable = input.nextInt();
        for (int i = 1; i<=multiplyTable; i++){
            for (int j = 1; j<=multiplyTable; j++){
                System.out.print((i*j)+"\t");}
            System.out.println();}


    }//main
    //8. IQ. Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
    public static String reversMethod (String reversed){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a word");
        String word = input.next();
        for (int i = word.length()-1; i>=0; i--){
            String ch = word.substring(i, i+1);
            reversed= reversed+ch;
    }
        return reversed; }



}//class
