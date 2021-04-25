package Lab6;

import java.util.List;

public class LogicalOp {

    public int maxValueOfList(List<Integer>list){
        int max = 0;
        for(int i = 0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }return max;
    }
    
    public void showIndexOfValue(List<String> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
           index = i;
            System.out.println("For index " +index + " value is " + list.get(i));
        }
    }

    public void addValueToTopList(List<Integer> list, int value){
        list.add(0,value);

    }
    public void addValueToList(List<String> list, int value, String text){
       list.add(value, text);


    }
    public void printListFromValue(List<Integer> list, int value){
        for(int i = value; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }public void addValueToList(List<Integer> list, int value){
        list.add(value);

    }
    public void printReversedList(List<Integer> list){
        for(int i = list.size()-1; i >=0; i--){
            System.out.println(list.get(i));
        }
    }
    public void printList(List<String> list){
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
