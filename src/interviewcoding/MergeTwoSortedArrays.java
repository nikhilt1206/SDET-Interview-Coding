package interviewcoding;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args){
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8};
        if(a==null || b==null || a.length == 0 || b.length ==0){
            System.out.println("Invalid input!!");
            return;
        }
        int[] c = new int[a.length+b.length];
        int i=0;
        int j=0;
        int nextPosition=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[nextPosition]=a[i];
                nextPosition++;
                i++;
            }
            else{
                c[nextPosition]=b[j];
                nextPosition++;
                j++;
            }
        }
        while(i<a.length){
            c[nextPosition]=a[i];
            nextPosition++;
            i++;
        }
        while(j<b.length){
            c[nextPosition]=b[j];
            nextPosition++;
            j++;
        }
        System.out.println(Arrays.toString(c));
    }
}
