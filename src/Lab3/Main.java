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

        op.isEvenNumber(6);
        op.isEvenNumber(17);

        System.out.println("Exercitiul 10");

        op.isEligibleToVote(23);
        op.isEligibleToVote(16);
        op.isEligibleToVote(18);

        System.out.println("Exercitiul 11");

        op.isHighestNumber(3,7,20);
        op.isHighestNumber(3,3,7);
        op.isHighestNumber(3,7,7);
        op.isHighestNumber(21,21,21);
        op.isHighestNumber(21,24,25);
    }

}
