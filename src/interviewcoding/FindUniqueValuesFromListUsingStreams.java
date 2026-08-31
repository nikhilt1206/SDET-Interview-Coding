package interviewcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueValuesFromListUsingStreams {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,20,40,10));
        List<Integer> uniqueValues = list.stream().distinct().toList();
        System.out.println(uniqueValues);
    }
}