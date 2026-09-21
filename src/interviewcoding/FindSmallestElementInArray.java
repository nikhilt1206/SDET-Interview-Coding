package interviewcoding;

public class FindSmallestElementInArray {
    public static void main(String[] args){
        int[] input = {8,5,21,11,9,2,3};
        if(input==null || input.length==0){
            System.out.println("Invalid Input!!");
            return;
        }
        int smallestNumberInArray=Integer.MAX_VALUE;
        for(int num : input){
            if(num<smallestNumberInArray){
                smallestNumberInArray=num;
            }
        }
        System.out.println(smallestNumberInArray);
    }
}
