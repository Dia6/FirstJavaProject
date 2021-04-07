package Lab3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercitiul 3");

        LogicalOp op = new LogicalOp();
        op.checkHigherNumber(6,9);
        System.out.println("Cel mai mare numar este " + op.checkHigherNumber(6,9));

        System.out.println("Exercitiul 4");

        System.out.println(op.checkText("Fast"));

        System.out.println("Exercitiul 5");

        System.out.println(op.checkTextAndNumber("FatsTrackIT", 5));

        System.out.println("Exercitiul 6");

        System.out.println(op.checkSnow(6));

        System.out.println("Exercitiul 7");

        System.out.println(op.checkNumber(4));

        System.out.println("Exercitiul 8");

        op.showNumber();

        System.out.println("Exercitiul 9");

        op.isNumberEven(6);

    }

}
