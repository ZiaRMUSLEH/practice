package javaQuestionBank;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));


    int arr[] = new int[5];
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    for (int i = 1; i <= arr.length; i++) {
        list1.add(i);
    }
    System.out.println(list1);
list1.add(6);

        System.out.println(list1);
        list1.set(2,6);
        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        int i = 0;
        int x = 0;
        while(i<list2.size()) {
            x = x + list2.get(i);
            i++;
        }
        System.out.println(x);
    }

}
