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
        int[] array = new int[100];
        op.printArray(array);

        System.out.println("Exercitiul 3");
        int[] array2 = new int[100];
        op.evenArray(array2);

        System.out.println("Exercitiul 4");
        int[] array3 = {1, 2, 3, 4};


        System.out.println("Exercitiul 5");
        String[] array4 = {"Afara", "este", "soare"};
        System.out.println(op.isInArray(array4, "soare"));
        System.out.println(op.isInArray(array4, "ploaie"));

        //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori si un parametru de tip numar.
        // Metoda sa verifice daca numarul primit se afla in array-ul primit,
        // si daca da, atunci sa returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println("Exercitiul 6");
        int[] array5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int no = 4;
        op.indexOfArray(array5);
        //mai departe m-am blocat

        System.out.println("Exercitiul 7");

        String[] array6 = {"- - - - - - - - - - "};
        op.printArrayLines(array6);

        System.out.println("Exercitiul 8");

        //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        // Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int[] array7 = {1, 2, 3, 4, 5, 6};
        int no2 = 3;
        int i = 1;

        for (i = 1; i <= array7.length; i++){
            System.out.println(i);

            if (array7[i] == 3)
                break;
            }i++;

    }
}
