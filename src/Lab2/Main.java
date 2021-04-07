package Lab2;

import Lab3.Calculator;
import Lab3.LogicalOp;

public class Main {
    public static void main( String[] args) {

        printName();

        System.out.println("Rezultatele pentru Tema 1");

        int Result1 = Result1(-5, 8, 6);
        System.out.println("Rezultatul " + Result1);

        double Result2 = Result2(55d, 9d, 9d);
        System.out.println("Rezultatul " + Result2);

        double Result3 = Result3(20d, -3, 5, 8d);
        System.out.println("Rezultatul " + Result3);

        double Result4 = Result4(5, 15d, 3, 2, 8, 3);
        System.out.println("Rezultatul " + Result4);


        System.out.println("Rezultatele pentru Tema 2");

        Calculator calc = new Calculator();

        System.out.println("Rezultatul este " + calc.sum(3, 6));
        System.out.println("Rezultatul este " + calc.subtract(3, 6));
        System.out.println("Rezultatul este " + calc.multiply(3, 6));
        System.out.println("Rezultatul este " + calc.divide(3, 6f));


        System.out.println("Rezultatele pentru Tema 3");
        printTJava();

        System.out.println("Rezultatele pentru Tema 4");

        System.out.println("Media aritmetica a nr. 3, 2 si 4 este " + calc.average(3, 2, 4));

        System.out.println("Rezultatele pentru Tema 5");

        printRobot();

        System.out.println("Rezultatele pentru Tema 6");
        System.out.println("Rezultatul este " + calc.modulo(15f, 4f));


        System.out.println("Rezultatele pentru Tema 7");
        System.out.println("Temperatura in Celsius este " + tempC(102f));


        System.out.println("Rezultatele pentru Tema 8");
        System.out.println("1 Inch reprezinta " + inchToMeter(120) + " metri");

        System.out.println("Rezultatele pentru Tema 9");

        float distanta = 125000f;
        float hr = 2f;
        float min = 15f;
        float sec = 45f;
        float timpHr = hr + (min / 60f) + (sec / 3600f);

        System.out.println("Distanta in metri este " + distanta);
        System.out.println(hr + " Ore " + min + " minute " + sec + " secunde ");

        float mps = distanta / (timpHr * 3600f);
        float kmh = (distanta / 1000f) / timpHr;
        float mph = (distanta / 1609f) / timpHr;

        System.out.println("Viteza in metri pe secunda este: " + mps);
        System.out.println("Viteza in kilometri pe ora este: " + kmh);
        System.out.println("Viteza in mile pe ora este: " + mph);

        LogicalOp op = new LogicalOp();
        System.out.println("The higher number is " + op.checkHigherNumber(6,9));


    }
    public static void printName() {
        System.out.println("Hello, Diana");
    }

    public static void printRobot() {
        System.out.println(" +\"\"\"\"\"+\n" +
                "[| o o |] \n" +
                " |  ^  |\n" +
                " | '-' |\n" +
                " +-----+ ");
    }
    public static void printTJava() {
        System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a\nJ  J  aaaaa  v v  aaaaa\n JJ  a     a  v  a     a");

    }

    public static float inchToMeter(float nr) {
        float inchToMeter = nr * 0.0254f;
        return inchToMeter;
    }

    public static float tempC(float F) {
        float tempC = 5f / 9f * (F - 32f);
        return tempC;
    }
    public static double Result4(double first, double second, double third, double forth, double fifth, double sixth) {
        double Result4 = first + second / third * forth - fifth % sixth;
        return Result4;
    }

    public static double Result3(double first, double second, double third, double forth) {
        double Result3 = first + (second * third) / forth;
        return Result3;
    }

    public static double Result2(double first, double second, double third) {
        double Result2 = (first + second) % third;
        return Result2;
    }

    public static int Result1(int first, int second, int third) {
        int Result1 = first + second * third;
        return Result1;
    }
}
