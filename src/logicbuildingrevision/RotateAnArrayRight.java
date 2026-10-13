package logicbuildingrevision;

import java.util.Arrays;

public class RotateAnArrayRight {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        //Rotate the array by k positions (clockwise)
        int n = 3;
        int k = n % a.length; //k has to fit inside 0-6 (array length)
        //{7,1,2,3,4,5,6} -> {6,7,1,2,3,4,5} -> {5,6,7,1,2,3,4} (Rotated by 3 times right)
        int left = 0;
        int right = a.length-1;
        a = reverseArray(a,left,right);
        a = reverseArray(a,0,k-1);
        a = reverseArray(a,k,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static int[] reverseArray(int[]a, int left, int right) {
        int temp;
        while(left<right){
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }
}
