package logicbuildingrevision;

import java.util.Arrays;

public class RotateAnArrayLeft {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int n = 4;
        int k = n%a.length;
        int left = 0;
        int right = a.length-1;
        a = reverseArrayleft(a,0,k-1);
        a = reverseArrayleft(a,k,a.length-1);
        a = reverseArrayleft(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static int[] reverseArrayleft(int[] a, int left, int right) {
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
       return a;
    }

}
