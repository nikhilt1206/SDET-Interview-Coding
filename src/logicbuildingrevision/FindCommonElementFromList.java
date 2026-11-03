package logicbuildingrevision;

import java.util.ArrayList;

public class FindCommonElementFromList {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("How");
        list1.add("Ten");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Two");
        list2.add("Ten");
        list2.add("How");
        //retainAll() keeps the list of common elements in list1 and list2 in list1
        list1.retainAll(list2);
        System.out.println("Common Elements are : "+list1);
    }
}
