package interviewcoding;

public class FindMissingNumberInArray {
    public static void main(String[] args){
        int[] input = {1,2,3,4,6};
        if(input==null || input.length==0){
            System.out.println("Invalid input!!");
            return;
        }
        int n = input.length+1;
        int sumOfSeries = (n*(n+1))/2;
        int sumOfArray=0;
        for(int num : input){
            sumOfArray+=num;
        }
        System.out.println("Missing number: "+(sumOfSeries-sumOfArray));
    }
}
