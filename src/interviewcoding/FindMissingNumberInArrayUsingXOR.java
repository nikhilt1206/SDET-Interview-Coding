package interviewcoding;

public class FindMissingNumberInArrayUsingXOR {
    public static void main(String[] args){
        int[] input = {1,2,3,4,6};
        if(input==null || input.length==0){
            System.out.println("Invalid input!!");
            return;
        }
        int missingNumber=0;
        for(int num : input){
            missingNumber=missingNumber^num;
        }
        for(int i=1;i<=input.length+1;i++){
            missingNumber=missingNumber^i;
        }
        System.out.println(missingNumber);
    }
}
