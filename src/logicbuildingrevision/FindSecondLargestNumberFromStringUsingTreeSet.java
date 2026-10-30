package logicbuildingrevision;

import java.util.TreeSet;

public class FindSecondLargestNumberFromStringUsingTreeSet {
    public static void main(String[] args){
        String input = "abc321";
        //Set store unique values
        //TreeSet - elements will be stored in ascending order
        findSecondLargest(input);
    }

    private static void findSecondLargest(String input) {
        int num;
        TreeSet<Integer> dataSet = new TreeSet<>();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                num = c - '0';
                dataSet.add(num);
            }
        }
        dataSet.pollLast();//Retrieves and removes the last element
        System.out.println("Second largest element : "+dataSet.last());
    }
}
