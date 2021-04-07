package Lab3;

public class LogicalOp {

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