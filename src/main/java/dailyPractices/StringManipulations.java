package dailyPractices;

public class StringManipulations {
    public static void main(String[] args) {
        String a1 = "Java is Java";
        System.out.println(a1.indexOf('a',4));


        String s = "123-Start!!!";
        System.out.println(s.replaceAll("\\W", "*")); //123*Start***
        System.out.println(s.replaceAll("\\S", "*")); //************
        System.out.println(s.replaceAll("[^Start]", "*")); //****Start***
        System.out.println(s.replaceAll("\\A", "!!!")); //!!!123-Start!!!



        String s1 = "123_Start";
        System.out.println(s1.replaceAll("\\d", ""));// _Start
        System.out.println(s1.replaceAll("\\w", "")); //
        System.out.println(s1.replaceAll("[at]", "*")); //123_S**r*
        System.out.println(s1.replaceAll("\\Z", "*")); //123_Start*





        String s2 = "Learn";
        String t = "Java";
        String u = "";
        String v = " ";

        //System.out.println(s2.concat(t)).length());
        System.out.println("" + s2.length() + t.length());
       // System.out.println(s2.concat(t.length()));
        System.out.println(u.isEmpty() == v.isBlank());

    }
}
