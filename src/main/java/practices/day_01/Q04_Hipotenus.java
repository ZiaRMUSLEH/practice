package practices.day_01;

public class Q04_Hipotenus {
    //hipotenus hesaplayan bir kod yaziniz
    public static void main(String[] args) {

        System.out.println(hipotenusHesapla(3,4));

    }

    public static double hipotenusHesapla(double dikkenar1, double dikkenar2){
      double hipotenus =  Math.sqrt(dikkenar1*dikkenar1+dikkenar2*dikkenar2);
  return hipotenus;
    }

}

