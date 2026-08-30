package interviewcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqueValuesFromList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,20,40,10));
        Set<Integer> set = new LinkedHashSet<>(list);
        //No loop is needed if we used LinkedHashSet constructor
        System.out.println(set);
    }
}
