package Lab7;

public class LogicalOp {

    //         In clasa LogicalOp, creati o metoda  'wait()'.
//         Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
//         In interiorul ei, tratati metoda Thread.sleep(),
//         astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
//         Ex: wait(5) -> asteapta 5 secunde.
    public void wait(int number){
        try {
            Thread.sleep(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void showValueFromIndex(int []array, int number) {
        System.out.println("The value of entered index is: ");
            try {
                System.out.print(array[number]);
            } catch (IndexOutOfBoundsException error){
                System.out.println("Inside catch, number too large");
            }
    }

}
