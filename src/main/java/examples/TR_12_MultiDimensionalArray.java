package examples;

import java.util.Arrays;

public class TR_12_MultiDimensionalArray {
    public static void main(String[] args) {

       String elements [][] = new String [3][2];
        elements [0][0] = "a";
        elements [0][1] = "b";
        elements [1][0] = "c";
        elements [1][1] = "d";
        elements [2][0] = "e";
        elements [2][1] = "f";

        String students [][] = {{"ahmet", "veli"},{"ali", "murat" , "mehmet"},{"yusuf"}};

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int isimsayisi = 0;
        for (String[] w: students){isimsayisi = isimsayisi +w.length;}
        System.out.println(isimsayisi);


        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        for (String[] w:students)
        {for (String e: w){
            if (e.contains("m")){
                System.out.println(e);
            }
        }}



        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int numsMultiply = 1;
        int numbers[][] = {{1, 2, 3,},{4, 5, 6}};
        for (int[] w:numbers){for(int e:w){
            numsMultiply = numsMultiply * e;
        }}
        System.out.println(numsMultiply);

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        //String students [][] = {{"ahmet", "veli"},{"ali", "murat" , "mehmet"},{"yusuf"}};
        int isimsayisi1 = 0;
        for (String[] w: students){isimsayisi1 = isimsayisi1 +w.length;}
        String names [] = new String[isimsayisi1];

        int indx= 0;
        for (String[] w:students)
        {for (String e: w){
            names[indx] = e;
            indx++;
        }}
        System.out.println(Arrays.toString(names));





    }//main
}//class
