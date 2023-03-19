package practices.day_02;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini
        // ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dikdorgenin uzun kenari giriniz...");
        int uzunKenar = input.nextInt();
        System.out.println("lutfen dikdorgenin kisa kenari giriniz...");
        int kisaKenar = input.nextInt();

        // System.out.println("Dikdorgenin Cevresi: =" +(2*uzunKenar)+(2*kisaKenar));
        System.out.println("Dikdorgenin Cevresi: =" +(2*kisaKenar+2*uzunKenar));





    }//main
}//class
