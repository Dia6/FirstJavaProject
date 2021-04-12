package Lab4;

import Lab3.Calculator;
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


        System.out.println("Tema While Loops - Exercitiul 1");
        op.count100While(3);

        System.out.println("Tema While Loops - Exercitiul 2");
        op.countReversedWhile(3);

        System.out.println("Tema While Loops - Exercitiul 3");
        op.countIntervalWhile(3, 56);

        System.out.println("Tema While Loops - Exercitiul 4");
        op.countHigherWhile(3, 14);

        System.out.println("Tema While Loops - Exercitiul 5");
        op.countEvenWhile(0);

        System.out.println("Tema While Loops - Exercitiul 6");
        op.countOddWhile(1);

        //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
        // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
        // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
        // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        System.out.println("Tema While Loops - Exercitiul 7");
        op.countAverageWhile(111, 8899);

        //8. Creati o metoda care sa primeasca doi parametrii de tip numar,
        // si sa returneze media numerelor divizibile cu 7, din acel interval.
        // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        System.out.println("Tema While Loops - Exercitiul 8");
        op.average7d(3, 43);


        //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

        System.out.println("Tema While Loops - Exercitiul 9");

        //10. Creati o metoda numita CozaLozaWoza.
        //11 numere pe linie

        //- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7


        int no1 = 1;
        int no2 = 110;
        int i = no1;
        int count = 0;
        for (i = no1; i <= 110; i++) {
            if (i % 3 == 0) {
                System.out.println("Coza");
            } else if (i % 5 == 0) {
                System.out.println("Loza");
            } else if (i % 7 == 0) {
                System.out.println("Woza");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("CozaWoza");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("WozaLoza");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("CozaLozaWoza");
            } else
                System.out.println(i);
            count++;
        }
        System.out.println("Total numere" + count);
    }
}