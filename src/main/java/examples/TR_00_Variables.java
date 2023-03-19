package examples;


public class TR_00_Variables {

    public static void main(String[] args) {
        // java bu satri okumaz. Kendimize veya baskasina aciklamidir.
        /* java bu satirlari da okumaz
         */
        //Variable olusturma
        //data type + variable name + assignment + data + noktali virgul
        int         age          =         13;
        //java cumlesi === statement
        //Data type + Variable Name ==== Variable Declaration
        //Assignment Operator + Variable degeri ==== Assignment
        //Eger variable Declaration yapr, assignment yapmazsaniz java kendi degerlerini (default) koyar
        //Default degerler sayilar icin sifirdir.
        //Dilbilgisindeki nokta ne ise java daki noktali virgul ayni seydir. ve statementin bittigini gosterir
        //java da esittir demek "==". yani Matematik te "=", java da "=="

                /*
                Javada temelde iki tip data vardir.
                1)primitive data type:
                    char, boolean, byte, short, int, long, float, double
                2)non-primitive data type:
                    String
                 */
        //ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //String'lere verilen degerler daima cift tirnak icinde olmalidir

        String studentName = "Ali Can";

        //String bir variable olusturup ona her hangi bir atama yapmazsak java o variable a default olarak "null" koyar
        //null demek 0 demek degil, 0 da coding te bir degerdir
        //null demek ici bos obje demektir.
        //yani icinde variable veya mothod bulunmayan default obje demektir

        // {} == bos kume (empty set)

        //char data type:
        //Tek karakterler icin kullanilir. ornegin ==> A, x, ?, 5
        //ornek 2: char data type'inda bir isimin ilk harfi olarak bir variable olustutunuz ve bir deger atayiniz
        //Note: char data type'inda degerler tek tirnak icin konulmalidir.

        char isminIlkharfi = 'A';

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir; true (dogru) yada false (yanlis)
        //Ornek 3: boolean data type'inda emeklimisin icin bir variable olusturun ve false degerini atayin

        boolean emeklimisin = false;

        //byte data type:
        //tam sayilar icindir hafzada 1 byte yer kaplar
        //byte: -128 den +127 ye kadar tamsayi degerleri icin kullanilir
        //Ornek 4: byte taypeinda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge = 23;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 5: site nufusu cin bir variable olusturunuz ve deger atayiniz

        short siteNufusu = 1200;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 6: Ulke nufusu icin bir variable olusturun ve deger atamasi yapiniz

        int countryPopulation = 186478463;

        //long data type:
        //tam sayilar icin dir hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        //Ornek 7: insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: bir deger long ise sonuna "L" (tercih edilir) veya "l" konulur

        long cellNumberInHumanBody = 878787824587456464L;

        //Eger long'a atadiginiz deger int'lerin araliginda ise java onu int kabul eder

        long weightOfSun = 2354545;

        //float data type:
        //float data tipi virgullu sayilar (decimal numbers) icin kullanilabilir
        //float hafizada 4 byte yer kaplar
        //Note: java decimal number'i otomatik olarak "double" kabul eder
        //eger float data type'i olmasina israr ederseniz sonuna "F" yada "f" koymalisiniz
        //ornrgin fiyatlandrmalar icin terch edilebilir (12.99)
        //Ornek 8: gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz

        float shirtPrice = 12.99F;
        float ShoesPrice = 15.99F;

        System.out.println(shirtPrice + ShoesPrice);

        int a = 12;
        int b = 13;
        System.out.println(a);
        System.out.print(b);

        //sy
        // double data type hafizada 8 byte yer kaplar


        double cellWeight = 0.0000000000000045;
        double amipWeight = 0.000000000000555;
        System.out.println(cellWeight - amipWeight);




    }

}
