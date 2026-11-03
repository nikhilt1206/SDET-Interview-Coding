package logicbuildingrevision;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsFromListUsingFunctionalProgramming {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("How");
        list1.add("Ten");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Two");
        list2.add("Ten");
        list2.add("How");

        /*Set<String> result = list1.stream()
                .filter(x->list2.contains(x))
                .collect(Collectors.toSet());*/
        Set<String> result = list1.stream()
                        .filter(list2::contains)
                                .collect(Collectors.toSet());
        // :: -> method reference
        System.out.println(result);
    }
}

