package Lab3;

public class LogicalOp {

    public void isHighestNumber(int no1, int no2, int no3) {
        if (no1 >= no2 && no1 >= no3) {
            System.out.println("The highest number is " + no1);
        } else if (no2 >= no1 && no2 >= no3) {
            System.out.println("The highest number is " + no2);
        } else if (no3 >= no1 && no3 >= no2) {
            System.out.println("The highest number is " + no3);
        } else {
            System.out.println("Hopa");
        }
    }

    public void isEligibleToVote(int number) {
        if (number >= 18) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public void isEvenNumber(int number) {
        if ((number % 2) == 0) {
            System.out.println("True");
        } else if ((number % 2) != 0 ) {
            System.out.println("False");
        }
    }
    public void showNumber() {
        int showNumber = 6;
        switch (showNumber) {
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 7:
                System.out.println("The number is: 7!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 9:
                System.out.println("The number is: 9!");
                break;
            case 10:
                System.out.println("The number is: 10!");
                break;
        }
    }

    public String checkNumber(int number) {
        if ( number >= 3 && number != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            return ("The number is equal to 4");
        } else if (number < 3) {
            return ("The number is lower than 3");
        }
        return "None";
    }

    public String checkSnow(int number) {
        if (number >= 8 || number == 6){
            return ("The amount of snow this winter was(cm):" + number);
        } else {
            return ("The forecast snow is(cm) " + number);
        }

    }

    public String checkTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + number);
        } else {if (!text.equals("FastTrackIT") && number >= 4)
            return (number + text);
        }
        return "None";
    }

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return ("Got to try some more");
        }
    }

    public int checkHigherNumber(int first, int second) {
        if (first > second) {
            return first;
        } else{
            return second;
        }
    }
}