package javaQuestionBank;

import java.util.ArrayList;
import java.util.List;

public class Maps01 {
    public static void main(String[] args) {

        //5) Type code to count the number of occurrences of the words in a String. (Case insensitive)
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        String newS = s.toLowerCase().replaceAll("[^a-z ]","").replaceAll("\\s+", " ");
        String[] words = newS.split(" ");
        for(String w:words){

        }

        //6) How to check the number of repeated elements in a List

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        List<Integer> repated = new ArrayList<>();

        int counter = 0;

        for(Integer w:myList) {
            if(myList.indexOf(w)!=myList.lastIndexOf(w) && !repated.contains(w) ){ repated.add(w);
            }}
            System.out.println("There are " + repated.size() + " repeated elements");

    }
}
