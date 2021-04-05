import org.w3c.dom.Text;
import org.w3c.dom.ls.LSOutput;

import java.time.chrono.MinguoChronology;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        System.out.println("Hello");
        System.out.println("Diana");

        printName();

        int x = 6;
        int y = 3;
        System.out.println(x + y);

        float result = 9f / 2;
        System.out.println(result);

        System.out.println(-5 + 8 * 6);

        int resulta = -5 + 8 * 6;
        System.out.println("Rezultatul este " + resulta);

        double resultb = (55 + 9) % 9;
        System.out.println("Rezultatul este " + resultb);

        double resultc = 20 + (-3 * 5) / 8d;
        System.out.println("Rezultatul este " + resultc);

        double resultd = 5 + 15d / 3 * 2 - 8 % 3;
        System.out.println("Rezultatul este " + resultd);


    }
    public static void printName() {
        System.out.println("Hello, Diana");
    }
}

