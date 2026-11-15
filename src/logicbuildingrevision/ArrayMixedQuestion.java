package logicbuildingrevision;

import java.util.Arrays;

public class ArrayMixedQuestion {
    public static void main(String[] args){
        //Calculate total sum of all the elements
        int a[] = {4,5,10,3,7};
        int totalSum=0;
        int totalNumberOfElements=a.length;
        for(int num : a){
            totalSum = totalSum+num;
        }
        double avg = ((double)totalSum)/totalNumberOfElements;
        System.out.println("Total Sum : "+totalSum);
        System.out.println("Average : "+avg);
        //Largest and Second-Largest number
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }
            else{
                if(a[i]>secondLargest && a[i]!=largest){
                    secondLargest=a[i];
                }
            }
        }
        System.out.println("Largest : "+largest+" Second Largest : "+secondLargest);
        //Reverse first half of the array
        int mid = a.length/2;
        int left = 0;
        int right = mid-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}
