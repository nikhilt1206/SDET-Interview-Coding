package logicbuildingrevision;

public class FindMissingNumberInArrayUsingBitwiseManipulation {
    public static void main(String[] args){
        int[] numbers = {1,2,4,5,6};
        int missingNumber=0;
        for(int num : numbers){
            missingNumber = missingNumber^num;
        }
        for(int i=0;i<=6;i++){
            missingNumber = missingNumber^i;
        }
        System.out.println("Missing Number : "+missingNumber);
    }
}
