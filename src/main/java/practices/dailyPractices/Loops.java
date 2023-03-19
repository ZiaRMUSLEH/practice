package practices.dailyPractices;

public class Loops {
    public static void main(String[] args) {
        //1. Ekrana 10 kez "Java guzeldir" yazin.
        for (int i = 0; i<10; i++){
            System.out.println((i+1)+". Java guzeldir");
        }



        //2. 10 ile 30 arasindaki (10 ve 30 dahil) sayilari arlarinda virgul olarak ayni satirda yazirin.
        for (int i = 10; i<=30; i++){
            System.out.print(i+", ");
        }

        //3. 100'den baslayarak 50'ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin.
        for (int i = 100; i>=50; i--){
            System.out.print(i+", ");
        }

    }//main
}//class
