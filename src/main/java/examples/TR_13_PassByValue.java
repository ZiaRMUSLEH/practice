package examples;

public class TR_13_PassByValue {


    public static void main(String[] args) {
        System.out.println(Discount("teacher", 100));
        System.out.println(Discount("worker", 100));
        System.out.println(Discount("student", 100));



    }//main




    //Discount Method'u olusturunuz
    public static int Discount(String person, int price){
        switch (person) {
            case "student": price = price-20; break;
            case "worker": price = price-15;break;
            case "teacher": price = price-10;break;
        }
          return price;
    }

}//class

