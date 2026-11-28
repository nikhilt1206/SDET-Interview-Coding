package logicbuildingrevision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionBetween2Arrays {
    public static void main(String[] args){
        //Common elements between 2 arrays
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for(int num : num1){
            set1.add(num);
        }
        for(int num : num2){
            if(set1.contains(num)){
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i=0;
        for(int num : resultSet){
            result[i]=num;
            i++;
        }
        System.out.println(Arrays.toString(result));
    }
}
