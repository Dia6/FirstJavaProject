package Lab6;

import java.util.ArrayList;
import java.util.List;

public class LogicalOp {


//    public List<Integer> swapValuesByIndex(List<Integer> list, int index1, int index2 ) {
//        int temp = index1;
//        for (int i = index1; i < list.size(); i++) {
//            for(int j = index2; j< list.size();j++) {
//                if (i == index1) {
//                    index1=index2;
//                    index2 = i;
//                    list.set(index1, list.get(i));
//                }
//                if (j == index2) {
//                    index2 = index1;
//                    index1 = j;
//                    list.set(index2, list.get(j));
//                }
//            }
//        }return list;
//    }
    public List<Integer> swapValues(List<Integer> list, int value1, int value2 ) {
        for (int i = 0; i < list.size(); i++) {
            if (value1 == list.get(i) ) {
                list.set(i, value2);
                continue;
            }
            if (value2 == (list.get(i))){
                list.set(i,value1);
            }
        }return list;
    }
    public List<Integer>sortAscendList(List<Integer>list){
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for(int j = i+1; j< list.size(); j++){
                if (list.get(i) > list.get(j)) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
            System.out.println(list.get(i));
        }return list;
    }
    public List<Integer>evenList(List<Integer>listA){
        List<Integer>evenList = new ArrayList<>();
        for(int i = 1; i <listA.size();i++){
            if (listA.get(i) %2==0){
                evenList.add(listA.get(i));
            }
        }return evenList;
    }
    public List<Integer> setListValues(int number){
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i <number; i++){
            list.add(i);
        }
        return list;
    }
    public int maxValueOfList(List<Integer>list){
        int max = 0;
        for(int i = 0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }return max;
    }
    public void showIndexOfValue(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("For index " +i + " value is " + list.get(i));
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
