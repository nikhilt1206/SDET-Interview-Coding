package interviewcoding;
import java.util.Arrays;

public class FindElementsDivisibleBy2AndStoreThemInAnotherArray {
    public static void main(String[] args){
        int[] array = {10,15,8,7,22,9,14};
        int count = 0;

        for(int num : array){
            if(num % 2 == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 == 0){
                result[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
