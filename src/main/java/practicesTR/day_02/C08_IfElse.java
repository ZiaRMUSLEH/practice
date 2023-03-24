package practicesTR.day_02;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {


/*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması
     gerektigini konsola yazdırın

    */
        Scanner input = new Scanner(System.in);
        System.out.println("hizmet yilinizi girin");
        int hizmetYili = input.nextInt();
        System.out.println("maasinizi giriniz");
        int maas = input.nextInt();

        if (hizmetYili>=5){
            System.out.println("zamli maas : ="+(maas+(maas/10)));}
        else {
            System.out.println("zam alabilmek icin "+(5-hizmetYili)+" yil daha calismalisin");}

    }//main
}//class
