package javaQuestionBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //6) If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);



        //7) Find the closest 2 integers in an Integer List
        //Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
        List<Integer> num1 = new ArrayList<>();
        num1.add(12);
        num1.add(31);
        num1.add(15);
        num1.add(13);
        num1.add(54);
        Collections.sort(num1);

        int minDif = num1.get(1)-num1.get(0);
        for (int i = 1; i<num1.size();i++){
            minDif = Math.min(minDif, num1.get(i)- num1.get(i-1));
        }
        for (int i = 1; i<num1.size(); i++){
            if (minDif == num1.get(i)-num1.get(i-1)){
                System.out.println(num1.get(i) +" and " + num1.get(i-1));
            }
        }

        //8) Increase the value of every element except 7 and 10 by 2 in a List
        //Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(31);
        num.add(7);
        num.add(13);
        num.add(10);

        for (Integer w: num)
        {
            if(w==7 || w==10){continue;}
            else {num.set(num.indexOf(w),w+2 );}
        }
        System.out.println("num = " + num);


        //9) Find the sum of all prices given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> myList2 = new ArrayList<>();
        myList2.add("$12.99");
        myList2.add("$23.60");
        myList2.add("$54.45");
        double totalPrice = 0;
        for (String w:myList2) {
            totalPrice= totalPrice+Double.valueOf(w.replace("$",""));
        }
        System.out.println("totalPrice = " + totalPrice);


        //10) Find the sum of the least and the greatest price given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
        ArrayList<String> myList1 = new ArrayList<>();
       myList1.add("$12.99");
       myList1.add("$8.25");
       myList1.add("$23.60");
       myList1.add("$54.45");

       double max = 0;
       double min = Double.valueOf(myList1.get(0).replace("$",""));

       for(String w:myList1){
           double x = Double.valueOf(w.replace("$", ""));
           max = Math.max(max,x);
       }
        for(String w:myList1){
            double x = Double.valueOf(w.replace("$", ""));
            min= Math.min(min,x);}
            System.out.println((min+max)+"$");



        //11) Check if all elements are unique in an integer List by using loops.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer w: myList){
            if(myList.indexOf(w)==myList.lastIndexOf(w)){
                uniqueList.add(w);
            }}
            if(myList.equals(uniqueList)){
                System.out.println("all elements are unique");
            } else {
                System.out.println("all elements are not unique");
            }




        /*12) Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value,
        decreasing constantly after the maximum value
        Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to the maximum value,
                decreasing and increasing after the maximum value
        Type a code to check if any given array is Mountain Array or not


        int [] list = {0,8, 2, 5, 3, 1};
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int w:list) {
            list1.add(w);
        }

        int max = 0;
        for (Integer w:list1) {
            max = Math.max(max, w);
        }


        boolean leftSide = true;
        for (int i =0; i<list1.indexOf(max); i++){
        if(list1.get(i)-list1.get(i+1)<0 ){
            leftSide = true;
        } else {leftSide=false;}
        }
        boolean righttSide = true;
        for (int i =list1.size()-1; i>list1.indexOf(max); i--){
            if(list1.get(i)-list1.get(i-1)<0 ){
                righttSide = true;
            } else {righttSide=false;}
        } if (leftSide && righttSide ){
            System.out.println(list1+ " is a Mountain Array");
        } else {System.out.println(list1+ " is not a Mountain Array");}
  */

    }
}
