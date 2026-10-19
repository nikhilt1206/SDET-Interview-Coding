package interviewcoding;

import java.util.ArrayList;

public class FlattenArray {
    public static void main(String[] args){
        //[1, [2, [3, 4], 5], 6]
        String input = "[1, [2, [3, 4], 5], 6]";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
            else{
                if(sb.length()>0){
                    int number = Integer.parseInt(sb.toString());
                    list.add(number);
                    sb.setLength(0);
                }
            }
        }
        System.out.println(list);
    }
}
