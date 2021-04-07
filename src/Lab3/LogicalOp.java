package Lab3;

public class LogicalOp {


    //Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void isNumberEven(int number) {
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