package logicbuildingrevision;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValuesFromArrays {
    public static void main(String[] args){
        int[] a = {10,10,20,30,40};
        //Hashset - it will store the unique values and preserve their order
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : a){
            set.add(num);
        }
        System.out.println(set);
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        // :: -> method referencing
        System.out.println(Arrays.toString(result));
    }
}
