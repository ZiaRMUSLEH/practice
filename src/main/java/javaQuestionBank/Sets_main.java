package javaQuestionBank;

import java.util.*;

public class Sets_main {
    public static void main (String[] args) {

        //1) Type the code that shows how many different elements there are in a list.
        //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(31);
        set1.add(15);
        set1.add(7);
        set1.add(15);
        set1.add(7);
        set1.add(7);

        System.out.println(set1.size());


        //2) Type code to print different characters used in a String
        //Example: ‘Mississippi’Ş Misp

        Set<Character> letters = new HashSet<>();
        letters.add('M');
        letters.add('i');
        letters.add('s');
        letters.add('s');
        letters.add('i');
        letters.add('s');
        letters.add('s');
        letters.add('i');
        letters.add('p');
        letters.add('p');
        letters.add('i');

        //System.out.println("letters = " + letters);
        Set<Character> letters1 = new TreeSet<>(letters);
        System.out.println("letters1 = " + letters1);
        for (Character w:letters1) {
            System.out.print(w);
        }

        System.out.println();


        //3) Type code to print the common elements between a Set and a List
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        mySet.retainAll(myList);

        System.out.println("mySet = " + mySet);

        //4) Type code to print the different elements in a Set from a List
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);

        Set<Integer> mySet1 = new HashSet<>();
        mySet1.add(10);
        mySet1.add(7);
        mySet1.add(35);
        mySet1.add(13);

        mySet1.removeAll(myList1);
        System.out.println("different elements = " + mySet1);

        //5) Type code to check if a List has repeated elements or not

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(31);
        myList2.add(15);
        myList2.add(7);
        myList2.add(8);
        Collections.sort(myList2);
       // System.out.println("myList2 = " + myList2);


        Set<Integer> myset2 = new TreeSet<>(myList2);
       // System.out.println("myset2 = " + myset2);

        if (myList2.size()>myset2.size()){
            System.out.println("myList2 have repeated elements");
        } else {
            System.out.println("myList2 do not have repeated elements");
        }




    }
}
