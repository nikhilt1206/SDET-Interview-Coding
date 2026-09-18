package logicbuildingrevision;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args){
        int[] input = {2,11,7,5};
        int target = 9;
        int[] result = calculateTwoSum(input,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] calculateTwoSum(int[] input, int target) {
        Map<Integer,Integer> map = new LinkedHashMap<>(); //to store the array element and it's index
        //Complement = target - input[index]
        int complement;
        for(int i=0;i<input.length;i++){
            complement = target - input[i];
            if(map.containsKey(complement)){
                int[] result = {map.get(complement),i};
                return result;
            }
            map.put(input[i],i);
        }
        return null;
    }
}
