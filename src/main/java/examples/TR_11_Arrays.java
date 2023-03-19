package examples;

import java.util.Arrays;
import java.util.Scanner;

public class TR_11_Arrays {



    public static void main(String[] args) {

  /*      //Example 1: stdNames array'indeki her ismin yaninda yildiz koyarak console'a yazdiriniz
        //for-each loop ==> Enhanced(Zenginlestirilmis) Loop - Mumkunse  for-each loop kullanin
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w:stdNames){
            System.out.println(w + "*");
        }




        //Example 2: classNumber Arrayin, elemanlarin toplamini bulup console'a yazdiriniz
        int classNumbers [] = new int[5];
        int sumOfArray = 0;
        classNumbers [0] = 0;
        classNumbers [1] = 1;
        classNumbers [2] = 2;
        classNumbers [3] = 3;
        classNumbers [4] = 4;
        for (int w: classNumbers) {
            sumOfArray = sumOfArray+w;
        }
        System.out.println(sumOfArray);


        //Example 3: Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpmini bulup console'a yazdiriniz
        char multiply [] = new char [3];
        multiply[0] = 2;
        multiply[1] =4;
        multiply[2] =5;
        int multiply1 = 1;
        for (char w:multiply){
            multiply1 = multiply1*w;
        }
        System.out.println(multiply1);


        //Example 1: grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz.
        int grades[] = {67, 98, 100, 34, 76};
        Arrays.sort(grades);
        System.out.println(grades[0]+grades[grades.length-1]);


        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character
        // icerenleriu console'a yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        Arrays.sort(stdNames);
        for (String w: stdNames){
            if(w.length()<5){
                System.out.println(w);

        }}


        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimlerden onceki isimleri console'a yazdiriniz
        for (String w: stdNames){
            if(w.startsWith("F")){break;}
            else{
                System.out.println(w);}}





        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimlerden onceki isimleri ve F ile baslayanlari console'a yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        Arrays.sort(stdNames);

        for (String w: stdNames){
            if(w.startsWith("F")){
                System.out.println(w)
                ;break;}
            else{
                System.out.println(w);}}


        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimler haric diger isimleri  console'a yazdiriniz

        for (String w: stdNames){
            if(w.startsWith("F")){
                continue;}
            else{
                System.out.println(w);}}




        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz--
        int classNumbers [] = new int[5];
        int i = 8;
        classNumbers [0] = 0;
        classNumbers [3] = 1;
        classNumbers [2] = 2;
        classNumbers [1] = 8;
        classNumbers [4] = 4;
        System.out.println(classNumbers[1]);
        Arrays.sort(classNumbers);
        Arrays.binarySearch(classNumbers, i);
        System.out.println(Arrays.binarySearch(classNumbers, i));

        //Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.---
        String s = "Java is easy. Learn Java earn money.";
        String splitedS []=s.split(" ");
        System.out.println(splitedS.length);
*/


        //Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.---
        String s1 = "Java is easy. Learn Java earn money.";
        String splitedS1 []=s1.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.asList(splitedS1));
        System.out.println(splitedS1.length);



    }//main

}//class