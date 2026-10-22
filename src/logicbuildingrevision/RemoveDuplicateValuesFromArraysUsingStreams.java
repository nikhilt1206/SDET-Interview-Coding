package logicbuildingrevision;

import java.util.Arrays;

public class RemoveDuplicateValuesFromArraysUsingStreams {
    public static void main(String[] args){
        int[] a = {10,10,20,30,40};
        a = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(a));
    }
}
