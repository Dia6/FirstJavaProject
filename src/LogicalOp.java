public class LogicalOp {

    int first;
    int second;
    String text;

    public void verifyText( String text) {
        if (text.equals("FastTrackIT")){
            System.out.println("Learning text comparison");
        } else {
            System.out.println("Got to try some more");
        }

    }
    public int checkHigherNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}