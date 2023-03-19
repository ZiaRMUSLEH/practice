package examples;

import java.util.Scanner;

public class TR_06_StringManipulations {
    public static void main(String[] args) {

      String a = "Benim Tek Rakibim Dunku Ben*." ;
        // ************ toUpperCase() ***************\\
        System.out.println(a.toUpperCase());
        //BENIM TEK RAKIBIM DUNKU BEN*.

        // ************ toLowerCase() ***************\\
        System.out.println(a.toLowerCase());
        //benim tek rakibim dunku ben*.

        // a String'indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.
        System.out.println(""+a.charAt(1)+a.charAt(a.length()-2)); //e*

        // a String'inde bulunan karakter sayisini bulunuz
        System.out.println(a.length()); //

        // ************ substring() ***************\\
        //String a = "Benim Tek Rakibim Dunku Ben*." ;
        // a String'indeki ilk 4 karakteri aliniz
         System.out.println(a.substring(0,4));//Beni

        //a String'indeki 4.index dahil 7.index haric yazdiriniz
        System.out.println(a.substring(4,7));//m T

        // a String'indeki "Rakib" kelimesini aliniz
        System.out.println(a.substring(10,15));//Rakib

        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz
        System.out.println(a.contains("bim"));//true

        // a String'inin "T" harfiyle baslayip baslamadigini kontrol ediniz
        System.out.println(a.startsWith("T"));//false

       // Universite numaralari yil+BolumKodu+GirisSirasi  olarak duzenlenen bir okulda
       // ogrenci Umran'in Hukuk Fakultesinde okuyup okumadini gosteren kodu yaziniz
       // sinif  22   Hukuk  33    bilgisayar  44    Eczacilik  55    Maliye 66
       // KimyaMuhendisligi 77  olsun

        String umran = "201233464FGG";
        System.out.println(umran.contains("33"));//true

        String ss = "Learn java earn money";
        //Ex : ss String'inin "money" ile bitip bitmedigini kontrol ediniz
        System.out.println(ss.endsWith("money"));//true

        // Ex : ss String'indeki "money" kelimesini "dollar" kelimesiyle yer degistirelim
        System.out.println(ss.replace("money","dollar"));//"learn java earn dollar"

        //Ex : ss  String'indeki "earn" kelimesini "win" kelimesine ceviriniz."learn java earn money"
        System.out.println(ss.replace(" earn", " win"));//"learn java win money"

        //Ex : ss  String'indeki "a" harfini "*" ile degistiriniz.
        System.out.println(ss.replace('a', '*'));//le*rn j*v* e*rn money

        //Ex : ss  String'indeki "L" harfini "***" ile degistiriniz.
        System.out.println(ss.replace("L", "***"));//***earn java earn money

        //Ex : ss  String'indeki "e" harflerini siliniz.
        System.out.println(ss.replace("e", ""));//Larn java arn mony

        //Ex : ss  String'indeki tum "earn" kelimelerini siliniz.
        System.out.println(ss.replace("earn", ""));//L java  money

        String t = "dolma kalem";
        // Ex : t String'indeki "Kalem" kelimesi yerine "Biber" yerlestiriniz
        System.out.println(t.replaceAll("dolma","Biber"));//Biber kalem

        String s = "Mehmet 20 yasinda QA_Developer kursunda $ dolar kazanmistir...";

        // Ex : s String'indeki tum rakamlari "*" ceviriniz
        System.out.println(s.replaceAll("[0-9]","*" ));
        // "Mehmet ** yasinda QA_Developer kursunda $ dolar kazanmistir..."

        // Ex : s String'indeki tum harfleri ve tum rakamlari "@" ceviriniz
        System.out.println(s.replaceAll("[a-zA-Z0-9]",""));
        //   _  $  ...

        // Ex : s String'indeki tum spaceler disindaki karakterleri "+" ceviriniz
        System.out.println(s.replaceAll("[^ ]","+"));
        //++++++ ++ +++++++ ++++++++++++ ++++++++ + +++++ ++++++++++++++

        // Ex : s String'indeki tum kucuk harfler disindaki karakterleri "*" ceviriniz
        System.out.println(s.replaceAll("[^a-z ]","*"));
        //*ehmet ** yasinda ****eveloper kursunda * dolar kazanmistir***

        // Ex : s String'indeki tum sesli harfler disindaki karakterleri "&" ceviriniz
        System.out.println(s.replaceAll("[^aeiouAEIOU]", "&"));
        //&e&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&&a&a&&i&&i&&&&

        String str ="Bizimle Java Ogrenmek Cok Kolay";

        // Ex : str String'indeki ilk gordugu "i" harfinin yerine "e" harfi yerlestiriniz
        System.out.println(str.replaceFirst("i", "e"));
        //"Bezimle Java Ogrenmek Cok Kolay"

        String isim = "   Mehmet Fatih Yildirim  ";

        // EX : isim String'indeki varsa bas ve sondaki space'leri siliniz
        String noSpace = isim.trim();
        System.out.println(noSpace);


        // EX : Bir String'in hic karakter icermedigini gosteren kodu yaziniz
       String bos = "";
        System.out.println(bos.isEmpty()); // true

        // Ex: Bir String'in bosluk haric hicbir karakter
       String blank = "          ";
        System.out.println(blank.isBlank()); // true

        // Ex: Bir String'in "*" haric hicbir karakter
        // icermedigini kontrol eden kodu yaziniz
       String str3 = "*a";
       System.out.println(str3.replace("*","").length()==0 );//false

        // Ex : Bir String de a ,i ,e karakterlerinin ilk gorunumlerinin
        // indexleri toplamini ekrana yazdiriniz
       String r = "Java is easy to Learn";
       int a1 = r.indexOf("a");
        int i = r.indexOf("i");
       int e = r.indexOf("e");
       System.out.println(a1+i+e);//14

        // Ex : Bir String 'de "Java " kelimesinin ilk olarak kacinci index'de
        // kullanildigini gosteren kodu yaziniz
        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int javaIndex = u.indexOf("Java");
        System.out.println(javaIndex);//3

        // Ex : Bir String de a ,i ,e karakterlerinin son gorunumlerinin
        //      indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to Learn";
        int a2 = v.lastIndexOf("a");
        int i2 = v.lastIndexOf("i");
        int e2 = v.lastIndexOf("e");
        System.out.println(a2+i2+e2);// 40

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        String y ="abbccdc";

        if (y.indexOf('a')==y.lastIndexOf('a')){System.out.print("a");}
        if (y.indexOf('b')==y.lastIndexOf('b')){System.out.print("b");}
        if (y.indexOf('c')==y.lastIndexOf('c')){System.out.print("c");}
        if (y.indexOf('d')==y.lastIndexOf('d')){System.out.print("d");}
        //ad

        // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz
        int num1 = 5464;
        if (num1>0) {System.out.println("Sayi Pozitif ");}

        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
         int rakam = 5;
         if (rakam>=-1 && rakam<=10){System.out.println("Verilen Data Rakamdir");}

        // Ex : Sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz
        int sayi= -999;
        int nSayi = Math.abs(sayi);
        if (99<nSayi && nSayi<1000){
        System.out.println("Verilen Data 3 Basamaklidir");} // Verilen Data 3 Basamaklidir

        // Ex: Verilen bir karakterin buyuk harf ise ekrana
        // "Buyuk Harf " yazdiran kodu yaziniz"
        char ch = 'K';
        if ('A' <= ch && ch <= 'Z'){System.out.println("Buyuk Harf ");}//Buyuk Harf

        // Ex: Verilen sayi cift sayi ise ekrana "Cift Sayi " yazdiran kodu yaziniz
        byte sayi3 = -8;
        if (sayi3%2==0){System.out.println("Cift Sayi ");} //Cift Sayi

        // Ex Verilen bir sayi 300'den kucuk veya 1200 'den buyuk
        // ise "Harika Sayi" yazdiran kodu yaziniz
         int number = -566;
        if (number<300 || number>1200){System.out.println("Harika Sayi");}//Harika Sayi

        // Ex : Kullanicidan alinan Datanin Tekmi; CiftMi? oldugunu yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number3 = input.nextInt();
        if (number3%2!=0){System.out.println("Tek");} else {System.out.println("Cift");}

        // Ex : Verilen bir sayinin negatif mi ,
        // pozitif mi , notr mu oldugunu soyleyen kodu yaziniz
        int a5 = 0;
        if (a5<0){System.out.println("negatif");}
        else if (a5==0) {System.out.println("notr");}
        else {System.out.println("poztif");}
    }//main
}//class
