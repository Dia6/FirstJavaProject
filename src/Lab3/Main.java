package Lab3;

public class Main {
    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        op.checkHigherNumber(6,9);
        System.out.println("Cel mai mare numar este " + op.checkHigherNumber(6,9));

        System.out.println(op.checkText("Fast"));

    }

}
