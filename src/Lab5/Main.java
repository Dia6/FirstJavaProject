package Lab5;

import Lab3.Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("");
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


        System.out.println();
        System.out.println("Exercitiul 2");
        //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
        // Sa se afiseze progresul in consola pe tot parcursul.
        LogicalOp op = new LogicalOp();
        int[] array2 = new int[100];
        op.setArray(array2);


        System.out.println("");
        System.out.println("Exercitiul 3");
        //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100.
        // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

        int[] array3 = new int[100];
        op.setArray(array3);
        op.evenArray(array3);

        System.out.println("");
        System.out.println("Exercitiul 4");
        //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        // Metoda sa calculeze si sa returneze media numerelor din array.
        int[] array4 = {4, 5, 7, 9};
        System.out.println(op.averageArray(array4));


        System.out.println("");
        System.out.println("Exercitiul 5");
        //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
        // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
        String[] array5 = {"Afara", "este", "soare"};
        String text = "soare";
        String text2 = "ploaie";

        System.out.println(op.isInArray(array5, text));
        System.out.println(op.isInArray(array5, text2));


        System.out.println("");
        System.out.println("Exercitiul 6");
        //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        // Metoda sa verifice daca numarul primit se afla in array-ul primit,si daca da, atunci sa returneze pozitia pe care se afla numarul.
        int[] array6 = {6, 8, 13, 5};
        int no4 = 6;
        int no5 = 11;
        int no6 = 13;
        op.isInArray(array6,no4);

        op.isInArray(array6, no5);
        op.isInArray(array6, no6);


        System.out.println("");
        System.out.println("Exercitiul 7");
        //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
        String[] array7 = {"- - - - - - - - - -"};
        op.printArrayLines(array7);


        System.out.println("");
        String[] javaP = {"   J    a  v     v  a", "   J   a a  v   v  a a", "J  J  aaaaa  v v  aaaaa", " JJ  a     a  v  a     a"};
        for (int i = 0; i < javaP.length; i++) {
            System.out.println(javaP[i]);
        }


        System.out.println("");
        System.out.println("Exercitiul 8");
        //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        // Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
        int[] array8 = {6, 5, 3, 42, 8, 4};
        int no7 = 3;
        op.skipNoInArray(array8, no7);


        System.out.println("");
        System.out.println("Exercitiul 9");
        //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
        int[] array9 = {3, 7, 11, 16, 6};
        System.out.println( op.secondSmallestNumber(array9));


        System.out.println("");
        System.out.println("Exercitiul 10");
        //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
        // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
        int[] array10 = {3, 5, 9, 11, 6, 10, 12};
        int[] array11 = new int[array9.length];
        System.out.println("Valorile din noul array sunt ");
        op.copyArrayValues(array10, array11);

        System.out.println("");
        System.out.println("Tema Arrays optionala - Exercitiul 1");
        //1. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.

        int[] arr1 = {2, 5, 8, 7};
        int no = 6;
        int ind1 = 1;
        op.insertElement(arr1, no, 1);
        op.printArray(arr1);


        System.out.println("");
        System.out.println("Tema Arrays optionala - Exercitiul 2");
        //2. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
        int[] arr2 = {7, 89, 21, 4, 123, 7, 14};
        op.findMinMax(arr2);


        System.out.println("");
        System.out.println("Tema Arrays optionala - Exercitiul 3");
        //3. Creati o metoda care sa inverseze valorile unui array de int-uri.
        int[] arr3 = {3, 6, 12, 8, 9};
        op.printReversedArray(arr3);

        System.out.println("");
        System.out.println("Tema Arrays optionala - Exercitiul 4");
        //4. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
        int[] arr4 = {3, 6, 8, 6, 7, 3, 2, 8, 9};
        op.showDuplicate(arr4);

        System.out.println("");
        System.out.println("Tema Arrays optionala - Exercitiul 5");
        //5. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).
        String[] arr5 = {"afara", "soare", "fructe", "inghetata"};
        String[] arr6 = {"alune", "soare", "ciocolata", "inghetata"};
        op.duplicateStringValues(arr5, arr6);


        System.out.println("");
        System.out.println("Tema Arrays optionala - Exercitiul 6");
        //6. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.

        int[] arr7 = {7, 89, 21, 4, 123, 72, 6, 14};
        op.sortAscendingArray(arr7);


    }
}
