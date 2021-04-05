package Lab2;

public class Main {
    public static void main(String[] args) {
        double Rezultat1 = multiply(7, 4);
        System.out.println("Rezultatul este " + Rezultat1);

        double Rezultat2 = divide(7.0, 4.0);
        System.out.println("Rezultatul este " + Rezultat2);

        double Rezultat3 = modulo(7.0, 4.0);
        System.out.println("Rezultatul este " + Rezultat3);

        double Rezultat4 = Rezultat1 + Rezultat2;
        System.out.println("Rezultatul este " + Rezultat4);

        int Rezultat5 = sum(7, 4);
        System.out.println("Rezultatul este " + Rezultat5);

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

        System.out.println("Rezultatul este " + adunare(3, 6));
        System.out.println("Rezultatul este " + scadere(3, 6));
        System.out.println("Rezultatul este " + inmultire(3, 6));
        System.out.println("Rezultatul este " + impartire(3, 6));


        System.out.println("Rezultatele pentru Tema 3");
        printTJava();

        System.out.println("Rezultatele pentru Tema 4");

        double mediaAritmetica = sum(2, 3, 4) / 3d;
        System.out.println(mediaAritmetica);

        System.out.println("Rezultatele pentru Tema 5");

        printRobot();

        System.out.println("Rezultatele pentru Tema 6");
        System.out.println("Rezultatul este " + rest(15f, 4f));


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

    public static void printName() {
        System.out.println("Hello, Diana!");
    }

    public static float inchToMeter(float nr) {
        float inchToMeter = nr * 0.0254f;
        return inchToMeter;
    }

    public static float tempC(float F) {
        float tempC = 5f / 9f * (F - 32f);
        return tempC;

    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }

    public static double divide(double first, double second) {
        double divide = first / second;
        return divide;
    }

    public static double modulo(double first, double second) {
        double modulo = first % second;
        return modulo;
    }

    public static float rest(float nr1, float nr2) {
        float rest = nr1 % nr2;
        return rest;

    }

    public static int sum(int nr1, int nr2, int nr3) {
        int sum = nr1 + nr2 + nr3;
        return sum;

    }

    public static int adunare(int nr1, int nr2) {
        int adunare = nr1 + nr2;
        return adunare;
    }

    public static int scadere(int nr1, int nr2) {
        int scadere = nr1 - nr2;
        return scadere;
    }

    public static int inmultire(int nr1, int nr2) {
        int inmultire = nr1 * nr2;
        return inmultire;
    }

    public static double impartire(double nr1, double nr2) {
        double impartire = nr1 / nr2;
        return impartire;
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
