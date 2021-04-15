package Lab5;

import Lab3.Calculator;
import Lab3.LogicalOp;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Exercitiul 1");

        System.out.println(calc.sum(2, 6));
        System.out.println(calc.sum(4f, 12.6f));
        System.out.println(calc.sum(4, 8, 19));
        System.out.println(calc.sum(3.4f, 5.8f, 3.7f));

        System.out.println(calc.subtract(17.5f, 13f));
        System.out.println(calc.subtract(17.5f, 13f, 41.2f));
        System.out.println(calc.subtract(13f, 41f));
        System.out.println(calc.subtract(13, 7));

        System.out.println(calc.average(6, 9));
        System.out.println(calc.average(6, 9, 14));
        System.out.println(calc.average(3.5f, 6.3f));
        System.out.println(calc.average(4.4f, 2, 5.7f));

        System.out.println(calc.divide(18, 7));
        System.out.println(calc.divide(89, 4, 5));
        System.out.println(calc.divide(98, 4.5f, 2f));

        System.out.println(calc.modulo(167, 2));
        System.out.println(calc.modulo(18.5f, 2.2f));

        System.out.println(calc.multiply(2.5f, 4, 2.4f));
        System.out.println(calc.multiply(4, 7, 9));


        System.out.println("Exercitiul 2");
        LogicalOp op = new LogicalOp();
        int[] array1 = new int[100];
        op.setArray(array1);

        System.out.println("Exercitiul 3");
        int[] array2 = new int[100];
        op.evenArray(array2);

        System.out.println("Exercitiul 4");
        int[] array3 = {4, 5, 7, 9};
        System.out.println(op.averageArray(array3));


        System.out.println("Exercitiul 5");
        String[] array4 = {"Afara", "este", "soare"};
        System.out.println(op.isInArray(array4, "soare"));
        System.out.println(op.isInArray(array4, "ploaie"));


        System.out.println("Exercitiul 6");

        int[] array5 = {6, 8, 13, 5};
        op.isInArray(array5, 13);
        op.isInArray(array5, 11);
        op.isInArray(array5, 6);

        System.out.println("Exercitiul 7");
        String[] array6 = {"- - - - - - - - - - "};
        op.printArrayLines(array6);

        System.out.println("Exercitiul 8");

        int[] array7 = {6, 5, 3, 42, 8, 4};
        op.skipNoInArray(array7, 3);

        System.out.println("Exercitiul 9");
        int[] array8 = {3, 7, 11, 2, 6};
        int min2 = 0;
        for (int i = 0; i < array8.length; i++) {
            for (int j = i + 1; j < array8.length; j++) {
                if (array8[j] > array8[i]) {
                    min2 = array8[i];
                    array8[i] = array8[j];
                    array8[j] = min2;

                }

            }

        }System.out.println(min2);


        System.out.println("Exercitiul 10");
        int[] array9 = {3, 5, 6, 10, 12};
        int[] array10 = new int[array9.length];
        System.out.println("Valorile din noul array sunt ");
        op.copyArrayValues(array9, array10);
    }
}
