import Lab3.Calculator;
import Lab3.LogicalOp;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello");
        System.out.println("Diana");

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

        Calculator calculator = new Calculator();

        int Rezultat1 = calculator.multiply(7, 4);
        System.out.println("Rezultatul este " + Rezultat1);

        float Rezultat2 = calculator.divide(7.0f, 4.0f);
        System.out.println("Rezultatul este " + Rezultat2);

        float Rezultat3 = calculator.modulo(7f, 4f);
        System.out.println("Rezultatul este " + Rezultat3);

        float Rezultat4 = Rezultat1 + Rezultat2;
        System.out.println("Rezultatul este " + Rezultat4);

        int Rezultat5 = calculator.sum(7, 4);
        System.out.println("Rezultatul este " + Rezultat5);

    }

}

