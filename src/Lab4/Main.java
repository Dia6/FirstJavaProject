package Lab4;

import Lab3.LogicalOp;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        System.out.println("Exercitiul 1");
        op.countTo100(13);

        System.out.println("Exercitiul 2");
        op.countFrom100(13);

        System.out.println("Exercitiul 3");
        op.showInterval(6, 154);

        System.out.println("Exercitiul 4");
        op.showLowerToHigher(19, 4);
        op.showLowerToHigher(10, -17);

        System.out.println("Exercitiul 5");

        op.showEvenNumbers(100);

        System.out.println("Exercitiul 6");

        op.showOddNumbers(100);

        System.out.println("Exercitiul 7");

        op.countIntervalNumbers(3, 100);

        System.out.println("Exercitiul 8");

        op.averageIntervalNumbers(3, 100);

        System.out.println("Exercitiul 9");

        op.printPattern();

    }
}