import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by smeleyka on 28.03.17.
 */
public class MainClass {

    public static void main(String[] args) {

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        float e = 3.1415927f;
        double f = 3.141592653589793;
        boolean g = true;
        char h = '\u2f78';

        System.out.println(formula(200, 300, 100, 4));

        System.out.println(isBetween(10, 6));

        positiveOrNegative(20);

        helloName("Друг");

        System.out.println("ПРИВЕТ");


    }

    public static int formula(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    public static boolean isBetween(int a, int b) {
        if (a + b >= 10 && a + b <= 20) return true;
        return false;
    }

    public static void positiveOrNegative(int a) {
        if (a < 0) System.out.println("Отрицательное");
        else System.out.println("Положительное");

    }

    public static void helloName(String a) {
        System.out.println("Привет, "+a+"!");

    }




}
