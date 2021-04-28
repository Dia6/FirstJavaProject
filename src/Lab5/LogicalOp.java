package Lab5;

public class LogicalOp {

    public int secondSmallestNumber(int[]array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = i+1; j< array.length; j++){
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }return array[1];

    }
    public int[] sortAscendingArray(int[]array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = i+1; j< array.length; j++){
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.println(array[i]);
        }return array;
    }
    public void findMinMax(int[]array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }else if (array[i] > max) {
                max = array[i];
            }
        }System.out.println("Minimum value in array is " + min);
        System.out.println("Maximum value in array is " + max);
    }
    public void duplicateStringValues(String []array1, String[] array2){
        for (int i = 0; i< array1.length; i++)
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j]))
                    System.out.println(array2[j]);
            }
    }
    public void showDuplicate(String[]array){
        for (int i = 0; i< array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]))
                    System.out.println(array[j]);
            }
        }

    }
    public void showDuplicate(int[]array){
        for (int i = 0; i< array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }

    }
    public int[] insertElement(int[]array, int value,int index){
        array[index] = value;
        for (int i = 0; i < array.length; i++) {
            index = i;
        }return array;

    }
    public int[] copyArrayValues(int[] arr1, int[] arr2) {
        arr2 = arr1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);
        }return arr2;

    }
    public int minNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public int[] skipNoInArray(int[] array, int no1) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == no1) {
                continue;
            }
            System.out.println(array[i]);
        }
        return array;
    }
    public int indexOfArray(int[] array) {
        int index = 0;
        for (int i = 0; i <= array.length; i++) {
            index = i;
        }
        return index;
    }
    public boolean isInArray(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(text)) {
                return true;
            }
        }
        return false;
    }
    public void isInArray(int[] array, int no) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index = i - 1;
            if (array[i] == (no)) {
                index++;
                System.out.println("Array index of entered number is " + index);
            }
        }
    }
    public void setArray(int[]array){
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

    }
    public int[] evenArray(int[]evenArray){
        for (int i = 0; i < evenArray.length; i++){
            if (evenArray[i] % 2 == 0) {
                System.out.println(evenArray[i]);
            }
        }
        return evenArray;
    }

    public void printArray(int[]array){
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void printReversedArray(String[]array){
        for (int i = array.length-1; i >=0; i--){
            System.out.println(array[i]);
        }
    }
    public void printReversedArray(int[]array){
        for (int i = array.length-1; i >=0; i--){
            System.out.println(array[i]);
        }
    }
    public void printArrayLines(String[]array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            {
                for (j = i; j <= 9; j++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
    public float averageArray(int[]array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        float average = sum/(float)array.length;
        return average;
    }

}
