package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercitiul 1");
        //Scrieti o metoda Java, care sa primeasca parametru o Lista,
        // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
        LogicalOp op = new LogicalOp();
        List<String> list1 = new ArrayList<>();
        list1.add("soare");
        list1.add("vara");
        list1.add("frumos");
        list1.add("cald");
        list1.add("inghetata");

        op.printList(list1);


        System.out.println("");
        System.out.println("Exercitiul 2");
        //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
        // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(14);
        list2.add(23);
        list2.add(11);
        list2.add(6);
        list2.add(3);
        op.addValueToList(list2,27);
        System.out.println(list2);


        System.out.println("");
        System.out.println("Exercitiul 3");
        //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
        // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
        // pornind de la numarul intreg primit ca si parametru.
        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(22);
        list3.add(6);
        list3.add(3);
        list3.add(11);
        list3.add(13);
        list3.add(16);
        list3.add(9);

        op.printListFromValue(list3, 3);

        System.out.println("");
        System.out.println("Exercitiul 4");
        //Scrieti o metoda Java, care sa primeasca parametru o Lista,
        // si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
        op.printReversedList(list3);


        System.out.println("");
        System.out.println("Exercitiul 5");
        //Scrieti o metoda Java, care sa primeasca trei parametri:
        // unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
        // Metoda sa adauge parametrul de tip String in lista primita,
        // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
        List<String> list5 = new ArrayList<>();
        list5.add("soare");
        list5.add("vara");
        list5.add("frumos");
        list5.add("cald");
        list5.add("inghetata");
        op.addValueToList(list5, 2,"ploua");
        System.out.println(list5);


        System.out.println("");
        System.out.println("Exercitiul 6");
        //Scrieti o metoda Java, care sa primeasca doi parametri.
        // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru
        // si sa il adauge pe prima pozitie din lista.

        List<Integer> list6 = new ArrayList<>();
        list6.add(3);
        list6.add(6);
        list6.add(9);
        list6.add(12);
        list6.add(15);

        op.addValueToTopList(list6,2);
        System.out.println(list6);

        System.out.println("");
        System.out.println("Exercitiul 7");
        //Scrieti o metoda Java care sa primeasca parametru o Lista,
        // si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
        op.showIndexOfValue(list5);


        System.out.println("");
        System.out.println("Exercitiul 7");
        //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
        List<Integer>list7 = new ArrayList<>();
        list7.add(1);
        list7.add(24);
        list7.add(12);
        list7.add(3);
        list7.add(6);
        list7.add(15);

        System.out.println(op.maxValueOfList(list7));









    }
}
