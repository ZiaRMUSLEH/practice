package practices.day_02;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad = input.nextLine();

        System.out.println("soy isminizi giriniz");
        String soyAd = input.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();

        System.out.println("boyunuzu giriniz");
        int boy = input.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo = input.nextInt();

        System.out.println("Adi:"+ad+"\nSoyad:"+soyAd+"\nYas:"+yas+"\nBoy:"
                +boy+"\nKilo:"+kilo);




    }//main
}//class
