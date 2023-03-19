package practices.day_02;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk
        // olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini
        // BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi ve soy isminizi giriniz...");
        String isimVeSoyisim = input.nextLine().toUpperCase();


        System.out.print(isimVeSoyisim.trim().charAt(0));
        //System.out.print(isimVeSoyisim .trim().split(" ")[1].charAt(0));
        System.out.println(isimVeSoyisim.trim().charAt(isimVeSoyisim.trim().indexOf(" ")+1));

        /* instructor
        System.out.println("Isminizi ve Soyisminizi Giriniz");

        char isimIlkKarakter = isimSoyisim.charAt(0);

        char soyisimIlkKarakter = isimSoyisim.charAt(isimSoyisim.indexOf(" ")+1);

        System.out.println("" + isimIlkKarakter + soyisimIlkKarakter);
*/

    }//main
}//class

