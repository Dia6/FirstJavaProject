package Lab3;

public class Calculator {
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // etoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).


    public float average(int no1, int no2, int no3) {
        float average = (no1 + no2 + no3) / 3f;
        return average;
    }
    public int subtract(int first, int second) {
        int subtract = first - second;
        return subtract;
    }
    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }
    public float divide(float first, float second) {
        float divide = first / second;
        return divide;
    }
    public float modulo(float first, float second) {
        float modulo = first % second;
        return modulo;
    }

}
