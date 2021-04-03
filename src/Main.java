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

        int Result1 = Result1(-5, 8, 6);
        System.out.println("Rezultatul " + Result1);

        double resultb = (55 + 9) % 9;
        System.out.println("Rezultatul este " + resultb);

        double Result2 = Result2(55d, 9d, 9d);
        System.out.println("Rezutatul " + Result2);


        double resultc = 20 + (-3 * 5) / 8d;
        System.out.println("Rezultatul este " + resultc);

        double Result3 = Result3(20d, -3, 5, 8d);
        System.out.println("Rezultatul " + Result3);

        double resultd = 5 + 15d / 3 * 2 - 8 % 3;
        System.out.println("Rezultatul este " + resultd);

        double Result4 = Result4(5, 15d, 3, 2, 8, 3);
        System.out.println("Rezultatul " + Result4);

    }
    public static double Result4(double first, double second, double third, double forth, double fifth, double sixth){
        double Result4 = first + second / third * forth - fifth % sixth;
        return Result4;
    }
    public static double Result3(double first, double second, double third, double forth){
        double Result3 = first + (second * third) / forth;
        return Result3;
    }
    public static double Result2(double first, double second, double third){
        double Result2 = (first + second) % third;
        return Result2;
    }


    public static int Result1(int first, int second, int third){
        int Result1 = first + second * third;
        return Result1;

    }


    public static void printName(){
        System.out.println("Hello, Diana!");
    }


}
