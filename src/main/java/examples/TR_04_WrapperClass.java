package examples;

public class TR_04_WrapperClass {
    public static void main(String[] args) {
        //Ornek 1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short shortMin = Short.MIN_VALUE;
        System.out.println(shortMin);
        short shortmax = Short.MAX_VALUE;
        System.out.println(shortmax);
        //Ornek 2: int data type'inin minimum degeri  ile byte data type'inin maximum degerinin toplamini bulunuz
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);
        //Ornek 3: i) Primitive int'i wrapper Integer'a cevirini
        int a = 564564654;
        Integer wrappera = a;

        //ii)Wrapper Byte'i primitive byte'a ceviriniz.
        Byte wrapperx = 45;
        byte x = wrapperx;

        //Ornek 4: i) Primitive char'i Wrapper Character'e ceviriniz(Autoboxing)
        char z = 'p';
        Character wrapperZ = z;

        //ii) Wrapper Boolean'i primitive boolean'a ceviriniz. (Unboxing )
        Boolean yenidir = true;
        boolean primitiveYenidir = yenidir;



    }//mian
}//class
