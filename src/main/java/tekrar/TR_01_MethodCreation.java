package tekrar;

public class TR_01_MethodCreation {
    public static void main(String[] args) {

        //Ornek1:toplama islemi yapan bir method olusturunuz.
        //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
        //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.
        //Ornek 4: Verilen bir ondalikli sayinin kupunu hesaplayan method olusturup kullaniniz.
        //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz



        toplama(4,5);

        multiply(4,5);

        int result = addAndMultiply(3,4,6);
        System.out.println("result = " + result);

        double result2 = calculateCube(3);
        System.out.println("result2 = " + result2);

        double direCevresu = direnincevresi(5);
        System.out.println("direCevresu = " + direCevresu);


    }//main

    private static double direnincevresi(double r) {return 2*3.14*r;}

    //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz


    // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz
    public static double calculateCube (double a){return a*a*a;}

    //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile
    // toplayan method'u olusturunuz ve kullaniniz.
    public static int addAndMultiply(int a, int b, int c){return a*b +c;}




    // 2) Verilen 2 sayiyi carpan methodu yaziniz
    public static  void multiply (int a, int b) {System.out.println(a*b);}

    // 1) Verilen iki sayiyi toplayan methodu olusturunuz
    public static void toplama (int a, int b) {System.out.println(a+b);}




}//class
