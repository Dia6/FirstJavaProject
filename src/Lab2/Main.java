package Lab2;

public class Main {
    public static void main(String[] args) {
        double Result1 = multiply(7,4);
        System.out.println("Rezultatul este " + Result1);

        double Result2 = divide(7.0,4.0);
        System.out.println("Rezultatul este " + Result2);

        double Result3 = modulo(7.0,4.0);
        System.out.println("Rezultatul este " + Result3);

        double Result4 = Result1 + Result2;
        System.out.println("Rezultatul este " + Result4);


    }
    public static int multiply(int first, int second){
        int multiply = first * second;
        return multiply;
    }

    public static double divide(double first, double second){
        double divide = first / second;
        return divide;
    }
    public static double modulo(double first, double second){
        double modulo = first % second;
        return modulo;
    }
    }
