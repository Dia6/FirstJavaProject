package Lab7;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercitiul 1,2");
        Read read = new Read();
        read.getInt();
        read.getFloat();
        read.getDouble();
        read.getLongNumber();

        System.out.println("Exercitiul 3");
        read.setArrayFromInput();

        System.out.println("Exercitiul 4");
        read.setListFromInput();

        System.out.println("Exercitiul 5");
        int[]array = {3,7,1,14,4,6,21,23,12,9};
        int number = read.getInt();
        LogicalOp op = new LogicalOp();
        op.showValueFromIndex(array, number);

        System.out.println("Exercitiul 6");


    }
}
