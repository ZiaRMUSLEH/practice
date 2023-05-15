package javaQuestionBank;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {
        //1)Find the middle element in an integer array
        //Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int [] arr= {12,5,24,8,13};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int middle;

        if (arr.length%2==0){
            middle=(arr[arr.length/2]+arr[arr.length/2-1])/2;
        }else {
            middle=arr[arr.length/2];
        }
        System.out.println(middle);

        // 2)Find the smallest positive element and greatest negative element in
        // an integer array Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18,
        //        greatest negative is -2

        int [] arr1= {-12, 18, -5, 23, -2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int min=arr1[arr1.length-1];
        int max=arr1[0];


        for (int i : arr1){
            if (i>0){
                min=Math.min(min,i);
            }else{
                max=Math.max(max,i);
            }
        }
        System.out.println("Min pos: "+ min + " Max neg: " + max);


        //3)Find the elements whose length is the smallest in a String array
        //            Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String [] arr2= {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int smallest= arr2[0].length();
        for (String w: arr2) {
            smallest = Math.min(w.length(),smallest);
        }

        for (String w:arr2){
            if (w.length() == smallest){
                System.out.println(w);
            }
        }

        // 6)Count how many words start with 'a' or 'A' in a given String

        String s = "Apex is an object oriented programming language";
        int counter=0;

        String[] arr3 = s.split(" ");
        for (String w: arr3) {
            if (w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);











    }
}
