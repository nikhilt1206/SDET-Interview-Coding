package logicbuildingrevision;

import java.util.Arrays;

public class MoveAllZeroesAtTheEnd {
    public static void main(String[] args){
        int[] array = {1,0,2,0,3,0};
        int putNonZeroValueHere=0;
        int temp;
        for(int current=0;current<=array.length-1;current++){
            if(array[current]!=0){
                temp = array[putNonZeroValueHere];
                array[putNonZeroValueHere]=array[current];
                array[current]=temp;
                putNonZeroValueHere++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
