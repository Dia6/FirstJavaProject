package Lab3;

public class Calculator {

    public float average(int no1, int no2, int no3) {
        float average = (no1 + no2 + no3) / 3f;
        return average;
    }
    public float average(float no1, float no2){
        float average = (no1 + no2) / 2f;
        return average;
    }
    public float average(float no1, float no2, float no3){
        float average = (no1 + no2 + no3) / 3f;
        return average;
    }
    public float average(int no1, int no2){
        float average = (no1 + no2) / 2f;
        return average;
    }
    public int subtract(int first, int second) {
        int subtract = first - second;
        return subtract;
    }
    public int subtract(int first,int second, int third){
        int subtract = first - second- third;
        return subtract;

    }
    public float subtract(float first,float second, float third) {
        float subtract = first - second - third;
        return subtract;
    }
    public float subtract(float first,float second) {
        float subtract = first - second;
        return subtract;
    }
    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public int sum(int first, int second, int third) {
        int sum = first + second+third;
        return sum;
    }
    public float sum(float first, float second) {
        float sum = first + second;
        return sum;
    }
    public float sum(float first, float second, float third) {
        float sum = first + second + third;
        return sum;
    }
    public int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }
    public float multiply(float first, float second) {
        float multiply = first * second;
        return multiply;
    }
    public int multiply(int first, int second, int third) {
        int multiply = first * second * third;
        return multiply;
    }
    public float multiply(float first, float second, float third) {
        float multiply = first * second * third;
        return multiply;
    }
    public float divide(float first, float second) {
        float divide = first / second;
        return divide;
    }
    public float divide(float first, float second, float third) {
        float divide = first / second / third;
        return divide;
    }
    public float divide(int first, int second) {
        float divide = first / second;
        return divide;
    }
    public float divide(int first, int second, int third) {
        float divide = first / second / third;
        return divide;
    }

    public float modulo(float first, float second) {
        float modulo = first % second;
        return modulo;
    }
    public float modulo(float first, float second, float third) {
        float modulo = first % second % third;
        return modulo;
    }
    public int modulo(int first, int second) {
        int modulo = first % second;
        return modulo;
    }
    public int modulo(int first, int second, int third) {
        int modulo = first % second % third;
        return modulo;
    }


}
