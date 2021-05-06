package Lab7;

import Lab5.LogicalOp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

    public List<Integer> setListFromInput() {
        int inputNumber = 0;
        List<Integer> list = new ArrayList<>();
        boolean repeat = true;
        Lab6.LogicalOp op = new Lab6.LogicalOp();
        do {
            try {
                System.out.print("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                inputNumber = scan.nextInt();
                op.addValueToList(list, inputNumber);
                System.out.println(list);
            } catch (InputMismatchException error){
                repeat = false;
                System.out.println("Entered value is not a valid number! Try again!");
            }
        }while (repeat);
        return list;
    }

    public int[] setArrayFromInput(){
        int inputNumber = getInt();
        int[] array = new int[inputNumber];
        LogicalOp op = new LogicalOp();
        op.setArray(array);
        op.printArray(array);
        return array;
    }

    public int getInt(){
        int inputNumber = 0;
        boolean repeat = false;
        do{
            System.out.print("Enter a number: ");
            try{
                Scanner scan = new Scanner(System.in);
                inputNumber = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException error){
                repeat = true;
                System.out.println("Entered value is not a number. Please enter a valid number!");
            }
        }while (repeat);
        return inputNumber;
    }
    public float getFloat(){
        float inputNumber = 0;
        boolean repeat = false;
        do{
            System.out.print("Enter a number: ");
            try{
                Scanner scan = new Scanner(System.in);
                inputNumber = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException error){
                repeat = true;
                System.out.println("Entered value is not a number. Please enter a valid number!");
            }
        }while (repeat);
        return inputNumber;
    }
    public double getDouble(){
        double inputNumber = 0;
        boolean repeat = false;
        do{
            System.out.print("Enter a number: ");
            try{
                Scanner scan = new Scanner(System.in);
                inputNumber = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException error){
                repeat = true;
                System.out.println("Entered value is not a number. Please enter a valid number!");
            }
        }while (repeat);
        return inputNumber;
    }
    public long getLongNumber(){
        long inputNumber = 0;
        boolean repeat = false;
        do{
            System.out.print("Enter a number: ");
            try{
                Scanner scan = new Scanner(System.in);
                inputNumber = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException error){
                repeat = true;
                System.out.println("Entered value is not a number. Please enter a valid number!");
            }
        }while (repeat);
        return inputNumber;
    }
}
